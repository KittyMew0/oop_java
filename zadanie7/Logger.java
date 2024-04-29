package geekbrains_course.oop_course.Seminar7_oop;

import java.util.Date;

public class Logger {

    public void log(String message) {
        Date currentDate = new Date();
        System.out.println(currentDate + ": " + message);
    }
}
