package geekbrains_course.oop_course.Seminar6_oop;

interface BookAction<T> {
    void takeBook(Book<T> book);
    void returnBook(Book<T> book);
}