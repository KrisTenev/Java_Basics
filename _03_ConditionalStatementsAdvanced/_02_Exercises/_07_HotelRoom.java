package _03_ConditionalStatementsAdvanced._02_Exercises;

import java.util.Scanner;

public class _07_HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double priceStudio = 0;
        double priceApartment = 0;
        double priceStudioNight = 0;
        double priceApartNight = 0;

        switch (month) {
            case "May":
            case "October":
                priceStudioNight = 50;
                priceApartNight = 65;
                if (nights > 7 && nights <= 14) {
                    priceStudio = priceStudioNight * nights * 0.95;
                    priceApartment = priceApartNight * nights;
                } else if (nights > 14) {
                    priceStudio = priceStudioNight * nights * 0.70;
                    priceApartment = priceApartNight * nights * 0.90;
                } else {
                    priceStudio = priceStudioNight * nights;
                    priceApartment = priceApartNight * nights;
                }
                break;

            case "June":
            case "September":
                priceStudioNight = 75.20;
                priceApartNight = 68.70;
                if (nights > 14) {
                    priceStudio = priceStudioNight * nights * 0.80;
                    priceApartment = priceApartNight * nights * 0.90;
                } else {
                    priceStudio = priceStudioNight * nights;
                    priceApartment = priceApartNight * nights;
                }
                break;

            case "July":
            case "August":
                priceStudioNight = 76;
                priceApartNight = 77;
                if (nights > 14) {
                    priceApartment = priceApartNight * nights * 0.90;
                } else {
                    priceApartment = priceApartNight * nights;
                }
                priceStudio = priceStudioNight * nights;
                break;
        }
        System.out.printf("Apartment: %.2f lv.\n", priceApartment);
        System.out.printf("Studio: %.2f lv.", priceStudio);

    }
}
