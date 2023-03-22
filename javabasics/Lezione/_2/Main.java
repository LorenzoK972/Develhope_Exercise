package Develhope_Exercise.javabasics.Lezione._2;

public class Main {
    public static void main(String[] args) {
        for (int numbersOfLunch = 1; numbersOfLunch <= 10; numbersOfLunch++) {
            System.out.println("Day n°" + numbersOfLunch);
            Lunch lunchPrice = new Lunch(Lunch.priceGenerator(), Lunch.lunchTypeList());

            lunchPrice.printLunch();
        }
    }
}
