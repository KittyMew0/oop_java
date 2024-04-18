package geekbrains_course.oop_course.Seminar3_oop;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static String getStudentsPlural(int count) {
        if (count == 1) {
            return "student";
        } else {
            return "students";
        }
    }

    public static void main(String[] args) {
        StudentGroup group1 = new StudentGroup("Science");
        group1.addStudent(new Student("Kristin Mcdowell"));
        group1.addStudent(new Student("Gregory Zamora"));
        group1.addStudent(new Student("Kayden Brewer"));
        group1.addStudent(new Student("Cheyenne Duarte"));

        StudentGroup group2 = new StudentGroup("Languages");
        group2.addStudent(new Student("Roman Dodson"));
        group2.addStudent(new Student("Alessandro Bates"));
        group2.addStudent(new Student("Kathleen Alexander"));
        group2.addStudent(new Student("Bryan Hampton"));
        group2.addStudent(new Student("Macie Norton"));
        group2.addStudent(new Student("Zayne Mercer"));

        StudentGroup group3 = new StudentGroup("Maths");
        group3.addStudent(new Student("Lee Leonard"));
        group3.addStudent(new Student("Christina Ryan"));
        group3.addStudent(new Student("Sanaa Bryan"));
        group3.addStudent(new Student("Jasmine Washington"));
        group3.addStudent(new Student("Brady Joyce"));

        Stream stream = new Stream(group1, group2, group3);

        for (StudentGroup group : stream) {
            int grSize = group.getGroupSize();
            System.out.printf("Group, specialisation "
                    + group.getGroupSpecialisation() + ", has %d %s: \n", grSize, getStudentsPlural(grSize));
            int count = 0;
            for (Student student : group) {
                System.out.printf("     %d. %s, ID: %d \n", ++count, student.getName(), student.getId());
            }
        }

    }
}