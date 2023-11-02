package grasp.indirection;

class PaymentService {
    public void processPayment(Order order) {
        // Payment processing logic
    }
}

class OrderController {
    private PaymentService paymentService;

    public OrderController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder(Order order) {
        // Order processing logic
        paymentService.processPayment(order);
    }
}

class Order {}