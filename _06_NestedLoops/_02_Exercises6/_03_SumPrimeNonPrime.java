package _06_NestedLoops._02_Exercises6;

import javax.swing.plaf.synth.SynthFormattedTextFieldUI;
import java.util.Scanner;

public class _03_SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine();

        int sumPrime = 0;
        int sumNonPrime = 0;

        while (!n.equals("stop")) {                             //Проверка за "стоп"
            int number = Integer.parseInt(n);                   //Парсваме към int, когато сме в цикъла винаги работим с числа

            if (number < 0) {                                   //Проверка за негативни числа
                System.out.println("Number is negative.");
                n = scanner.nextLine();                         //Ъпдейт на променливата
                continue;
            }

            boolean isPrime = true;
            for (int i = 2; i <= number - 1; i++) {
                if (number % i == 0) {
                    sumNonPrime += number;
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                sumPrime += number;
            }

            n = scanner.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d\n", sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d", sumNonPrime);
    }
}
