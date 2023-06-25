package _01_FirstStepsInCoding._02_Exercises1;

import java.util.Scanner;

public class _08_BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int annualTrainingPrice = Integer.parseInt(scanner.nextLine());
        double shoesPrice = annualTrainingPrice * 0.60;
        double clothesPrice = shoesPrice * 0.80;
        double ballPrice = clothesPrice * 0.25;
        double accessoriesPrice = ballPrice * 0.20;

        double totalPrice = annualTrainingPrice + shoesPrice + clothesPrice + ballPrice + accessoriesPrice;
        System.out.println(totalPrice);


    }
}
