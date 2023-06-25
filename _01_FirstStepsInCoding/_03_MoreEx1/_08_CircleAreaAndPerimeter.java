package _01_FirstStepsInCoding._03_MoreEx1;

import java.util.Scanner;

public class _08_CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = Double.parseDouble(scanner.nextLine());

        double perim = 2*r*Math.PI;
        double area = r*r*Math.PI;

        System.out.printf("%.2f\n",area);
        System.out.printf("%.2f",perim);
    }
}
