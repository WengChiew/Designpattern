package Observer;

public class WeatherData{

    private double temperature;
    private String humidity;

    private double pressure;

    public WeatherData(double temp, String humidity, double pressure){
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public double getTemperature() {
        return temperature;
    }

    public String getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }
}
