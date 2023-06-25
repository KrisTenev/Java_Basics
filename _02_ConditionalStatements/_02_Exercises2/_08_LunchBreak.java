package _02_ConditionalStatements._02_Exercises2;

import java.util.Scanner;

public class _08_LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String serialName = scanner.nextLine();
        int episodeTime = Integer.parseInt(scanner.nextLine());
        int lunchBreak = Integer.parseInt(scanner.nextLine());

        double lunchTime = lunchBreak * 0.125;
        double relaxTime = lunchBreak * 0.25;

        double totalTime = episodeTime + lunchTime + relaxTime;
        double timeLeft = Math.abs(lunchBreak - totalTime);

        if (lunchBreak >= totalTime){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",serialName, Math.ceil(timeLeft));
        }else{
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",serialName,Math.ceil(timeLeft));
        }
    }
}
