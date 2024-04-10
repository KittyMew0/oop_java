package geekbrains_course.oop_course.Seminar1_oop;

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	System.out.print("Enter customer's name: ");
    	Scanner sc = new Scanner(System.in);
    	String name = sc.nextLine();

        Human hm = new Human();
        hm.name = name;
        
        sc.close();
        
        HotBeverage tea = new HotBeverage("Tea");
        HotDrink coffee = new HotDrink("Coffee", 80);
        HotDrink cocoa = new HotDrink("Cocoa", 60);

        HotBeverageMachine machine = new HotBeverageMachine();
        machine.addBeverage(1, tea);
        machine.addBeverage(2, coffee);
        machine.addBeverage(3, cocoa);

        HotBeverage teaFromMachine = machine.getProduct(1, 100);
        HotDrink coffeeFromMachine = machine.getProduct(2, 80);
        HotDrink cocoaFromMachine = machine.getProduct(3, 60);

        System.out.println("Tea from machine: " + (teaFromMachine != null ? teaFromMachine.getName() : "Not available"));
        System.out.println("Coffee from machine: " + (coffeeFromMachine != null ? coffeeFromMachine.getName() : "Not available"));
        System.out.println("Cocoa from machine: " + (cocoaFromMachine != null ? cocoaFromMachine.getName() : "Not available"));

        Market market = new Market();

        market.acceptToMarket(hm);
        market.takeInQueue(hm);
        market.giveOrder();
        market.takeOrder();
        market.releaseFromQueue();
        market.releaseFromMarket(hm);
        market.update();
    }
}