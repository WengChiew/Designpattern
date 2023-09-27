package Observer;

public class WeatherDisplay implements Observer{

    @Override
    public void update(WeatherData weatherData) {
        System.out.println("Weather updated");
    }
}
