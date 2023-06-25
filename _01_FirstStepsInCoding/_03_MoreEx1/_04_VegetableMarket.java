package _01_FirstStepsInCoding._03_MoreEx1;

import java.util.Scanner;

public class _04_VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceVegetables = Double.parseDouble(scanner.nextLine());
        double priceFruits = Double.parseDouble(scanner.nextLine());
        int weightVegetables = Integer.parseInt(scanner.nextLine());
        int weightFruits = Integer.parseInt(scanner.nextLine());

        double bgnInEur = 1 / 1.94;

        double incomes = priceVegetables * weightVegetables * bgnInEur + priceFruits * weightFruits * bgnInEur;
        System.out.printf("%.2f",incomes);
    }
}
