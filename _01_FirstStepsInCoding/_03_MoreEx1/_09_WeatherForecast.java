package _01_FirstStepsInCoding._03_MoreEx1;

import java.util.Scanner;

public class _09_WeatherForecast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String weather = scanner.nextLine();
        if (weather.equals("sunny")){
            System.out.printf("It's warm outside!");
        }else{
            System.out.printf("It's cold outside!");
        }
    }
}
