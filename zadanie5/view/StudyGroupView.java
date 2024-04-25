package geekbrains_course.oop_course.Seminar5_oop.view;

import java.util.ArrayList;
import java.util.List;

import geekbrains_course.oop_course.Seminar5_oop.controller.StudyGroupController;
import geekbrains_course.oop_course.Seminar5_oop.model.StudyGroup;
import geekbrains_course.oop_course.Seminar5_oop.model.Teacher;
import geekbrains_course.oop_course.Seminar5_oop.model.User;

public class StudyGroupView {
    
    private StudyGroupController studyGroupController = new StudyGroupController();
    private List<User> students;

    public StudyGroupView(){
        this.students = new ArrayList<>();
    }

    public void addStudent(User student){
               students.add(student);
    }
    
    public StudyGroup createStudyGroup(String groupName, Teacher teacher, List<User> students) {
        System.out.println("New student group '" + groupName +"' was formed of " + students.size() + " students, " + teacher);
        return studyGroupController.createStudyGroup(groupName, teacher, students);
    }

    public void displayStudyGroup(StudyGroup studyGroup) {
        System.out.println(studyGroup);
    }

    public List<User> getStudents() {
        return students;
    }
}