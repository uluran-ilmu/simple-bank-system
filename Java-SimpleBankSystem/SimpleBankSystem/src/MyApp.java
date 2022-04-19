import DataStructure.User;
import DataStructure.UserDatabase;

public class MyApp {
    public static UserDatabase userDatabase = new UserDatabase();
    public static User currentUser;
    public static void main(String[] args) {
        new Login();
    }
}
