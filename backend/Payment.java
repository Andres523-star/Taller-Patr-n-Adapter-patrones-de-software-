// Abstraction: Defines the high-level interface and maintains a reference to the Implementation
public abstract class Payment {
    protected PaymentProvider paymentProvider;

    public Payment(PaymentProvider paymentProvider) {
        this.paymentProvider = paymentProvider;
    }

    public abstract void process(double amount);
}