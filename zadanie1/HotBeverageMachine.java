package geekbrains_course.oop_course.Seminar1_oop;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class HotBeverageMachine implements VendingMachine {
    private Map<Integer, HotBeverage> beverages;

    public HotBeverageMachine() {
        this.beverages = new HashMap<>();
    }

    public void addBeverage(int id, HotBeverage beverage) {
        beverages.put(id, beverage);
    }

    
    public HotDrink getProduct(int name, int temperature) {
        HotBeverage beverage = beverages.get(name);
        if (beverage instanceof HotDrink) {
            HotDrink hotDrink = (HotDrink) beverage;
            if (hotDrink.getTemperature() == temperature) {
                return hotDrink;
            }
        }
        return null;
    }

}
