package _06_NestedLoops._02_Exercises6;

import java.util.Scanner;

public class _02_EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        for (int i = n1; i <= n2; i++) {
            int currentNum = i;

            int oddSum = 0;
            int evenSum = 0;

            for (int j = 6; j >= 1; j--) {
                int digit = currentNum % 10;

                if (j % 2 == 0){
                    evenSum += digit;
                }else {
                    oddSum += digit;
                }
                currentNum /= 10;
            }
            if (evenSum == oddSum){
                System.out.println(i);
            }

        }

    }
}
