package Lesson07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindBook {
    public static void main(String[] args) {
        boolean isContinuing = true;
        List<Book> bookList = new ArrayList<>();
        while (isContinuing) {
            System.out.println("==========MENU=======");
            System.out.println("1. Input book");
            System.out.println("2. Find book by ISBN");
            System.out.println("0. Exit");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Option number, please: ");
            int userInput = scanner.nextInt();
            if (userInput == 0) {
                isContinuing = false;
            } else {
                switch (userInput) {
                    case 1:
                        Book Book1 = new Book();
                        System.out.println("Input book:");
                        System.out.println("Input ISBN:");
                        String ISBN = scanner.nextLine();
                        Book1.setISBN(ISBN);

                        System.out.println("Input Tittle:");
                        String tittle = scanner.nextLine();
                        Book1.setTitle(tittle);

                        System.out.println("Input Author's name:");
                        String authorName = scanner.nextLine();
                        Book1.setAuthorName(authorName);

                        System.out.println("Input Year:");
                        int year = scanner.nextInt();
                        Book1.setYear(year);

                        bookList.add(Book1);
                        break;
                    case 2:
                        System.out.println("Input Find value");
                        String userValue = scanner.nextLine();

                        for (int i = 0; i < bookList.size(); i++) {
                            if (bookList.get(i).getISBN().equals(userValue)){
                                bookList.get(i).toString();
                            }
                            else{
                                System.out.println("Book not found!");
                            }
                        }

                        break;
                    default:
                        System.out.println("Wrong option!");
            }
            }
        }
    }
}
