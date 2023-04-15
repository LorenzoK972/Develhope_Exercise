package Develhope_Exercise.OOP_Advanced._6;

import java.util.Random;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    private enum YouCanUseClassLocalEnumsLikeThis {
        THIS_CAN_ONLY_BE_ACCESSED_IN_THIS_CLASS,
        THIS_TOO
    }

    /**
     * 1:
     *
     *
     * Create an enum called "Days" with the values "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY".
     *
     * Loop over the values with Days.values() and print them out.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        for (Days name : Days.values()) {
            System.out.println(name);
        }
    }

    /**
     * 2:
     *
     *
     * Create an enum called "Seasons" with the values "SPRING", "SUMMER", "FALL", "WINTER".
     *
     * Write a method that takes a Seasons value as input and returns the corresponding date range of months in that season.
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        for (Seasons season : Seasons.values()) {
            System.out.println(season + ": " + season.getMonthsRange());
        }
    }

    /**
     * 3:
     *
     *
     * Create an enum called "TrafficLight" with the values "RED", "YELLOW", "GREEN".
     *
     * Write code that simulates the behavior of a traffic light. It should take the current state of the traffic light as input and return the next state.
     *
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        for (TrafficLight light : TrafficLight.values()) {
            if (light.getRightOfWay() == true) {
                if (light.getStop() == true) {
                    System.out.println("YELLOW: Clear the road!\n Next state: RED");
                } else {
                    System.out.println("GREEN: Go!\n Next state: YELLOW");
                }
            } else if (light.getStop() == true) {
                System.out.println("RED: Stop before the line! \n Next state: GREEN");
            }
        }
    }       //Si poteva fare anche con un semplice switch ma ci ho pensato dopo

    /**
     * 4:
     *
     * Given the Days enum from exercise 1, add a local field called isWeekend and set it to true for the weekend days and false for the weekdays.
     *
     * Write an if statement that prints weekend or weekday based on the enum
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        // Your code here
        for (Days name : Days.values()) {
            if (name.getAWeekendDay() == true)
                System.out.println(name + ": weekend");
            else {System.out.println(name + ": weekday");
            }
        }
    }

    /**
     * 5:
     *
     *
     * Create an enum called "Operator" with the values "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE".
     *
     * Write a method that takes two integers and an Operator value as input, performs the corresponding operation on the integers, and returns the result.
     */
    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        // Your code here

        double num1 = 5;
        double num2 = 2;

        Operator.Operator(num1, num2, Operator.ADD);
        Operator.Operator(num1, num2, Operator.SUBTRACT);
        Operator.Operator(num1, num2, Operator.MULTIPLY);
        Operator.Operator(num1, num2, Operator.DIVIDE);
    }

}
