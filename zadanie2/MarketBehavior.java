package geekbrains_course.oop_course.Seminar2_oop;

import java.util.List;

public interface MarketBehavior {
	void acceptToMarket(Actor actor);
	void releaseFromMarket(List<Actor> actors);
}
