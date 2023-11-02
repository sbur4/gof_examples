package grasp.pure_fabrication;

class EmailService {
    public void sendEmail(String to, String subject, String message) {
        // Send an email
    }
}

class Order {
    public void sendOrderConfirmation() {
        EmailService emailService = new EmailService();
        emailService.sendEmail("email", "Order Confirmation", "Thank you for your order.");
    }
}