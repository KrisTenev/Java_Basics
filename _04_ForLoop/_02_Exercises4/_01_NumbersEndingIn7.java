package _04_ForLoop._02_Exercises4;

import java.util.Scanner;

public class _01_NumbersEndingIn7 {
    public static void main(String[] args) {

        for (int i = 7; i <= 997; i++){
            if (i % 10 == 7){
                System.out.println(i);
            }
        }
    }
}
