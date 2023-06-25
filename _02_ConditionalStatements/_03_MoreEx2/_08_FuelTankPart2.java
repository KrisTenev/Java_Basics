package _02_ConditionalStatements._03_MoreEx2;

import java.util.Scanner;

public class _08_FuelTankPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        double fuel = Integer.parseInt(scanner.nextLine());
        String haveCard = scanner.nextLine();

        double gasolinePrice = 2.22;
        double dieselPrice = 2.33;
        double gasPrice = 0.93;
        double fuelPrice = 0;

//        if (haveCard.equals("Yes")) {
//            if (fuelType.equals("Gasoline")) {
//                fuelPrice = fuel * (gasolinePrice - 0.18);
//            } else if (fuelType.equals("Diesel")) {
//                fuelPrice = fuel * (dieselPrice - 0.12);
//            } else if (fuelType.equals("Gas")) {
//                fuelPrice = fuel * (gasPrice - 0.08);
//            }
//
//        } else if (haveCard.equals("No")) {
//            if (fuelType.equals("Gasoline")) {
//                fuelPrice = fuel * gasolinePrice;
//            } else if (fuelType.equals("Diesel")) {
//                fuelPrice = fuel * dieselPrice;
//            } else if (fuelType.equals("Gas")) {
//                fuelPrice = fuel * gasPrice;
//            }
//        }
        if (haveCard.equals("Yes")) {
            gasolinePrice = 2.22 - 0.18;
            dieselPrice = 2.33 - 0.12;
            gasPrice = 0.93 - 0.08;
        }

        if (fuelType.equals("Gasoline")) {
            fuelPrice = fuel * gasolinePrice;
        } else if (fuelType.equals("Diesel")) {
            fuelPrice = fuel * dieselPrice;
        } else if (fuelType.equals("Gas")) {
            fuelPrice = fuel * gasPrice;
        }

        if (fuel > 25) {
            fuelPrice = fuelPrice * 0.90;
        } else if (fuel >= 20) {
            fuelPrice = fuelPrice * 0.92;
        }
        System.out.printf("%.2f lv.", fuelPrice);
    }
}