package _04_ForLoop._02_Exercises4;

import java.util.Scanner;

public class _08_TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int games = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());

        int points = 0;
        int winGames = 0;
        for (int i = 1; i <= games; i++) {
            String type = scanner.nextLine();
            switch (type) {
                case "W":
                    points += 2000;
                    winGames++;
                    break;
                case "F":
                    points += 1200;
                    break;
                case "SF":
                    points += 720;
                    break;
            }
        }
        double percentWin = winGames * 1.00 / games * 100;

        System.out.printf("Final points: %d\n", startPoints + points);
        System.out.printf("Average points: %.0f\n", Math.floor(points * 1.00 / games));
        System.out.printf("%.2f%%",percentWin);

    }
}
