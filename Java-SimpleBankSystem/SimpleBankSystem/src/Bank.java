public class Bank {
    private int Balance = 0;
    User user;

    Bank(String id, String name, String password, int deposit) {
        user = new User(id, name, password);
        setBalance(deposit);
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance += balance;
    }
}
