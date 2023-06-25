package _03_ConditionalStatementsAdvanced._02_Exercises;

import java.util.Scanner;

public class _09_SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //"room for one person" – 18.00 лв за нощувка
        //"apartment" – 25.00 лв за нощувка
        //"president apartment" – 35.00 лв за нощувка

        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String feedback = scanner.nextLine();
        double totalPrice = 0;
        double roomPrice = 18.00;
        double apartPrice = 25.00;
        double presidentPrice = 35.00;

        switch (room) {
            case "room for one person":
                totalPrice = (days - 1) * roomPrice;
                break;
            case "apartment":
                if (days < 10){
                    totalPrice = (days - 1) * apartPrice * 0.70;
                } else if (days >15) {
                    totalPrice = (days - 1) * apartPrice * 0.50;
                }else {
                    totalPrice = (days - 1) * apartPrice * 0.65;
                }
                break;
            case "president apartment":
                if (days < 10){
                    totalPrice = (days - 1) * presidentPrice * 0.90;
                } else if (days >15) {
                    totalPrice = (days - 1) * presidentPrice * 0.80;
                }else {
                    totalPrice = (days - 1) * presidentPrice * 0.85;
                }
                break;
        }
        if (feedback.equals("positive")) {
            totalPrice += totalPrice * 0.25;
        } else {
            totalPrice -= totalPrice * 0.10;
        }
        System.out.printf("%.2f",totalPrice);
    }
}
