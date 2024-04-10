package geekbrains_course.oop_course.Seminar1_oop;

public class HotDrink extends HotBeverage {
    private int temperature;

    public HotDrink(String name, int temperature) {
        super(name);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}

