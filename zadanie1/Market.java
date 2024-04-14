package geekbrains_course.oop_course.Seminar1_oop;

import java.util.*;

public class Market implements MarketBehavior, QueueBehavior {
    List<Customer> actors = new LinkedList<>();
    Queue<Customer> actorsQueue = new ArrayDeque<>();

    @Override
    public void acceptToMarket(Customer actor) {
        System.out.println(actor.getName() + " entered in the shop");
        actors.add(actor);
    }

    @Override
    public void releaseFromMarket(Customer actor) {
        actors.remove(actor);
        System.out.println(actor.getName() + " left the shop");
    }

    @Override
    public void update() {
    }

    @Override
    public void takeInQueue(Customer actor) {
        actorsQueue.add(actor);
        System.out.println(actor.getName() + " got in line");
    }

    @Override
    public void takeOrder() {
        actorsQueue.peek().isTakeOrder();
        System.out.println(actorsQueue.peek().getName() + " took the order");
    }

    @Override
    public void giveOrder() {
        actorsQueue.peek().isMakeOrder();
        System.out.println(actorsQueue.peek().getName() + " made an order");
    }

    @Override
    public void releaseFromQueue() {
        System.out.println(actorsQueue.peek().getName() + " left the queue");
        actorsQueue.poll();
    }
}