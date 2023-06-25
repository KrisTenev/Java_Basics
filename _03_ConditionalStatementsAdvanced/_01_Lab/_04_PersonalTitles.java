package _03_ConditionalStatementsAdvanced._01_Lab;

import java.util.Scanner;

public class _04_PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();
        if (age < 16) {
            switch (gender) {
                case "m":
                    System.out.println("Master");
                    break;
                case "f":
                    System.out.println("Miss");
                    break;
            }
        } else {
            switch (gender) {
                case "m":
                    System.out.println("Mr.");
                    break;
                case "f":
                    System.out.println("Ms.");
                    break;
            }
        }
    }
}