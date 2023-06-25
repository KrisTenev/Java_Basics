package _01_FirstStepsInCoding._03_MoreEx1;

import java.util.Scanner;

public class _06_Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double scPrice = Double.parseDouble(scanner.nextLine());
        double cacaPrice = Double.parseDouble(scanner.nextLine());
        double palaWeght = Double.parseDouble(scanner.nextLine());
        double safWeght = Double.parseDouble(scanner.nextLine());
        double midWeght = Double.parseDouble(scanner.nextLine());

        double palaTotal = palaWeght * scPrice * 1.6;
        double safTotal = safWeght * cacaPrice * 1.8;
        double midTotal = midWeght * 7.50;
        double total = palaTotal + safTotal + midTotal;

        System.out.printf("%.2f",total);

    }
}
