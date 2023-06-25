package _06_NestedLoops._02_Exercises6;

import java.util.Scanner;

public class _04_TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jury = Integer.parseInt(scanner.nextLine());

        String thesis = scanner.nextLine();

        double avgGrade = 0;
        double totalGrade = 0;
        int gradeCount = 0;

        while (!thesis.equals("Finish")) {
            avgGrade = 0;
            gradeCount++;

            for (int i = 1; i <= jury; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                avgGrade += grade / jury;

            }

            System.out.printf("%s - %.2f.\n", thesis,avgGrade);
            totalGrade += avgGrade;

            thesis = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", totalGrade/gradeCount);

    }
}
