package geekbrains_course.oop_course.Seminar5_oop.service;

import java.util.List;

import geekbrains_course.oop_course.Seminar5_oop.model.StudyGroup;
import geekbrains_course.oop_course.Seminar5_oop.model.Teacher;
import geekbrains_course.oop_course.Seminar5_oop.model.User;

public class StudyGroupService {

    public StudyGroup createStudyGroup(String groupName, Teacher teacher, List<User> students) {
        return new StudyGroup(groupName, teacher, students);
    }
}