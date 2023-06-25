package _01_FirstStepsInCoding._02_Exercises1;

import java.util.Scanner;

public class _07_FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenCount = Integer.parseInt(scanner.nextLine());
        int fishMenuCount = Integer.parseInt(scanner.nextLine());
        int vegiMenuCount = Integer.parseInt(scanner.nextLine());
        double delivery = 2.50;

        double totalMenuPrice = chickenCount*10.35 + fishMenuCount*12.40 + vegiMenuCount*8.15;
        double desert = totalMenuPrice * 0.20;

        double total = totalMenuPrice + desert + delivery;
        System.out.println(total);
    }
}
