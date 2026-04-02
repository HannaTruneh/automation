package cleancode.srp;

import java.util.List;

public class Calculator {

    private List<Item> items;

    public double calculateTotalPrice(List<Item> items) {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }
}

