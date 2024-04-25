package geekbrains_course.oop_course.Seminar5_oop.controller;

import java.util.List;

import geekbrains_course.oop_course.Seminar5_oop.model.StudyGroup;
import geekbrains_course.oop_course.Seminar5_oop.model.Teacher;
import geekbrains_course.oop_course.Seminar5_oop.model.User;
import geekbrains_course.oop_course.Seminar5_oop.service.StudyGroupService;

public class StudyGroupController {
    StudyGroupService studyGroupService = new StudyGroupService();


    public StudyGroup createStudyGroup(String groupName, Teacher teacher, List<User> students) {
        return studyGroupService.createStudyGroup(groupName, teacher, students);
    }
}