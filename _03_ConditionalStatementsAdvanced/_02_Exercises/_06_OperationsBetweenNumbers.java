package _03_ConditionalStatementsAdvanced._02_Exercises;

import java.util.Scanner;

public class _06_OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        double result = 0;
        String oddEven = "";
        double check = 0;

        switch (operator) {
            case "+":
                result = n1 + n2;
                check = result % 2;
                if (check == 0) {
                    oddEven = "even";
                } else {
                    oddEven = "odd";
                }
                System.out.printf("%d %s %d = %.0f - %s", n1, operator, n2, result, oddEven);
                break;
            case "-":
                result = n1 - n2;
                check = result % 2;
                if (check == 0) {
                    oddEven = "even";
                } else {
                    oddEven = "odd";
                }
                System.out.printf("%d %s %d = %.0f - %s", n1, operator, n2, result, oddEven);
                break;
            case "*":
                result = n1 * n2;
                check = result % 2;
                if (check == 0) {
                    oddEven = "even";
                } else {
                    oddEven = "odd";
                }
                System.out.printf("%d %s %d = %.0f - %s", n1, operator, n2, result, oddEven);
                break;
            case "/":
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    result = n1 * 1.00 / n2;
                    System.out.printf("%d %s %d = %.2f", n1, operator, n2, result);
                }
                break;
            case "%":
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    result = n1 % n2;
                    System.out.printf("%d %s %d = %.0f", n1, operator, n2, result);
                }
                break;
        }
    }
}
