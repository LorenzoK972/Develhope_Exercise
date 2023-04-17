package Develhope_Exercise.OOP_Advanced2._2;

public class Boat implements Movable {
    @Override
    public String moveForward() {
        return "The boat moves forward";
    }

    @Override
    public String moveBackward() {
        return "The boat moves backward";
    }
}
