package geekbrains_course.oop_course.Seminar2_oop;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer's name: ");
        String name = sc.nextLine();

        Actor act = new Human(name);
        
        sc.close();

        Market market = new Market();
        market.acceptToMarket(act);
        market.take(act);
        market.giveOrder();
        market.getOrder();
        market.out();
        market.releaseFromMarket(List.of(act));
    }
}
