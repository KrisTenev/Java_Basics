package _06_NestedLoops._01_Lab6;

import java.util.Scanner;

public class _04_SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rangeStart = Integer.parseInt(scanner.nextLine());
        int rangeEnd = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int combination = 0;
        boolean isFound = false;

        for (int i = rangeStart; i <= rangeEnd; i++) {
            for (int j = rangeStart; j <= rangeEnd; j++) {
                combination++;

                if (i + j == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", combination, i, j, magicNumber);
                    isFound = true;
                    break;
                }
            }
            if (isFound) {
                break;
            }
        }
        if (!isFound) {
            System.out.printf("%d combinations - neither equals %d", combination, magicNumber);
        }
    }
}
