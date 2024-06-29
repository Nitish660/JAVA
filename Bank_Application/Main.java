package Bank_Application;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);
        String command;

        do {
            System.out.println("Enter command (new, deposit, withdraw, balance, exit): ");
            command = scanner.nextLine();

            switch (command) {
                case "new":
                    System.out.println("Enter account type (savings/checking): ");
                    String accountType = scanner.nextLine();
                    System.out.println("Enter account number: ");
                    String accountNumber = scanner.nextLine();
                    System.out.println("Enter initial balance: ");
                    double initialBalance = scanner.nextDouble();
                    scanner.nextLine();  // Consume newline

                    if (accountType.equalsIgnoreCase("savings")) {
                        System.out.println("Enter interest rate: ");
                        double interestRate = scanner.nextDouble();
                        scanner.nextLine();  // Consume newline
                        SavingsAccount savingsAccount = new SavingsAccount(accountNumber, initialBalance, interestRate);
                        bank.addAccount(savingsAccount);
                    } else if (accountType.equalsIgnoreCase("checking")) {
                        System.out.println("Enter overdraft limit: ");
                        double overdraftLimit = scanner.nextDouble();
                        scanner.nextLine();  // Consume newline
                        CheckingAccount checkingAccount = new CheckingAccount(accountNumber, initialBalance, overdraftLimit);
                        bank.addAccount(checkingAccount);
                    } else {
                        System.out.println("Invalid account type.");
                    }
                    break;

                case "deposit":
                    System.out.println("Enter account number: ");
                    accountNumber = scanner.nextLine();
                    System.out.println("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    scanner.nextLine();  // Consume newline

                    Account account = bank.findAccount(accountNumber);
                    if (account != null) {
                        account.deposit(depositAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case "withdraw":
                    System.out.println("Enter account number: ");
                    accountNumber = scanner.nextLine();
                    System.out.println("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    scanner.nextLine();  // Consume newline

                    account = bank.findAccount(accountNumber);
                    if (account != null) {
                        account.withdraw(withdrawAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case "balance":
                    System.out.println("Enter account number: ");
                    accountNumber = scanner.nextLine();

                    account = bank.findAccount(accountNumber);
                    if (account != null) {
                        System.out.println("Current balance: " + account.getBalance());
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case "exit":
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid command.");
            }
        } while (!command.equalsIgnoreCase("exit"));

        scanner.close();
    }
}
