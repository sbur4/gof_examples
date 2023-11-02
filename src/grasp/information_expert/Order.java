package grasp.information_expert;

import java.util.List;

class Order {
    private List<Item> items;

    public double calculateTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }
}

class Item {
    private double price;

    public double getPrice() {
        return price;
    }
}