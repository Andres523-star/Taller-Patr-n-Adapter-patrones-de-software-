// Refined Abstraction: Extends the interface defined by Abstraction
public class SubscriptionPayment extends Payment {
    public SubscriptionPayment(PaymentProvider paymentProvider) {
        super(paymentProvider);
    }

    @Override
    public void process(double amount) {
        System.out.println("--- Initiating Subscription Payment ---");
        paymentProvider.processPayment(amount);
    }
}