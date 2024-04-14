package geekbrains_course.oop_course.Seminar2_oop;

public class Human extends Actor {
	public Human (String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setMakeOrder() {
		isMakeOrder = true;
	}
	
	public void setTakeOrder() {
		isTakeOrder = true;
	}
	
	public boolean isMakeOrder() {
		return isMakeOrder;
	}
	
	public boolean isTakeOrder() {
		return isTakeOrder;
	}
}
