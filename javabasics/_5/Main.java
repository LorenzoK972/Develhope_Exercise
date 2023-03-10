package Develhope_Exercise.javabasics._5;

public class Main {
    // Don't forget to use comments to clear things up if you need them!
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4Bonus();
        exercise5Bonus();
        playAroundWithModulus();
    }

    /*
            Remember the symbols you need to do maths are

            Plus = +
            Minus = -
            Multiply or times = *
            Divide = /
     */

    /**
     * 1: Create an int variable, add 1 to the value and then print it. Use the + operator
     * Then minus 1 from the same variable and print it.
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        //Set a starting "int" variable
        int initialValue = 10;
        //increased "initialValue" by 1 and print the result
        initialValue++;
        System.out.println("Increased Value = " + initialValue);
        //decreased "initialValue" by 1 and print the result
        initialValue--;
        System.out.println("Decreased Value = " + initialValue);
    }

    /**
     * 2: Create a double variable, times by 2 and then print it.
     * <p>
     * Create another double variable, which is the previous variable divided by 2
     * and then print it
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        //set a starting double variable
        double initialValue = 2.50;
        //print "initialValue" multiplied by 2
        System.out.println(initialValue * 2);
        //set a second double variable equal to "initialValue" divided by 2 and print it
        double dividedValue = initialValue / 2;
        System.out.println(dividedValue);
    }

    /**
     * 3: We are going to convert the temperature from celsius to fahrenheit
     * <p>
     * Create a double variable called celsius
     * <p>
     * Create a new variable called fahrenheit
     * <p>
     * The variable fahrenheit should be set as
     * celsius times by 1.8 plus 32
     * <p>
     * Print out celsius and fahrenheit with 2 print statements
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        double Celsius = 30;
        //convert the Celsius variable's value to Fahrenheit in the inherent double variable
        double Fahrenheit = Celsius * 1.8 + 32;
        //print both the variables
        System.out.println("Celsius = " + Celsius);
        System.out.println("Fahrenheit = " + Fahrenheit);
    }

    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     * Create an int called age with a starting value of 10.
     * <p>
     * Only using the '++' operator increase this value to 15
     */
    private static void exercise4Bonus() {
        System.out.println("\nExercise 4:");
        int age = 10;
        age++;
        age++;
        age++;
        age++;
        age++;
        //same result with '+=5'
        System.out.println(age);
    }

    /**
     * 5: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     * Create an int called age set as 50
     * <p>
     * Using the -= operator change this value from 50 to 0 in one line of code,
     * <p>
     * Underneath create another int called secondAge set as 50
     * <p>
     * Change this value from 50 to 0 in 3 lines of code
     */
    private static void exercise5Bonus() {
        System.out.println("\nExercise 5:");
        int age = 50;
        age -= 50;
        System.out.println("Age = " + age);
        int secondAge = 50;
        secondAge -= 20; //line 1
        secondAge -= 15; //line 2
        secondAge -= 15; //line 3
        System.out.println("SecondAge = " + secondAge);
    }

    /**
     * This is completely optional, but if you guys want to play around with
     * modulus to get a better understanding. Simply change the code below
     */
    private static void playAroundWithModulus() {
        System.out.println("\nModulus testing!:");

        int value = 100;   // <--- change this value
        int modulus = 9; // <--- and this value to see the results of modulus

        System.out.println("Modulus calculation, " + value + " % " + modulus +
                "=" + value % modulus);
    }

}