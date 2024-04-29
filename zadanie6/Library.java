package geekbrains_course.oop_course.Seminar6_oop;

import java.util.ArrayList;
import java.util.List;

class Library<T> implements BookAction<T> {
	private List<Book<T>> books;
    private List<Book<T>> issuedBooks; 

    public Library() {
        books = new ArrayList<>();
        issuedBooks = new ArrayList<>();
    }

    public void addBook(Book<T> book) {
        books.add(book);
    }
    
    /*добавляем новый метод для точной записи какую книгу взяли*/
    public Book<T> getBookByTitle(String title) {
        for (Book<T> book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }
    
    public void issueBook(Book<T> book) {
        if (books.contains(book)) {
            books.remove(book);
            issuedBooks.add(book);
        } else {
            System.out.println("This book is not available in the library.");
        }
    }
    
    /*метод для показа доступных книг*/
    public void displayAvailableBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            System.out.println("Available books:");
            for (Book<T> book : books) {
                System.out.println(book.getTitle());
            }
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
    
    /*улучшаем работу методов выдачи и сдачи книг*/
    @Override
    public void takeBook(Book<T> book) {
        if (books.contains(book)) {
            books.remove(book);
            issuedBooks.add(book);
            System.out.println("Book \"" + book.getTitle() + "\" has been issued.");
        } else {
            System.out.println("This book is not available in the library.");
        }
    }

    @Override
    public void returnBook(Book<T> book) {
        if (issuedBooks.contains(book)) {
            issuedBooks.remove(book);
            books.add(book);
            System.out.println("Book \"" + book.getTitle() + "\" has been returned.");
        } else {
            System.out.println("This book was not issued from this library.");
        }
    }
}