package _02_ConditionalStatements._01_Lab2;

import java.util.Scanner;

public class _07_AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.nextLine();

//        if (shape.equals("square")) {
//            double a = Double.parseDouble(scanner.nextLine());
//            System.out.printf("%.3f", a * a);
//        } else if (shape.equals("rectangle")) {
//            double a = Double.parseDouble(scanner.nextLine());
//            double b = Double.parseDouble(scanner.nextLine());
//            System.out.printf("%.3f", a * b);
//        } else if (shape.equals("circle")) {
//            double r = Double.parseDouble(scanner.nextLine());
//            System.out.printf("%.3f", Math.PI * r*r);
//        } else if (shape.equals("triangle")) {
//            double l = Double.parseDouble(scanner.nextLine());
//            double h = Double.parseDouble(scanner.nextLine());
//            System.out.printf("%.3f", l * h / 2);
//        }
        double area = 0;
        if (shape.equals("square")) {
            double a = Double.parseDouble(scanner.nextLine());
            area = a * a;
        } else if (shape.equals("rectangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            area = a * b;
        } else if (shape.equals("circle")) {
            double r = Double.parseDouble(scanner.nextLine());
            area = Math.PI * r * r;
        } else if (shape.equals("triangle")) {
            double l = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());
            area = l * h / 2;
        }
        System.out.printf("%.3f", area);
    }
}
