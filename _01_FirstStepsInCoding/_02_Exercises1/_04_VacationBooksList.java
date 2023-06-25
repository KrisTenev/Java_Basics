package _01_FirstStepsInCoding._02_Exercises1;

import java.util.Scanner;

public class _04_VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pagesCount = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int periodDays = Integer.parseInt(scanner.nextLine());

        int hoursPerDay = (pagesCount/pagesPerHour)/periodDays;
        System.out.println(hoursPerDay);
    }
}
