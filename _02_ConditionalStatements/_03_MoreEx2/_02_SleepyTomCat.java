package _02_ConditionalStatements._03_MoreEx2;

import java.util.Scanner;

public class _02_SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vacation = Integer.parseInt(scanner.nextLine());
        int norm = 30000;

        int workDays = 365 - vacation;
        int playTime = workDays * 63 + vacation * 127;
        int playTimeLeft = Math.abs(norm - playTime);
        int hour = playTimeLeft / 60;
        int min = playTimeLeft % 60;

        if (norm < playTime) {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play",hour, min);
        }else{
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play",hour,min);
        }

    }
}
