package second_module.generics;

import java.util.ArrayList;
import java.util.List;

public class Bank <T extends BankAccount> {
    private List<T> accounts = new ArrayList<>();

    public Bank() {
    }

    public Bank(List<T> accounts) {
        this.accounts = accounts;
    }

    public List<T> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<T> accounts) {
        this.accounts = accounts;
    }

    void addAccount(T account) {
        this.accounts.add(account);
    }

    void removeAccount(String accountNumber) {
        T selectedAccount = null;
        for (T account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                selectedAccount = account;
            }
        }
        if (selectedAccount != null)
            this.accounts.remove(selectedAccount);
    }

    T getAccount(String accountNumber) {
        for (T account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
}
