package geekbrains_course.oop_course.Seminar5_oop.model;

public class Teacher extends User{
    private String disciplesTaught;

    public Teacher(String name, int age, String disciplesTaught) {
        super(name, age);
        this.disciplesTaught = disciplesTaught;
    }

    public String getDisciplesTaught() {
        return disciplesTaught;
    }

    public void setDisciplesTaught(String disciplesTaught) {
        this.disciplesTaught = disciplesTaught;
    }

    public String toString() {
        return "Teacher {" +
                "name - '" + name + '\'' +
                ", age - " + age +
                ", specialisation - '" + disciplesTaught + "'}";
    }
}