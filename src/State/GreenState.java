package State;


import java.time.Duration;

public class GreenState implements State{


    private TrafficLight trafficLight;

    Duration duration;
    public GreenState(TrafficLight trafficLight){
        this.trafficLight = trafficLight;
    }



    @Override
    public void changeLight() {
        System.out.println("Changing light to Yellow. ");
        trafficLight.setCurrentState( new YellowState(trafficLight));
    }

    @Override
    public Integer getDuration() {
        return 20;
    }
}
