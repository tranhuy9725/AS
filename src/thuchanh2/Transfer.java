package thuchanh2;

public class Transfer {
    public void transferMoney(BankAccount from, BankAccount to, double amount) {
        Transaction transaction = new  Transaction();
        transaction.deposit(from, amount);
        transaction.withdraw(to, amount);
    }


}
