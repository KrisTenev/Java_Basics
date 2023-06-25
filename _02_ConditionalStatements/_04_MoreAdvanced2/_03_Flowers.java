package _02_ConditionalStatements._04_MoreAdvanced2;

import java.util.Scanner;

public class _03_Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chrysanthemum = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        char holiday = scanner.next().charAt(0);

        double chrysanthemumPrice = 2.00;
        double rosePrice = 4.10;
        double tulipPrice = 2.50;

        if (season.equals("Autumn") || season.equals("Winter")) {
            chrysanthemumPrice = 3.75;
            rosePrice = 4.50;
            tulipPrice = 4.15;
        }
        if ((holiday)=='Y'){
            chrysanthemumPrice = chrysanthemumPrice * 1.15;
            rosePrice = rosePrice * 1.15;
            tulipPrice = tulipPrice * 1.15;
        }

        double totalPrice = chrysanthemum*chrysanthemumPrice + roses*rosePrice + tulips*tulipPrice;

        if (tulips > 7 && season.equals("Spring")){
            totalPrice = totalPrice * 0.95;
        }
        if (roses >= 10 && season.equals("Winter")){
            totalPrice = totalPrice * 0.90;
        }
        if ((chrysanthemum+roses+tulips) > 20){
            totalPrice = totalPrice * 0.80;
        }

        double finalPrise = totalPrice + 2;
        System.out.printf("%.2f", finalPrise);
    }
}
