package Observer;

public class PressureDIsplay implements Observer{

    @Override
    public void update(WeatherData weatherData) {
        System.out.println("The pressure just got updated my dude. ");
        System.out.println("Pressure: " + weatherData.getPressure());
    }
}
