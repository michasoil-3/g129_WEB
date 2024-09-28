package second_module.interfaces;

public class BankApplication implements BankApplicationInterface{
    private String name;
    private Account[] accounts = new Account[1000];
    private int sizeOfAccounts = 0;

    public BankApplication(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void addAccount(Account a) {
        this.accounts[this.sizeOfAccounts++] = a;
    }

    @Override
    public void printAccounts() {
        for (int i = 0; i<this.sizeOfAccounts; i++) {
            System.out.println(this.accounts[i]);
        }
    }

    @Override
    public Account getMaxBalance() {
        Account a = this.accounts[0];
        for (int i = 0; i<this.sizeOfAccounts; i++) {
            if (a.getBalance() < this.accounts[i].getBalance())
                a = this.accounts[i];
        }
        return a;
    }
}
