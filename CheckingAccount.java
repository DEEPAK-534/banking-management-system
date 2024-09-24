// Subclass: CheckingAccount
public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        if (balance - amount < -overdraftLimit) {
            throw new InsufficientFundsException("Withdrawal exceeds overdraft limit.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }
}