package _05_WhileLoop._02_Exercises5;

import java.util.Scanner;

public class _06_Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());

        int cakePeaces = a * b;

        String peaces = scanner.nextLine();

        while (cakePeaces >= 0) {

            peaces = scanner.nextLine();

            if ("STOP".equals(peaces)) {
                System.out.printf("%d pieces are left.", cakePeaces);
                break;
            }

            cakePeaces -= Integer.parseInt(peaces);

        }
        if (cakePeaces < 0) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cakePeaces));
        }

    }
}
