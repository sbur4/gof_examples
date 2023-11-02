package grasp.controller;

import java.util.List;

class OrderController {
    public void createOrder(Customer customer, List<Item> items) {
        Order order = new Order(customer, items);
        order.processOrder();
    }
}

class Order {
    private Customer customer;
    private List<Item> items;

    public Order(Customer customer, List<Item> items) {
        this.customer = customer;
        this.items = items;
    }

    public void processOrder() {
        // Process the order
    }
}

class Customer {
    // Customer details
}

class Item {
    private double price;

    public double getPrice() {
        return price;
    }
}