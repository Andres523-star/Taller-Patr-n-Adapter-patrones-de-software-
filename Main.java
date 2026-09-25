// Client: Interacts with the Abstraction
public class Main {
    public static void main(String[] args) {
        // 1. Using Bridge Pattern: One-Time Payment with Stripe
        Payment stripeOneTime = new OneTimePayment(new StripeProvider());
        stripeOneTime.process(49.99);

        // 2. Using Bridge Pattern: Subscription Payment with PayPal
        Payment paypalSubscription = new SubscriptionPayment(new PayPalProvider());
        paypalSubscription.process(19.99);

        // 3. Using Adapter Pattern (and Bridge): One-Time Payment with Legacy Bank
        // We adapt the LegacyBankAPI to work as a PaymentProvider
        LegacyBankAPI legacyBank = new LegacyBankAPI();
        PaymentProvider legacyBankAdapter = new LegacyBankAdapter(legacyBank, "ACC-123456");
        
        Payment legacyOneTime = new OneTimePayment(legacyBankAdapter);
        legacyOneTime.process(100.00);
    }
}