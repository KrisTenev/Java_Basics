package _02_ConditionalStatements._02_Exercises2;

import java.util.Scanner;

public class _06_WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double worldRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double secPerMeter = Double.parseDouble(scanner.nextLine());

        double time = distance * secPerMeter;
        double resistance = Math.floor(distance / 15) * 12.5;
        time = time + resistance;
        if (time < worldRecord) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", time);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", time - worldRecord);
        }
    }
}
