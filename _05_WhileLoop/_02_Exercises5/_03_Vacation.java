package _05_WhileLoop._02_Exercises5;

import java.util.Scanner;

public class _03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double ownedMoney = Double.parseDouble(scanner.nextLine());

        int spendDaysCount = 0;
        int daysCount = 0;

        double currentMoney = 0;

        while (ownedMoney < neededMoney && spendDaysCount < 5) {
            String action = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            daysCount++;

            if (action.equals("spend")) {
                ownedMoney -= money;
                spendDaysCount++;
                if (ownedMoney < 0) {
                    ownedMoney = 0;
                }
            } else if (action.equals("save")) {
                ownedMoney += money;
                spendDaysCount = 0;
            }
        }
        if (spendDaysCount == 5) {
            System.out.println("You can't save the money.");
            System.out.println(spendDaysCount);
        }
        if (ownedMoney >= neededMoney) {
            System.out.printf("You saved the money for %d days.", daysCount);
        }
    }
}
