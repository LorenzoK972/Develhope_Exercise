package Develhope_Exercise.OOP_Advanced._6;
public enum TrafficLight {
    RED,
    YELLOW,
    GREEN;


    private Boolean rightOfWay;
    private Boolean stop;
    public Boolean getRightOfWay() {
        return rightOfWay;
    }
    public Boolean getStop() {
        return stop;
    }

    public static void TrafficLight (TrafficLight trafficLight) {
        switch (trafficLight) {
            case RED -> System.out.println("RED: Stop before the line! \n Next state: GREEN");
            case YELLOW -> System.out.println("YELLOW: Clear the road!\n Next state: RED");
            case GREEN -> System.out.println("GREEN: Go!\n Next state: YELLOW");
        }
    }
}
