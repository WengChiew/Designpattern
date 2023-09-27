package State;

public class YellowState implements State{


    private TrafficLight trafficLight;

    public YellowState(TrafficLight trafficLight){
        this.trafficLight = trafficLight;
    }

    @Override
    public void changeLight() {
        System.out.println("Changing light to Red. ");
        trafficLight.setCurrentState( new RedState(trafficLight));
    }

    @Override
    public Integer getDuration() {
        return  20;
    }
}
