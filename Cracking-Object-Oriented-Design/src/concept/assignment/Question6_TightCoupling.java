package concept.assignment;

class OrderProcessor {
    public void processOrder() {
        // Processing logic...

        // Sending email directly from OrderProcessor
        EmailSender emailSender = new EmailSender();
        emailSender.sendEmail("Order processed successfully.");
    }
}

class EmailSender {
    public void sendEmail(String message) {
        // Code to send email...
    }
}

// OrderProcessor is tightly coupled with EmailSender

public class Question6_TightCoupling {
    public static void main(String[] args) {

    }
}
