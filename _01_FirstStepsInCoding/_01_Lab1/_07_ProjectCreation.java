package _01_FirstStepsInCoding._01_Lab1;

import java.util.Scanner;

public class _07_ProjectCreation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int projectsCount = Integer.parseInt(scan.nextLine());

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, projectsCount*3, projectsCount);
    }
}
