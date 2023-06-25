package Test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        double a = 1.23;
        double lev = a / 1;
        double fiftyCent = lev % 0.5;

        System.out.println(lev);
        System.out.println(fiftyCent);


    }
}
