package _01_FirstStepsInCoding._01_Lab1;

import java.util.Scanner;

public class _03_RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Прочитаме страната 'а' на правоъгълника//
        int a = Integer.parseInt(scanner.nextLine());
        //Прочитаме страната 'b' на правоъгълника//
        int b = Integer.parseInt(scanner.nextLine());
        //Изчисляваме лицетп на правоъгълника//
        int area = a * b;

        System.out.println(area);
    }
}
