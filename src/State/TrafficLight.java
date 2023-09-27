package State;

public class TrafficLight {

    private State currentState;
    private Timer timer;

    private PedestrianLight pedestrianLight;

    public TrafficLight(){
        this.currentState = new GreenState(this);
        timer = new Timer();
        pedestrianLight = new PedestrianLight();
    }


    public void run(){
        while(true) {
            timer.tick();
            timer.tock();
            timer.sleep(currentState.getDuration());
            changeLight();
        }
    }

    public void setCurrentState(State state){
        this.currentState = state;
    }

    public void changeLight(){
        this.currentState.changeLight();
        if(this.currentState instanceof GreenState){
            pedestrianLight.showWalkSignal();
        } else {
            pedestrianLight.showDoNotWalkSignal();
        }
    }

    public void getDuration(){
        this.currentState.getDuration();
    }


}
