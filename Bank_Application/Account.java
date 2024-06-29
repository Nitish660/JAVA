package Bank_Application;

public abstract class Account implements Transaction {
    
    private String accountNumber;
    protected double balance;  // Protected so subclasses can access it

    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Abstract method for getting the account type
    public abstract String getAccountType();

    // Implementing the getBalance method from the Transaction interface
    @Override
    public double getBalance() {
        return balance;
    }
}
