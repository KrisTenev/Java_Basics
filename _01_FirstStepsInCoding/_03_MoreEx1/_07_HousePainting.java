package _01_FirstStepsInCoding._03_MoreEx1;

import java.util.Scanner;

public class _07_HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double houseArea = 2 * x * x + 2 * x * y - 1.2 * 2 - 2 * 1.5 * 1.5;
        double greenPaint = houseArea / 3.4;
        double roofArea = 2 * x * y + 2 * (x * h / 2);
        double redPaint = roofArea / 4.3;

        System.out.printf("%.2f\n", greenPaint);
        System.out.printf("%.2f", redPaint);
    }
}
