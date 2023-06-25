package ExamTraining;

import java.util.Scanner;

public class _06_EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int easterBreadCount = Integer.parseInt(scanner.nextLine());
        int maxPoints = Integer.MIN_VALUE;
        String winner = "";

        for (int i = 1; i <= easterBreadCount; i++) {
            String name = scanner.nextLine(); // Име на шеф
            int totalPoint = 0;
            String input = scanner.nextLine();

            while (!input.equals("Stop")) {
                int currentPoint = Integer.parseInt(input); // Точки от всеки дегустатор
                totalPoint += currentPoint;  // Сумираме всички точки
                input = scanner.nextLine();
            }

            System.out.printf("%s has %d points.\n", name, totalPoint);

            if (totalPoint > maxPoints) {
                maxPoints = totalPoint;
                System.out.printf("%s is the new number 1!\n", name);
                winner = name;
            }
        }
        System.out.printf("%s won competition with %d points!",winner,maxPoints);
    }
}
