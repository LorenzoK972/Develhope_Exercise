package Develhope_Exercise.javabasics._4;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Store your age in an appropriate variable, print it out in
     *    one line using the "+" in your print statement. Only use 1 print statement
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        int myAge = 25;
        System.out.println("My age is " + myAge);
    }

    /**
     * 2: Store your first name initial (i.e. Jane -> J) in a variable, your age in another variable.
     *
     *    And then print them out on the same line using the following idea
     *
     *    System.out.println("My Age=" + myAge +", my initial=" + myInitial);
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        int myAge = 25;
        char myInitial = 'L';
        System.out.println("My Age = " + myAge +", my initial = " + myInitial);
    }

    /**
     * 3: Write comments above each line of code, describing what the line of code is doing
     */
    private static void exercise3() {
        //Print the title of the Exercise
        System.out.println("\nExercise 3:");
        //Initialize the boolean variable to determine if the lunch was eaten or not
        boolean hasEatenLunch = false;
        //Initialize the double variable to set the cost of the lunch
        double lunchCost = 5.99;
        //Print the cost of the lunch
        System.out.println("Lunch cost=" + lunchCost);
        //Print if lunch was eaten or not
        System.out.println("Has Eaten lunch=" + hasEatenLunch);
    }
}
