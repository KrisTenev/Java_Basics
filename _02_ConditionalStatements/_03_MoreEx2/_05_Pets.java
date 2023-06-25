package _02_ConditionalStatements._03_MoreEx2;

import java.util.Scanner;

public class _05_Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tripDays = Integer.parseInt(scanner.nextLine());
        int foodKg = Integer.parseInt(scanner.nextLine());
        double dogDayFood = Double.parseDouble(scanner.nextLine());     // in kilos
        double catDayFood = Double.parseDouble(scanner.nextLine());     // in kilos
        double turtleDayFood = Double.parseDouble(scanner.nextLine());  // in grams

        double dogFood = tripDays * dogDayFood;
        double catFood = tripDays * catDayFood;
        double turtleFood = tripDays * turtleDayFood / 1000;
        double totalFood = dogFood + catFood + turtleFood;
        double foodLeft = Math.abs(foodKg - totalFood);

        if (foodKg >= totalFood){
            System.out.printf("%d kilos of food left.",(int)Math.floor(foodLeft));
        }else {
            System.out.printf("%d more kilos of food are needed.",(int)Math.ceil(foodLeft));
        }
    }
}
