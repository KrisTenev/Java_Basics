package _01_FirstStepsInCoding._02_Exercises1;

import java.util.Scanner;

public class _09_FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double filledPercentage = Double.parseDouble(scanner.nextLine());

        // Обем в куб.дециметри /1л вода = 1куб.дм/
        double veselVolume = (length * width * height) / 1000.000;

        double waterContent = veselVolume - veselVolume * (filledPercentage / 100);

        System.out.println(waterContent);
    }
}
