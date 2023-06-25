package _01_FirstStepsInCoding._03_MoreEx1;

import java.util.Scanner;

public class _05_TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double w = Double.parseDouble(scanner.nextLine()); //in meters
        double h = Double.parseDouble(scanner.nextLine()); //in meters

        w = w * 100;
        h = h * 100;
        int wPlace = 70;
        int hPlace = 120;
        int corridorWidth = 100;
        int waistPlaces = 3;
        h = h - corridorWidth;

        int placeInColumn = (int) h / wPlace;
        int placeInRow = (int) w / hPlace;

        int totalPlaces = placeInColumn * placeInRow - waistPlaces;

        System.out.println(totalPlaces);

    }
}
