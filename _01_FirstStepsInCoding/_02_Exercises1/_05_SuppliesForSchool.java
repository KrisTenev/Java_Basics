package _01_FirstStepsInCoding._02_Exercises1;

import java.util.Scanner;

public class _05_SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int literCleaner = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double pensPrice = pens * 5.80;
        double markersPrice = markers * 7.20;
        double literCleanerPrice = literCleaner * 1.20;

        double sumPrices = pensPrice + markersPrice + literCleanerPrice;
        double finalPrice = sumPrices - (sumPrices * discount / 100);

        //System.out.println(sumPrices);
        System.out.println(finalPrice);
    }
}
