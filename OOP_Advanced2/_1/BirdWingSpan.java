package Develhope_Exercise.OOP_Advanced2._1;

public enum BirdWingSpan {
    PEREGRINE_FALCON(120, "Peregrine Falcon"),
    ALBATROSS(360, "Albatross"),
    EAGLE(250, "Eagle"),
    VULTURE(300, "Vulture"),
    CONDOR(320, "Condor");
    private double WingSpan;
    private String birdName;

    BirdWingSpan(double wingSpan, String birdName) {
        this.WingSpan = wingSpan;
        this.birdName = birdName;
    }

    public double getWingSpan() {
        return WingSpan;
    }

    public void setWingSpan(double wingSpan) {
        WingSpan = wingSpan;
    }

    public String getBirdName() {
        return birdName;
    }

    public void setBirdName(String birdName) {
        this.birdName = birdName;
    }
}
