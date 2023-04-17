package Develhope_Exercise.OOP_Advanced2._2;

public class Guitar extends Instrument{
    public Guitar(String name, String brand) {
        super(name, brand);
    }

    @Override
    public void play() {
    System.out.println("Name: " + getName() + " ; Brand: " + getBrand());
    }
}
