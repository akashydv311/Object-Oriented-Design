package concept.assignment;

// Interface for sending emails
interface EmailService {
    void sendEmail(String message);
}

// Implementation of EmailService
class EmailSender implements EmailService {
    @Override
    public void sendEmail(String message) {
        // Code to send email...
    }
}

// OrderProcessor using EmailService (dependency injection)
class OrderProcessor {
    private EmailService emailService;

    public OrderProcessor(EmailService emailService) {
        this.emailService = emailService;
    }

    public void processOrder() {
        // Processing logic...

        // Sending email using injected EmailService implementation
        emailService.sendEmail("Order processed successfully.");
    }
}

/*
 * OrderProcessor doesn't directly create an EmailSender instance. Instead,
 * it depends on an EmailService interface. This allows for better flexibility
 * and testability.
 * You can provide different implementations of EmailService (e.g.,
 * MockEmailSender, RealEmailSender)
 * without modifying the OrderProcessor class, promoting low coupling between
 * classes.
 */
public class Question6_LowCoupling {
    public static void main(String[] args) {

    }
}
