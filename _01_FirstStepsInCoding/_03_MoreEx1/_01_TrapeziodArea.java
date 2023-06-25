package _01_FirstStepsInCoding._03_MoreEx1;

import java.util.Scanner;

public class _01_TrapeziodArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double b1 = Double.parseDouble(scanner.nextLine());
        double b2 = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double trapeziodArea = (b1+b2)*(h/2.00);

        System.out.printf("%.2f",trapeziodArea);
    }
}
