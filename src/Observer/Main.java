package Observer;

public class Main {


    public static void main(String[] args){


        WeatherStation weatherStation = new WeatherStation();


        WeatherDisplay obs1 = new WeatherDisplay();
        TempDisplay obs2 = new TempDisplay();
        HumidityDisplay obs3 = new HumidityDisplay();
        PressureDIsplay obs4 = new PressureDIsplay();


        weatherStation.registerObserver(obs1);
        weatherStation.registerObserver(obs2);
        weatherStation.registerObserver(obs3);
        weatherStation.registerObserver(obs4);
        weatherStation.setWeatherData(new WeatherData(123, "fe", 1212.2));
        weatherStation.setWeatherData(new WeatherData(55, "pipi", 1315.2));
        weatherStation.setWeatherData(new WeatherData(98, "didi", 2.2));


    }
}
