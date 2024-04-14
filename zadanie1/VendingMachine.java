package geekbrains_course.oop_course.Seminar1_oop;

import java.util.List;

public interface VendingMachine {
    void initProduct(List<Product> a);
    Product getProduct(String name);
}