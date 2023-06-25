package _02_ConditionalStatements._04_MoreAdvanced2;

import java.util.Scanner;

public class _02_BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juniorRacers = Integer.parseInt(scanner.nextLine());
        int seniorRacers = Integer.parseInt(scanner.nextLine());
        String track = scanner.nextLine();

        double taxJunior = 0;
        double taxSenior = 0;

        if (track.equals("trail")) {
            taxJunior = 5.50;
            taxSenior = 7.00;
        } else if (track.equals("cross-country")) {
            taxJunior = 8.00;
            taxSenior = 9.50;
        } else if (track.equals("downhill")) {
            taxJunior = 12.25;
            taxSenior = 13.75;
        } else if (track.equals("road")) {
            taxJunior = 20.00;
            taxSenior = 21.50;
        }

        if (track.equals("cross-country") && (juniorRacers + seniorRacers) >= 50) {
            taxJunior = taxJunior * 0.75;
            taxSenior = taxSenior * 0.75;
        }

        double totalTax = (juniorRacers * taxJunior + seniorRacers * taxSenior) * 0.95;
        System.out.printf("%.2f",totalTax);
    }
}
