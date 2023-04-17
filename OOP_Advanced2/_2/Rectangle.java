package Develhope_Exercise.OOP_Advanced2._2;

public class Rectangle extends Shape {
    public Rectangle(double height, double width) {
        super(height, width);
    }
    @Override
    public double calculateArea() {
        return getHeight() * getWidth();
    }
}
