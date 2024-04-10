package geekbrains_course.oop_course.Seminar1_oop;

public interface MarketBehavior {
    void acceptToMarket(Customer actor);
    void releaseFromMarket(Customer actor);
    void update();
}