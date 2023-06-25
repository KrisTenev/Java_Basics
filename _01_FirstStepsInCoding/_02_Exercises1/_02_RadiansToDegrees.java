package _01_FirstStepsInCoding._02_Exercises1;

import java.util.Scanner;

public class _02_RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rad = Double.parseDouble(scanner.nextLine());
        double degrees = rad * 180 / Math.PI;

        System.out.println(degrees);
    }
}
