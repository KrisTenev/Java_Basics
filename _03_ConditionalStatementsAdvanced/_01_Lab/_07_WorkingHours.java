package _03_ConditionalStatementsAdvanced._01_Lab;

import java.util.Scanner;

public class _07_WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        switch (day){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
            case "Saturday":
                if (h >= 10 && h <= 18){
                    System.out.println("open");
                }else {
                    System.out.println("closed");
                }
                break;
            case "Sunday": System.out.println("closed"); break;
        }
    }
}
