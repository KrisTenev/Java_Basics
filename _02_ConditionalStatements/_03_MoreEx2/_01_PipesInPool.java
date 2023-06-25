package _02_ConditionalStatements._03_MoreEx2;

import java.util.Scanner;

public class _01_PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int volume = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double totalP1 = p1 * h;
        double totalP2 = p2 * h;
        double total = totalP1 + totalP2;

        if (total <= volume) {
            totalP1 = (totalP1 / total) * 100;
            totalP2 = (totalP2 / total) * 100;
            total = (total / volume) * 100;
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%", total, totalP1, totalP2);
        } else {
            double overflow = Math.abs(total - volume);
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", h, overflow);
        }


    }
}
