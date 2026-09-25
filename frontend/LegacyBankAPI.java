// Adaptee: The existing class with an incompatible interface
public class LegacyBankAPI {
    public void makeBankTransfer(String accountNumber, double amount) {
        System.out.println("Transferring $" + amount + " to account " + accountNumber + " via Legacy Bank.");
    }
}