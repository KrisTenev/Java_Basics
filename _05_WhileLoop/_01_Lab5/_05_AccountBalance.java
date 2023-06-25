package _05_WhileLoop._01_Lab5;

import java.util.Scanner;

public class _05_AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double account = 0;
        String input = scanner.nextLine();

        while (!input.equals("NoMoreMoney")) {

            double currentSum = Double.parseDouble(input);

            if (currentSum < 0){
                System.out.println("Invalid operation!");
                break;
            }
            account += currentSum;
            System.out.printf("Increase: %.2f\n",currentSum);
            input = scanner.nextLine();
        }

        System.out.printf("Total: %.2f",account);
    }
}
