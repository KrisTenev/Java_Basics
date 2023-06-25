package _01_FirstStepsInCoding._01_Lab1;

import java.util.Scanner;

public class _09_YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double area = Double.parseDouble(scanner.nextLine());
        // Цената на 1кв.м е 7,61лв. с ДДС
        double price = area * 7.61;
        // 18% отстъпка от крайната цена
        double discount = price * 0.18;
        // Крайна цена
        double finalPrice = price - discount;

        System.out.printf("The final price is: %.2f lv.\n", finalPrice);
        System.out.printf("The discount is: %.2f lv.", discount);

    }
}
