package _02_ConditionalStatements._02_Exercises2;

import java.util.Scanner;

public class _02_BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        double bonus = 0;

        if (number <= 100) {
            bonus = bonus + 5;
            //bonus += 5;
        } else if (number < 1000) {
            bonus = number * 0.20;
        } else {
            bonus = number * 0.10;
        }

        if (number % 2 == 0) {
            bonus += 1;
        }
        if (number % 10 == 5) {
            bonus += 2;
        }
        System.out.println(bonus);
        System.out.println(number + bonus);
    }
}
