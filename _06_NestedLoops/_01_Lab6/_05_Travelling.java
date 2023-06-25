package _06_NestedLoops._01_Lab6;

import java.util.Scanner;

public class _05_Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        while (!destination.equals("End")) {
            double budget = Double.parseDouble(scanner.nextLine());
            double sum = 0;

            while (sum < budget) {
                sum += Double.parseDouble(scanner.nextLine());
            }
            System.out.println("Going to " + destination + "!");

            destination = scanner.nextLine();
        }
    }
}
