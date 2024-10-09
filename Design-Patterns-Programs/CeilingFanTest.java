// Undo Command to Test Ceiling Fan

class CeilingFan {
    void high() {
        System.out.println("Ceiling fan is on HIGH");
    }

    void off() {
        System.out.println("Ceiling fan is OFF");
    }
}

interface Command {
    void execute();
    void undo();
}

class CeilingFanHighCommand implements Command {
    CeilingFan ceilingFan;

    CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        ceilingFan.high();
    }

    public void undo() {
        ceilingFan.off();
    }
}

class RemoteControl {
    Command slot;

    void setCommand(Command command) {
        slot = command;
    }

    void buttonWasPressed() {
        slot.execute();
    }

    void undoButtonWasPressed() {
        slot.undo();
    }
}

public class CeilingFanTest {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        CeilingFan ceilingFan = new CeilingFan();

        CeilingFanHighCommand fanHigh = new CeilingFanHighCommand(ceilingFan);

        remote.setCommand(fanHigh);
        remote.buttonWasPressed();
        remote.undoButtonWasPressed();
    }
}
