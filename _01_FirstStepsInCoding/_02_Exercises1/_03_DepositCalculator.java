package _01_FirstStepsInCoding._02_Exercises1;

import java.util.Scanner;

public class _03_DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());
        int time = Integer.parseInt(scanner.nextLine());
        double grp = Double.parseDouble(scanner.nextLine());

        double sum = deposit + (time * ((deposit * (grp / 100)) / 12));
        System.out.println(sum);
    }
}
