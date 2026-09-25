// Adapter: Implements the Target interface and holds a reference to the Adaptee
public class LegacyBankAdapter implements PaymentProvider {
    private LegacyBankAPI legacyBankAPI;
    private String accountNumber;

    public LegacyBankAdapter(LegacyBankAPI legacyBankAPI, String accountNumber) {
        this.legacyBankAPI = legacyBankAPI;
        this.accountNumber = accountNumber;
    }

    @Override
    public void processPayment(double amount) {
        // Translating the modern processPayment call to the legacy makeBankTransfer call
        legacyBankAPI.makeBankTransfer(accountNumber, amount);
    }
}