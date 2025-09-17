package thuchanh2;

import java.util.List;

public class BankAccountManagement {
    private List<BankAccount> accounts;

    public BankAccountManagement(List<BankAccount> accounts) {
        this.accounts = accounts;
    }

    public void openAccount(BankAccount account) {
        this.accounts.add(account);
    }

    public void closeAccount(BankAccount account) {
        this.accounts.remove(account);
    }
}
