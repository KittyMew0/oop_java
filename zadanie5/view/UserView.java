package geekbrains_course.oop_course.Seminar5_oop.view;

import java.util.List;

import geekbrains_course.oop_course.Seminar5_oop.controller.Controller;
import geekbrains_course.oop_course.Seminar5_oop.model.Student;
import geekbrains_course.oop_course.Seminar5_oop.model.Teacher;
import geekbrains_course.oop_course.Seminar5_oop.model.User;

public class UserView {
    private Controller controller = new Controller();

    public void addUser(User user) {
        if (user instanceof Student) {
            controller.addUserList(user);
            System.out.println(user + " added");
        } else if (user instanceof Teacher) {
            controller.addUserList(user);
            System.out.println(user + " added");
        }
    }

    public List<User> getUserList(String type) {
        switch (type) {
            case "student":
                return controller.getUserList("student");
            case "teacher":
                return controller.getUserList("teacher");
            default:
                return null;
        }
    }
}