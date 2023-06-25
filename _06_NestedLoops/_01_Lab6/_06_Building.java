package _06_NestedLoops._01_Lab6;

import java.util.Scanner;

public class _06_Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int level = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());

        for (int i = level; i >= 1; i--) {
            for (int j = 0; j < rooms; j++) {
                if (i == level) {
                    System.out.printf("L%d%d ", i, j);
                } else if (i % 2 == 0) {
                    System.out.printf("O%d%d ", i, j);
                } else {
                    System.out.printf("A%d%d ", i, j);
                }
            }
            System.out.println();
        }

    }
}
