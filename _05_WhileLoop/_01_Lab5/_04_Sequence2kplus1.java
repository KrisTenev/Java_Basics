package _05_WhileLoop._01_Lab5;

import java.util.Scanner;

public class _04_Sequence2kplus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int currentN = 1;

        while (currentN <= n) {
            System.out.println(currentN);
            currentN = currentN * 2 + 1;
        }

    }
}
