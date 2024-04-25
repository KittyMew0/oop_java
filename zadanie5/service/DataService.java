package geekbrains_course.oop_course.Seminar5_oop.service;
import java.util.ArrayList;
import java.util.List;

import geekbrains_course.oop_course.Seminar5_oop.model.Student;
import geekbrains_course.oop_course.Seminar5_oop.model.Teacher;
import geekbrains_course.oop_course.Seminar5_oop.model.User;


public class DataService {

    private List<User> students = new ArrayList<>();
    private List<User> teacher = new ArrayList<>();

    public void addUserList(User user) {
        if (user instanceof Student) {
            students.add(user);
        } else if (user instanceof Teacher) {
            teacher.add(user);
        }
    }

    public List<User> getUserList(String type) {
        if (type.equals("student")) {
            return students;
        } else if (type.equals("teacher")) {
            return teacher;
        }
        return null;
    }   
}