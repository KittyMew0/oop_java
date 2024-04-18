package geekbrains_course.oop_course.Seminar3_oop;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class StudentGroup implements Iterable<Student> {
    private List<Student> students;
    private String groupSpecialisation;
    public Object getGroupName;

    public StudentGroup(String groupSpecialisation) {
        this.students = new ArrayList<>();
        this.groupSpecialisation = groupSpecialisation;
    }

    public String getGroupSpecialisation() {
        return groupSpecialisation;
    }

    public int getGroupSize() {
        return students.size();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student getStudent(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator();
    }

    private class StudentGroupIterator implements Iterator<Student> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < students.size();
        }

        @Override
        public Student next() {
            return students.get(index++);
        }

        @Override
        public void remove() {
            if (index > 0) {
                students.remove(--index);
            } else {
                throw new IllegalStateException("next must be called before remove");
            }
        }
    }
}