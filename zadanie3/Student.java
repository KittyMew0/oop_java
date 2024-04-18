package geekbrains_course.oop_course.Seminar3_oop;

class Student implements Comparable<Student>{
    private static int number;
    private String name;
    private int id;
    
    static {
        Student.number = 0;
   }
    public Student(String name) {
        this.name = name;
        this.id = ++number;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int compareTo(Student o) {   
        return id - o.getId();
    }
    
    public String toString() {
        return getName();
    }
}