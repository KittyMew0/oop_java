package geekbrains_course.oop_course.Seminar2_oop;

public abstract class Actor implements ActorBehavior {
	protected String name;
	protected boolean isMakeOrder;
	protected boolean isTakeOrder;
	
	public abstract String getName();
}
