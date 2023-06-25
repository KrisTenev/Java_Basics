package _05_WhileLoop._01_Lab5;

import java.util.Scanner;

public class _06_MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int value = Integer.MIN_VALUE;

        while (!input.equals("Stop")){

            if (value < Integer.parseInt(input)){
                value = Integer.parseInt(input);
            }

            input = scanner.nextLine();
        }
        System.out.println(value);
    }
}
