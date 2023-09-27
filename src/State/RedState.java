package State;

public class RedState implements State{


    private TrafficLight trafficLight;

    public RedState(TrafficLight trafficLight){
        this.trafficLight = trafficLight;
    }

    @Override
    public void changeLight() {
        System.out.println("Changing light to Green. ");
        trafficLight.setCurrentState( new GreenState(trafficLight));
    }

    @Override
    public Integer getDuration() {
        return 20;
    }
}
