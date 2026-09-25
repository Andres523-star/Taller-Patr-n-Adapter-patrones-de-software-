// Refined Abstraction: Extends the interface defined by Abstraction
public class OneTimePayment extends Payment {
    public OneTimePayment(PaymentProvider paymentProvider) {
        super(paymentProvider);
    }

    @Override
    public void process(double amount) {
        System.out.println("--- Initiating One-Time Payment ---");
        paymentProvider.processPayment(amount);
    }
}