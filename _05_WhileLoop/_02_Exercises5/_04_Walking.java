package _05_WhileLoop._02_Exercises5;

import java.util.Scanner;

public class _04_Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int targetSteps = 10000;
        int steps = 0;

        while (steps <= targetSteps){
            String input = scanner.nextLine();

            if (!input.equals("Going home")) {
                steps += Integer.parseInt(input);
            }

            if (input.equals("Going home")){
                input = scanner.nextLine();
                steps += Integer.parseInt(input);
                break;
            }
        }
        if (steps >= targetSteps){
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!",steps - targetSteps);
        }else {
            System.out.printf("%d more steps to reach goal.",targetSteps - steps);
        }

    }
}
