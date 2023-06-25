package _05_WhileLoop._02_Exercises5;

import java.util.Scanner;

public class _07_Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        int volume = a * b * h;
        int boxes = 0;

        while (volume >= boxes) {
            String n = scanner.nextLine();
            if ("Done".equals(n)) {
                System.out.printf("%d Cubic meters left.", volume - boxes);
                break;
            }
            boxes += Integer.parseInt(n);
        }
        if (boxes >= volume){
            System.out.printf("No more free space! You need %d Cubic meters more.",boxes - volume);
        }
    }
}
