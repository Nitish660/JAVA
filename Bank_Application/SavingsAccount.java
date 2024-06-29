package Bank_Application;

public class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;

    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + "in your account");
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("\"Withdrew \" + amount + \" from Savings Account.\"");

        } else {

            System.out.println("Insufficient balance.");
        }
    }
    public String getAccountType() {
        return "Savings Account";
    }

}