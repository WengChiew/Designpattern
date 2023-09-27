package Observer;

public class HumidityDisplay implements Observer{

    @Override
    public void update(WeatherData weatherData) {
        System.out.println("The humidity just got updated my dude. ");
        System.out.println("Humidity: " + weatherData.getHumidity());
    }
}
