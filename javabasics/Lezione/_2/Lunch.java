package Develhope_Exercise.javabasics.Lezione._2;

import java.util.Arrays;
import java.util.List;

public class Lunch {

    static List<String> lunchTypeList = Arrays.asList("Sandwich", "Pie", "Brioches", "Donuts", "Pizza", "Pasta", "Steak", "Eggs", "Beacons", "Fish&Chips");
    Double lunchPrice = null;
    String lunchType = null;
    Lunch (Double determinatePrice, String determinateLunchType) {
        this.lunchPrice = determinatePrice;
        this.lunchType = (determinateLunchType);
    }

    public void printLunch () {
        System.out.print("Today, i bought a " + lunchType);
        System.out.println(" for the price of " + lunchPrice + "Euros");
    }

    public static double priceGenerator () {
        double priceValue = (Math.round(Math.random()*1000.0))/100.0;
        return priceValue;
    }
    
    public static String lunchTypeList () {
        double generateRandom = Math.round(Math.random()*10);
        int convertGenerateRandomToInt = (int) (generateRandom);
        while (convertGenerateRandomToInt >= lunchTypeList.size()) {
            generateRandom = Math.round(Math.random()*10);
            convertGenerateRandomToInt = (int) (generateRandom);
        }
        String randomLunchType = lunchTypeList.get(convertGenerateRandomToInt);
        return randomLunchType;
    }
}
