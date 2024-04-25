package geekbrains_course.oop_course.Seminar5_oop.model;

import java.util.List;

public class StudyGroup {
    private String groupName;
    private Teacher teacher;
    private List<User> students;

    public StudyGroup(String groupName, Teacher teacher, List<User> students) {
        this.groupName = groupName;
        this.teacher = teacher;
        this.students = students;
    }

    public String getGroupName() {
        return groupName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<User> getStudents() {
        return students;
    }

    public void setStudents(List<User> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Student group '" + groupName + "' {" +
                teacher +
                ", Students: " + students +
                '}';
    }
}