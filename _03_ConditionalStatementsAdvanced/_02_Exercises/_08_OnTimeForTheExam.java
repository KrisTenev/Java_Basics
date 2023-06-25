package _03_ConditionalStatementsAdvanced._02_Exercises;

import java.util.Scanner;

public class _08_OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int hour = Integer.parseInt(scanner.nextLine());
        int minute = Integer.parseInt(scanner.nextLine());

        int examAllMin = examHour * 60 + examMinutes;
        int arrivalAllMin = hour * 60 + minute;

        int diff = Math.abs(examAllMin - arrivalAllMin);

        int diffHour = diff / 60;
        int diffMin = diff % 60;

        if (examAllMin < arrivalAllMin){
            System.out.println("Late");
            if (diffHour == 0){
                System.out.printf("%d minutes after the start",diffMin);
            }else {
                System.out.printf("%d:%02d hours after the start",diffHour, diffMin);
            }
        }else if (examAllMin == arrivalAllMin || diff <= 30) {
            System.out.println("On time");
            if (diff != 0){
                System.out.printf("%d minutes before the start",diffMin);
            }
        }else {
            System.out.println("Early");
            if (diffHour == 0){
                System.out.printf("%d minutes before the start",diffMin);
            }else {
                System.out.printf("%d:%02d hours before the start",diffHour, diffMin);
            }
        }
    }
}
