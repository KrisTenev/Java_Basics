package _02_ConditionalStatements._03_MoreEx2;

import java.util.Scanner;

public class _06_FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magn = Integer.parseInt(scanner.nextLine());
        int zumb = Integer.parseInt(scanner.nextLine());
        int rose = Integer.parseInt(scanner.nextLine());
        int cactus = Integer.parseInt(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double profit = (magn * 3.25 + zumb * 4.00 + rose * 3.50 + cactus * 8) * 0.95;
        double moneyLeft = Math.abs(profit - giftPrice);

        if (profit >= giftPrice){
            System.out.printf("She is left with %.0f leva.", Math.floor(moneyLeft));
        }else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(moneyLeft));
        }
    }
}
