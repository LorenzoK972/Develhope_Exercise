package Develhope_Exercise.OOP_Advanced2._1;

import jdk.jfr.SettingControl;

import java.util.Set;

public class Fish extends Animal {
    private String species;
    public Fish(double height, double weight, Species species) {
        super(height, weight);
        this.species = species.getFishSpecies();
    }
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void swimSpeedMetersPerSecond() {
        System.out.println("Swim speed meters per seconds = " + getWeight() * 2);
    }
}
