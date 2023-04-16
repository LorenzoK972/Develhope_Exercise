package Develhope_Exercise.OOP_Advanced2._1;

public class Dog extends Animal {
    private String breed;
    public Dog(double height, double weight, DogBreed breed) {
        super(height, weight);
        this.breed = breed.getBreedName();
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void runSpeedMetersPerSecond() {
        System.out.println("Run speed in meters = " + getHeight() * 2);
    }
}
