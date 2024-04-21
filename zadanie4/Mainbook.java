package geekbrains_course.oop_course.Seminar4_oop;

import java.util.ArrayList;
import java.util.List;

class Book<T> {
    private T title; 

    public Book(T title) {
        this.title = title;
    }

    public T getTitle() {
        return title;
    }
}

class Library<T> {
    private List<Book<T>> books;
    private List<Book<T>> issuedBooks; 

    public Library() {
        books = new ArrayList<>();
        issuedBooks = new ArrayList<>();
    }

    public void addBook(Book<T> book) {
        books.add(book);
    }

    public void issueBook(Book<T> book) {
        if (books.contains(book)) {
            books.remove(book);
            issuedBooks.add(book);
        } else {
            System.out.println("This book is not available in the library.");
        }
    }

    public void displayIssuedBooks() {
        if (issuedBooks.isEmpty()) {
            System.out.println("No books have been issued.");
        } else {
            System.out.println("Issued books:");
            for (Book<T> book : issuedBooks) {
                System.out.println(book.getTitle());
            }
        }
    }
}

public class Mainbook {
    public static void main(String[] args) {
        Library<String> library = new Library<>();

        Book<String> book1 = new Book<>("Book 1");
        Book<String> book2 = new Book<>("Book 2");
        Book<String> book3 = new Book<>("Book 3");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Выдача книги
        library.issueBook(book2);

        // Вывод информации о выданных книгах
        library.displayIssuedBooks();
    }
}
