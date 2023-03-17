package Develhope_Exercise.javabasics._16;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Take the code below and put it into a function, read the code and see what it is.
     * <p>
     * What do you think the function does? Name the function appropriately and make sure
     * <p>
     * return the appropriate result type
     *
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        System.out.println(celsiusToFahrenheit());
    }
    static String celsiusToFahrenheit() {
        double celsius = 30;
        double fahrenheit = ((celsius * 9) / 5) + 32;
        String conversionDescription = celsius + " Celsius is " + fahrenheit + " fahrenheit";
        return conversionDescription;
    }

    /**
     * 2: Create a function that processes and prints out all the names in the ArrayList
     *
     *    Make sure to put all the formatting code in the function, formatting:
     *    1) to Upper case
     *    2) Remove spaces at the start and the end
     *    3) If the name contains any numbers, instead of returning the name, return "Invalid"
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        List<String> names = Arrays.asList("Alan   ", "Alice   ", "Ant0ni0   ", "  Aziz");

        for (String name : names) {
            formattedName(name);// Call your function
        }
    }
    static void formattedName(String nameToFormat) {
        if (nameToFormat.contains("0") || nameToFormat.contains("1") || nameToFormat.contains("2") || nameToFormat.contains("3")
            || nameToFormat.contains("4") || nameToFormat.contains("5") || nameToFormat.contains("6") || nameToFormat.contains("7")
            || nameToFormat.contains("8") || nameToFormat.contains("9")) {
            nameToFormat = "invalid";
        }
        System.out.println(nameToFormat.toUpperCase().trim());
    }

    /**
     * 3: Write a function that prints out every variable seen in the code. It should not return anything
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        double myLunchPrice = 5.99;
        String lunchType = "sandwich";
        String description = "Nice big sandwich";
        int weightInGrams = 500;

        lunch(myLunchPrice, lunchType, description, weightInGrams); // Call your function
    }
    static void lunch(double lunchPrice, String lunchType, String lunchDescription, int lunchGrams) {
        System.out.println("The price is " + lunchPrice + ", the type is a " + lunchType +
                ", a " + lunchDescription + ", the lunch's weight is " + lunchGrams + " grams");
    }
}
