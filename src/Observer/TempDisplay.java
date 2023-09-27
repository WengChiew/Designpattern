package Observer;

public class TempDisplay implements Observer{

    WeatherData weatherData;
    @Override
    public void update(WeatherData weatherData) {
        System.out.println("The temperature just got updated my dude. ");
        System.out.println("Temperature: " + weatherData.getTemperature());
    }
}
