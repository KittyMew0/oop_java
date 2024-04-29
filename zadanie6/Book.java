package geekbrains_course.oop_course.Seminar6_oop;

import java.util.Objects;

class Book<T> {
    private T title; 

    public Book(T title) {
        this.title = title;
    }

    public T getTitle() {
        return title;
    }

    /*добавляем метод для проверки книг которые взяли в библиотекедля возвращения*/
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Book<?> book = (Book<?>) obj;
        return Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}
