package cleancode.srp;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartManager {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }
}


