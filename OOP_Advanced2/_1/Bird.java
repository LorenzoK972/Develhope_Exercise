package Develhope_Exercise.OOP_Advanced2._1;

import java.util.Set;

public class Bird extends Animal {
    private String birdName;
    private Double birdWingSpanLength;
    public Bird(double height, double weight, BirdWingSpan birdWingSpan) {
        super(height, weight);
        this.birdName = birdWingSpan.getBirdName();
        this.birdWingSpanLength = birdWingSpan.getWingSpan();
    }
    public String getBirdName() {
        return birdName;
    }

    public void setBirdName(String birdName) {
        this.birdName = birdName;
    }

    public Double getBirdWingSpanLength() {
        return birdWingSpanLength;
    }

    public void setBirdWingSpanLength(Double birdWingSpanLength) {
        this.birdWingSpanLength = birdWingSpanLength;
    }
    public void flySpeedMetersPerSecond() {
        System.out.println("Fly speed meters per seconds = " + getBirdWingSpanLength() * 4);
    }
}
