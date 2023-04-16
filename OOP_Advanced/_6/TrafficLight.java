package Develhope_Exercise.OOP_Advanced._6;
public enum TrafficLight {
    RED(false, true),
    YELLOW (true, true),
    GREEN (true, false);


    private Boolean rightOfWay;
    private Boolean stop;

    TrafficLight(Boolean rightOfWay, Boolean stop) {
        this.rightOfWay = rightOfWay;
        this.stop = stop;
    }
    public Boolean getRightOfWay() {
        return rightOfWay;
    }
    public Boolean getStop() {
        return stop;
    }
}
