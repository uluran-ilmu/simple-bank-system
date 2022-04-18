package DataStructure;

import java.util.ArrayList;

public class UserDatabase {
    private ArrayList<User> users = new ArrayList<User>();
    private int maxUsers = 5;
    private int lastID = 0;

    public boolean isFull() {
        return (users.size() >= maxUsers);
    }

    public boolean isEmpty() {
        return (users.size() == 0);
    }

    public void addUser(User user) {
        if (!isFull()) {
            users.add(user);
        }
    }

    public User createUser(String name, String password, int initialBalance) {
        if (!isFull()) {
            int id = lastID++;
            User user = new User(id, name, password);
            user.getBank().deposit(initialBalance);
            addUser(user);
            return user;
        }
        return null;
    }

    public User findUser(int id, String password) {
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            if (user.isValid(id, password)) {
                return user;
            }
            System.out.println("" + user.getId() + user.getPassword());
        }
        return null;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public int getMaxUsers() {
        return maxUsers;
    }

    public void setMaxUsers(int maxUsers) {
        this.maxUsers = maxUsers;
    }
}
