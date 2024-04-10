package geekbrains_course.oop_course.Seminar1_oop;

public interface QueueBehavior {
    void takeInQueue(Customer actor);
    void takeOrder();
    void giveOrder();
    void releaseFromQueue();
}