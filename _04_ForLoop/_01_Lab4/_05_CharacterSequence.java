package _04_ForLoop._01_Lab4;

import java.util.Scanner;

public class _05_CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        for (int i = 1; i < text.length(); i++){
            char letter = text.charAt(i);
            System.out.println(letter);
        }

    }
}
