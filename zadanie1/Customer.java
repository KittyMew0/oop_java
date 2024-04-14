package geekbrains_course.oop_course.Seminar1_oop;

public abstract class Customer implements CustomerBehavior {
    protected String name;
    protected boolean isMakeOrderClass;
    protected boolean isTakeOrderClass;

    abstract String getName();
}