package _04_ForLoop._02_Exercises4;

import java.util.Scanner;

public class _07_TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int nMusala = 0;
        int nMonblan = 0;
        int nKili = 0;
        int nK2 = 0;
        int nEverest = 0;
        int allPeople = 0;

        for (int i = 1; i <= n; i++) {
            int numberPeople = Integer.parseInt(scanner.nextLine());
            allPeople += numberPeople;

            if (numberPeople <= 5) {
                nMusala += numberPeople;
            } else if (numberPeople <= 12) {
                nMonblan += numberPeople;
            } else if (numberPeople <= 25) {
                nKili += numberPeople;
            } else if (numberPeople <= 40) {
                nK2 += numberPeople;
            } else {
                nEverest += numberPeople;
            }
        }

        System.out.printf("%.2f%%\n", (nMusala * 1.00 / allPeople) * 100);
        System.out.printf("%.2f%%\n", (nMonblan * 1.00 / allPeople) * 100);
        System.out.printf("%.2f%%\n", (nKili * 1.00 / allPeople) * 100);
        System.out.printf("%.2f%%\n", (nK2 * 1.00 / allPeople) * 100);
        System.out.printf("%.2f%%\n", (nEverest * 1.00 / allPeople) * 100);
    }
}
