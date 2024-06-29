package Bank_Application;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double initialBalance, double overdraftLimit) {
        super(accountNumber, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " into Checking Account.");
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Checking Account.");
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }

    @Override
    public String getAccountType() {
        return "Checking Account";
    }
}
