// Refined Implementation: Concrete implementation for PayPal
public class PayPalProvider implements PaymentProvider {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing $" + amount + " via PayPal API.");
    }
}