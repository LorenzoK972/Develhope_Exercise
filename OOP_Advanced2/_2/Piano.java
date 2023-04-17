package Develhope_Exercise.OOP_Advanced2._2;

public class Piano extends Instrument {
    public Piano(String name, String brand) {
        super(name, brand);
    }

    @Override
    public void play() {
        System.out.println("Name: " + getName() + " ; Brand: " + getBrand());
    }
}
