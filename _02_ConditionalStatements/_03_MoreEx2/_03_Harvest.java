package _02_ConditionalStatements._03_MoreEx2;

import java.util.Scanner;

public class _03_Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int xArea = Integer.parseInt(scanner.nextLine());
        double yGrapePerSquare = Double.parseDouble(scanner.nextLine());
        int zLitersWine = Integer.parseInt(scanner.nextLine());
        int nWorkers = Integer.parseInt(scanner.nextLine());

        double grape = xArea * yGrapePerSquare;
        double wine = grape * 0.40 / 2.5;
        double wineLeft = Math.abs(zLitersWine - wine);
        if (wine < zLitersWine) {
            System.out.printf("It will be a tough winter! More %d liters wine needed.", (int) Math.floor(wineLeft));
        } else {
            double winePerWorker = wineLeft / nWorkers;
            System.out.printf("Good harvest this year! Total wine: %d liters.\n", (int) Math.floor(wine));
            System.out.printf("%d liters left -> %d liters per person.", (int) Math.ceil(wineLeft), (int) Math.ceil(winePerWorker));
        }
    }
}
