package _02_ConditionalStatements._01_Lab2;

import java.util.Scanner;

public class _03_EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        boolean isEven = num % 2 == 0;
        if (isEven) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
