public class Bank {
    private int Balance = 0;
    User user;

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance += balance;
    }

   Bank(String id, String name, String password, int deposit) {
        user = new User(id, name, password);
        Balance += deposit;
   }

    Boolean validateUser(String id, String password) {
        if(user.getID().equals(id) && user.getPassword().equals(password)) {
           return true;
        }

        return false;
    }

    void ShowUser() {
        System.out.println("ID - " + user.getID());
        System.out.println("Name     : " + user.getName());
        System.out.println("Password : " + user.getPassword());
        System.out.println("Balance  : Rp " + getBalance() + ",00");
    }
}
