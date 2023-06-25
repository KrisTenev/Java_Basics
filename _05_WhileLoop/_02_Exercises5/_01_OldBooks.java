package _05_WhileLoop._02_Exercises5;

import java.util.Scanner;

public class _01_OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Търсената книга
        String book = scanner.nextLine();

        //Първата книга от бибиотеката
        String currentBook = scanner.nextLine();
        int bookCount = 0;

        while (!book.equals(currentBook)) {

            //Ако книгите свършат - прекъсваме
            if (currentBook.equals("No More Books")) {
                System.out.println("The book you search is not here!");
                System.out.printf("You checked %d books.", bookCount);
                break;
            }
            bookCount++;
            currentBook = scanner.nextLine();

        }
        if (book.equals(currentBook)) {
            System.out.printf("You checked %d books and found it.", bookCount);
        }
    }
}
