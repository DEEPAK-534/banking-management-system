// Subclass: SavingsAccount
public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        balance += balance * interestRate / 100;
        System.out.println("Interest applied. New balance: " + balance);
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        applyInterest(); // Applying interest before withdrawal
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds after applying interest.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }
}