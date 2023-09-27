package Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation{

    private WeatherData weatherData;

    List<Observer> observers;

    public WeatherStation(){
        observers = new ArrayList<>();
        weatherData = new WeatherData(1.2, "Yes", 12);
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removerObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObserver() {
        for (Observer obs: observers) {
            obs.update(this.weatherData);
        }
    }



    public void setWeatherData(WeatherData weatherData){
        this.weatherData = weatherData;
        notifyObserver();
    }
}
