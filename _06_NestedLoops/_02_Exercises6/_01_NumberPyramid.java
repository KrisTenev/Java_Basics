package _06_NestedLoops._02_Exercises6;

import java.util.Scanner;

public class _01_NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int count = 1;
        boolean isBigger = false;

        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= rows; cols++) {

                if (count > n) {
                    isBigger = true;
                    break;
                }

                System.out.printf("%d ", count);
                count++;
            }
            if (isBigger){
                break;
            }

            System.out.println();
        }


    }
}
