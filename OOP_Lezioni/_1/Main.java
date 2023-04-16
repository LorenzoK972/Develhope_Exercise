package Develhope_Exercise.OOP_Lezioni._1;

public class Main {
    public static void main(String[] args) {
        Lunch todaysLunch = new Lunch();
        printLunch(todaysLunch);
        System.out.println("Lunch price is " + todaysLunch.price);
    }

    static void printLunch (Lunch lunchValue) {
            System.out.println("Lunch price is " + lunchValue.price + " 1");

    }
}
