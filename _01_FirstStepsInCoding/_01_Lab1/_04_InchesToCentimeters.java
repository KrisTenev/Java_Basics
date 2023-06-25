package _01_FirstStepsInCoding._01_Lab1;

import java.util.Scanner;

public class _04_InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Прочитане на вход в инчове
        double inches = Double.parseDouble(scan.nextLine());
        //Преобразуване от инчове в сантиментри
        double centimeters = inches * 2.54;
        //Принтиране на конзолата
        System.out.println(centimeters);
    }
}
