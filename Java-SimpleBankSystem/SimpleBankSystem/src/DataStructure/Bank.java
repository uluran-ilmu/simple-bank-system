package DataStructure;

public class Bank {
    private int balance = 0;
    private History history = new History();

    public void deposit(int amount){
        balance += amount;
        history.createEntry(balance, amount);
    }

    public void withdraw(int amount) {
        if (canWithdraw(amount)) {
            balance -= amount;
            history.createEntry(balance, -amount);
        }
    }

    public boolean canWithdraw(int amount) {
        return(balance - amount >= 0);
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public History getHistory() {
        return history;
    }

    public void setHistory(History history) {
        this.history = history;
    }
}
