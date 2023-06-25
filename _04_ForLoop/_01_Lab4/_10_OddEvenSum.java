package _04_ForLoop._01_Lab4;

import java.util.Scanner;

public class _10_OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                sumOdd += number;
            } else {
                sumEven += number;
            }
        }
        if (sumEven == sumOdd) {
            System.out.printf("Yes\nSum = %d", sumEven);
        }else {
            System.out.printf("No\nDiff = %d", Math.abs(sumEven-sumOdd));
        }
    }
}
