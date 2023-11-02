package grasp.protected_variations;

interface PaymentProvider {
    void processPayment(Order order);
}

class PaymentGateway implements PaymentProvider {
    public void processPayment(Order order) {
        // Logic for processing payment
    }
}

class Order {
    private PaymentProvider paymentProvider;

    public Order(PaymentProvider paymentProvider) {
        this.paymentProvider = paymentProvider;
    }

    public void checkout() {
        paymentProvider.processPayment(this);
        // Other order processing logic
    }
}