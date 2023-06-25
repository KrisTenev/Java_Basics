package _05_WhileLoop._01_Lab5;

import java.util.Scanner;

public class _08_Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int goodGradesCount = 0;
        int poorGradesCount = 0;
        int gradeCount = 1;
        double allGradesSum = 0;

        while (goodGradesCount < 12) {

            if (poorGradesCount == 2){
                break;
            }

            double currentGrade = Double.parseDouble(scanner.nextLine());

            if (currentGrade < 4){
                poorGradesCount++;
                continue;
            }

            goodGradesCount++;
            gradeCount++;
            allGradesSum += currentGrade;
        }

        double avgGrade = allGradesSum / goodGradesCount;

        if (goodGradesCount >= 12){
            System.out.printf("%s graduated. Average grade: %.2f",name,avgGrade);
        }else {
            System.out.printf("%s has been excluded at %d grade",name,gradeCount);
        }

    }
}
