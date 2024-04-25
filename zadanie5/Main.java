package geekbrains_course.oop_course.Seminar5_oop;

import geekbrains_course.oop_course.Seminar5_oop.model.Student;
import geekbrains_course.oop_course.Seminar5_oop.model.StudyGroup;
import geekbrains_course.oop_course.Seminar5_oop.model.Teacher;
import geekbrains_course.oop_course.Seminar5_oop.model.User;
import geekbrains_course.oop_course.Seminar5_oop.view.StudyGroupView;

public class Main {
    public static void main(String[] args) {
        User student1 = new Student("Kimberly Dominguez", 18);
        User student2 = new Student("Steven Gill", 20);
        User student3 = new Student("Marley Copeland", 20);
        User student4 = new Student("Douglas Cobb", 19);
        User teacher1 = new Teacher("Makenna Cano", 45, "maths");
        
        User student5 = new Student("ÍSincere Stout", 21);
        User student6 = new Student("Katelyn Hickman", 20);
        User student7 = new Student("Esteban Cantu", 19);
        User student8 = new Student("Rosa Ryan", 20);
        User student9 = new Student("ÑStephen Wong", 19);
        User teacher2 = new Teacher("Carlos Kane", 50, "science");

        StudyGroupView students1 = new StudyGroupView();
        students1.addStudent(student1);
        students1.addStudent(student2);
        students1.addStudent(student3);
        students1.addStudent(student4);
        
        StudyGroupView students2 = new StudyGroupView();
        students2.addStudent(student5);
        students2.addStudent(student6);
        students2.addStudent(student7);
        students2.addStudent(student8);
        students2.addStudent(student9);

        StudyGroupView studyGroupView = new StudyGroupView();
        StudyGroup studyGroup1 = studyGroupView.createStudyGroup("Maths", (Teacher) teacher1, students1.getStudents());
        StudyGroup studyGroup2 = studyGroupView.createStudyGroup("Science", (Teacher) teacher2, students2.getStudents());
        studyGroupView.displayStudyGroup(studyGroup1);
        studyGroupView.displayStudyGroup(studyGroup2);
    }
}