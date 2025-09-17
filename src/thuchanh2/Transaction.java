package thuchanh2;

public class Transaction {
    public void withdraw(BankAccount account, double amount) {
         account.setMoney(account.getMoney() - amount);
    }

    public void deposit(BankAccount account, double amount) {
        account.setMoney(account.getMoney() + amount);
    }
}
