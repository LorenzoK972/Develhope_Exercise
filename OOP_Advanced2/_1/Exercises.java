package Develhope_Exercise.OOP_Advanced2._1;

import java.util.Set;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1:
     *
     *
     * Create a class called "Dog" that extends the Animal class.
     *
     * Add a new field called "breed" to the Dog class.
     *
     * Write a constructor for the Dog class that takes in a breed, height, and weight as parameters, and passes the height and weight to the superclass constructor.
     *
     * Write getters and setters for the breed field.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Animal animal1 = new Animal(1.10, 33);
        Dog dog1 = new Dog(1.40, 50, DogBreed.BULLDOG);
        System.out.println("Animal1 = Height: " + animal1.getHeight() + "cm; Weight: " + animal1.getWeight() + "Kg");
        System.out.println(dog1.getBreed() + " = Height: " + dog1.getHeight() + "cm; Weight: " + dog1.getWeight() + "Kg");
    }

    /**
     * 2:
     *
     *
     * Create new classes called "Fish" and "Bird" that extends the Animal class.
     *
     * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
     *
     * Also create constructors, getters and setters
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Fish fish1 = new Fish(130, 22, Species.SALMON);
        Bird bird1 = new Bird(160, 45, BirdWingSpan.CONDOR);
        System.out.println(fish1.getSpecies() + " = Height: " + fish1.getHeight() + "cm; Weight: " + fish1.getWeight() + "Kg");
        System.out.println(bird1.getBirdName() + " = Height: " + bird1.getHeight() + "cm; Weight: " + bird1.getWeight() + "Kg; Wing Span: " + bird1.getBirdWingSpanLength());
    }


    /**
     * 3:
     *
     * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
     * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
     * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
     *
     * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
     * and print out which of the animals has the fastest movement speed in MetersPerSecond
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        Dog dog1 = new Dog(1.40, 50, DogBreed.BULLDOG);
        dog1.runSpeedMetersPerSecond();
        Fish fish1 = new Fish(130, 22, Species.SALMON);
        fish1.swimSpeedMetersPerSecond();
        Bird bird1 = new Bird(160, 45, BirdWingSpan.CONDOR);
        bird1.flySpeedMetersPerSecond();
    }
}
