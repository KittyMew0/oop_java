package geekbrains_course.oop_course.Seminar2_oop;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehavior, QueueBehavior {
    private List<Actor> actorsOnMarket = new ArrayList<>();
    private List<Actor> queue = new ArrayList<>();
    private String order;

    @Override
    public void acceptToMarket(Actor actor) {
        actorsOnMarket.add(actor);
        System.out.println(actor.getName() + " has entered the market.");
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        actorsOnMarket.removeAll(actors);
        System.out.println("All actors have left the market.");
    }

    @Override
    public void take(Actor actor) {
        queue.add(actor);
        System.out.println(actor.getName() + " has joined the queue.");
    }

    @Override
    public void out() {
        if (!queue.isEmpty()) {
            Actor actor = queue.remove(0);
            System.out.println(actor.getName() + " has left the queue.");
        }
    }

    @Override
    public void getOrder() {
        if (!queue.isEmpty()) {
            Actor actor = queue.get(0);
            System.out.println(actor.getName() + " received the order: " + order);
        }
    }

    @Override
    public void giveOrder() {
        order = " "; 
        System.out.println("Order is ready: " + order);
    }
}
