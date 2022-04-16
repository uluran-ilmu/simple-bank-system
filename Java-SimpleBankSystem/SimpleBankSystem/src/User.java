public class User {
    private String UserID;
    private String UserName;
    private String UserPassword;

    public User(String ID, String name, String password) {
        UserID = ID;
        UserName = name;
        UserPassword = password;
    }

    public String getID() {
        return UserID;
    }

    public void setID(String ID) {
        UserID = ID;
    }

    public String getName() {
        return UserName;
    }

    public void setName(String name) {
        UserName = name;
    }

    public String getPassword() {
        return UserPassword;
    }

    public void setPassword(String password) {
        UserPassword = password;
    }
}
