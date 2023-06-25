package _03_ConditionalStatementsAdvanced._01_Lab;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();

        switch (day) {
            case "Monday":
                System.out.printf("Today is %s", day);
                break;
            case "Tuesday":
                System.out.printf("Today is %s", day);
                break;
            case "Wednesday":
                System.out.printf("Today is %s", day);
                break;
            case "Thursday":
                System.out.printf("Today is %s", day);
                break;
            case "Friday":
                System.out.printf("Today is %s", day);
                break;
            default:
                System.out.println("Weekend");
        }

    }
}
