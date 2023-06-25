package _01_FirstStepsInCoding._01_Lab1;

import java.util.Scanner;

public class _08_PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogPacks = Integer.parseInt(scanner.nextLine());
        int catPacks = Integer.parseInt(scanner.nextLine());
        double dogMoney = dogPacks * 2.5;
        double catMoney = catPacks * 4;
        double expenses = dogMoney + catMoney;

        System.out.println(expenses);
    }
}
