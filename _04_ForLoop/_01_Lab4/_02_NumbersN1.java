package _04_ForLoop._01_Lab4;

import java.util.Scanner;

public class _02_NumbersN1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
