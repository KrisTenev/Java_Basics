package _05_WhileLoop._01_Lab5;

import java.util.Scanner;

public class _02_Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = scanner.nextLine();

        String input = scanner.nextLine();

        while (!input.equals(password)){
            input = scanner.nextLine();
        }
        System.out.printf("Welcome %s!", username);


    }
}
