package Bank_Application;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank(){
      
        accounts = new ArrayList<>();


    }

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println(account.getAccountType() + " added with account number: " + account.getAccountNumber());
    }

    public Account findAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;}
}
