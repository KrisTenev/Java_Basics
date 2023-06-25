package _03_ConditionalStatementsAdvanced._02_Exercises;

import java.util.Scanner;

public class _02_SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degree = Integer.parseInt(scanner.nextLine());
        String timeOfDay = scanner.nextLine();

        String outfit = "";
        String shoes = "";

        if (degree >= 10 && degree <= 18) {
            switch (timeOfDay) {
                case "Morning":
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                    break;

                case "Afternoon":
                case "Evening":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
            }
        } else if (degree > 18 && degree <= 24) {
            switch (timeOfDay) {
                case "Morning":
                case "Evening":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;

                case "Afternoon":
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                    break;
            }
        } else if (degree >= 25) {
            switch (timeOfDay) {
                case "Morning":
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                    break;

                case "Afternoon":
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                    break;

                case "Evening":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
            }
        }

        System.out.printf("It's %s degrees, get your %s and %s.", degree, outfit, shoes);

    }
}
