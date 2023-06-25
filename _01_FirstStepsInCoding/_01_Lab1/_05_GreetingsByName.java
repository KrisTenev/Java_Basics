package _01_FirstStepsInCoding._01_Lab1;

import java.util.Scanner;

public class _05_GreetingsByName {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Прочитане на входни данни
        String name = scan.nextLine();
        // Принтиране на поздрава
        System.out.println("Hello, " + name + "!");
    }
}
