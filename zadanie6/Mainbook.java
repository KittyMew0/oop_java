package geekbrains_course.oop_course.Seminar6_oop;

import java.util.Scanner;

public class Mainbook {
    public static void main(String[] args) {
        Library<String> library = new Library<>();

        Book<String> book1 = new Book<>("Book 1");
        Book<String> book2 = new Book<>("Book 2");
        Book<String> book3 = new Book<>("Book 3");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        
        
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        
        //добавляем меню для удобной работы программы с пользователем
        while (!exit) {
        	library.displayAvailableBooks();
            System.out.println("\nLibrary Menu:");
            System.out.println("1. Show issued books");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                	library.displayIssuedBooks();
                    break;
                case 2:
                    System.out.print("Enter the title of the book you want to borrow: ");
                    String bookToBorrowTitle = scanner.nextLine();
                    Book<String> bookToBorrow = library.getBookByTitle(bookToBorrowTitle);
                    if (bookToBorrow != null) {
                        library.takeBook(bookToBorrow);
                    } else {
                        System.out.println("This book is not available in the library.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the title of the book you want to return: ");
                    String bookToReturnTitle = scanner.nextLine();
                    Book<String> bookToReturn = library.getBookByTitle(bookToReturnTitle);
                    if (bookToReturn != null) {
                        library.returnBook(bookToReturn);
                    } else {
                        System.out.println("This book was not issued from this library.");
                    }
                    break;

                case 4:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 4.");
            }
        }

        scanner.close();
    }
}
