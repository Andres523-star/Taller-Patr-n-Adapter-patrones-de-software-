// Refined Implementation: Concrete implementation for Stripe
public class StripeProvider implements PaymentProvider {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing $" + amount + " via Stripe API.");
    }
}