package _04_ForLoop._01_Lab4;

import java.util.Scanner;

public class _09_LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sumL = 0;
        int sumR = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sumL += number;
        }
        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sumR += number;
        }
        if (sumL == sumR) {
            System.out.printf("Yes, sum = %d", sumL);
        } else {
            System.out.printf("No, diff = %d", Math.abs(sumL - sumR));
        }

    }
}
