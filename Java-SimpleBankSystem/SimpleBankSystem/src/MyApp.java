public class MyApp {
    private int totalUser = 0;
    private int currentId;
    Bank[] bank = new Bank[5];

    public int getTotalUser() {
        return totalUser;
    }

    public void setTotalUser() {
        totalUser++;
    }

    public int getCurrentId() {
        return currentId;
    }

    public void setCurrentId(int id) {
        currentId = id;
    }

    public boolean isUserFull() {
        if(getTotalUser() == bank.length) {
            return true;
        }

        return false;
    }

    public boolean isUserEmpty() {
        if(getTotalUser() == 0) {
            return true;
        }

        return false;
    }

    public void CreateAccount(String id, String name, String password, int deposit) {
        bank[getTotalUser()] = new Bank(id, name, password, deposit);
    }

    public boolean validateUser(String id, String password) {
        for(int i = 0; i < bank.length; i++) {
            if(bank[i].user.getID().equals(id) && bank[i].user.getPassword().equals(password)) {
                return true;
            }
        }

        return false;
    }

    public void getUser() {
        for(int i = 0; i < bank.length; i++) {
            System.out.println("ID - " + bank[i].user.getID());
            System.out.println("Name     : " + bank[i].user.getName());
            System.out.println("Password : " + bank[i].user.getPassword());
            System.out.println("Balance  : Rp " + bank[i].getBalance() + ",00");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new BankApp();
    }
}
