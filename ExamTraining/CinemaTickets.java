package ExamTraining;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine(); //Четем филма
        int totalTickets = 0;
        int studentTickets = 0;
        int standardTickets = 0;
        int kidTickets = 0;


        while (!movie.equals("Finish")) {
            int freePlaces = Integer.parseInt(scanner.nextLine()); //Четем свободните места
            int soldTicket = 0;

            //Продажба на билети
            String ticket = scanner.nextLine();
            while (!ticket.equals("End")) {
                soldTicket++;
                totalTickets++;

                //Типа на закупения билет
                switch (ticket) {
                    case "student":
                        studentTickets++;
                        break;
                    case "standard":
                        standardTickets++;
                        break;
                    case "kid":
                        kidTickets++;
                        break;
                }

                //Проверка за свободни места
                if (soldTicket == freePlaces) {
                    break;
                }
                ticket = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.\n", movie, soldTicket * 1.00 / freePlaces * 100);
            movie = scanner.nextLine();
        }

        System.out.printf("Total tickets: %d\n", totalTickets);
        System.out.printf("%.2f%% student tickets.\n", 1.00 * studentTickets / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.\n", 1.00 * standardTickets / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.\n", 1.00 * kidTickets / totalTickets * 100);

    }
}
