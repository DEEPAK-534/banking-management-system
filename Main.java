public class Main {
    public static void main(String[] args) {
        try {
            // Create a SavingsAccount
            SavingsAccount savings = new SavingsAccount(101, 1000.0, 5.0);
            savings.deposit(500);
            savings.applyInterest();
            savings.withdraw(300);
            System.out.println("Savings Account Balance: " + savings.getBalance());

            // Create a CheckingAccount
            CheckingAccount checking = new CheckingAccount(102, 500.0, 200.0);
            checking.deposit(200);
            checking.withdraw(700);
            System.out.println("Checking Account Balance: " + checking.getBalance());

        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}