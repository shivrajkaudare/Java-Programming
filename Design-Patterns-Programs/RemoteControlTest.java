//Command Pattern for Testing Remote Control


interface Command {
    void execute();
}

class Light {
    void on() {
        System.out.println("Light is ON");
    }

    void off() {
        System.out.println("Light is OFF");
    }
}

class LightOnCommand implements Command {
    Light light;

    LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}

class LightOffCommand implements Command {
    Light light;

    LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }
}

class SimpleRemoteControl {
    Command slot;

    void setCommand(Command command) {
        slot = command;
    }

    void buttonWasPressed() {
        slot.execute();
    }
}

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();

        remote.setCommand(new LightOnCommand(light));
        remote.buttonWasPressed();

        remote.setCommand(new LightOffCommand(light));
        remote.buttonWasPressed();
    }
}

