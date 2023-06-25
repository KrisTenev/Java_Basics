package _01_FirstStepsInCoding._02_Exercises1;

import java.util.Scanner;

public class _06_Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylonArea = Integer.parseInt(scanner.nextLine());
        int paintLiters = Integer.parseInt(scanner.nextLine());
        int paintDiluent = Integer.parseInt(scanner.nextLine());
        int workingHours = Integer.parseInt(scanner.nextLine());

        double paintTotal = paintLiters + paintLiters * 0.10;
        double nylonTotal = nylonArea + 2;
        double bag = 0.40;

        double materialsPrice = paintTotal * 14.50 + nylonTotal * 1.50 + paintDiluent * 5.00 + bag;
        double workingPrice = materialsPrice * 0.30;

        double totalCost = materialsPrice + workingPrice * workingHours;
        //System.out.println(materialsPrice);
        System.out.println(totalCost);
    }
}
