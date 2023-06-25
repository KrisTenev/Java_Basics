package _04_ForLoop._01_Lab4;

import java.util.Scanner;

public class _08_NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (minNumber > number) {
                minNumber = number;
            }
            if (maxNumber < number) {
                maxNumber = number;
            }
        }
        System.out.printf("Max number: %d\n", maxNumber);
        System.out.printf("Min number: %d", minNumber);
    }
}
