import java.util.Observable;

class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurement(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        weatherData.setMeasurement(25.0f, 65.0f, 1013.1f);
        System.out.println("Temperature: " + weatherData.getTemperature());
        System.out.println("Humidity: " + weatherData.getHumidity());
        System.out.println("Pressure: " + weatherData.getPressure());
    }
}
