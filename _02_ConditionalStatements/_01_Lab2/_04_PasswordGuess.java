package _02_ConditionalStatements._01_Lab2;

import java.util.Scanner;

public class _04_PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();
        String myPass = "s3cr3t!P@ssw0rd";
        if (myPass.equals(pass)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
