package Develhope_Exercise.OOP_Advanced2._2;

public class Car implements Movable{
    @Override
    public String moveForward() {
        return "The car moves forward";
    }

    @Override
    public String moveBackward() {
        return "The car moves backward";
    }
}
