import DataStructure.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterMenu {
    private JFrame frame;
    private JPanel Canvas;
    private JTextField TxtFieldName;
    private JButton BtnLogin;
    private JButton BtnRegister;
    private JLabel LblRegister;
    private JLabel LblName;
    private JLabel LblPassword;
    private JTextField TxtFieldDeposit;
    private JPasswordField PswdFieldPassword;

    public RegisterMenu() {
        frame = new JFrame("RegisterMenu");
        frame.setContentPane(Canvas);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        BtnLogin.addActionListener((event)->onLoginActionPerformed());
        BtnRegister.addActionListener((event)->onRegisterActionPerformed());
    }

    private void onRegisterActionPerformed() {
        if(MyApp.userDatabase.isFull()) {
            JOptionPane.showMessageDialog(null, "User penuh!");
        }
        else {
            String name = TxtFieldName.getText();
            String password = String.valueOf(PswdFieldPassword.getPassword());
            int deposit = Integer.parseInt(TxtFieldDeposit.getText());

            MyApp.currentUser = MyApp.userDatabase.createUser(name, password, deposit);

            JOptionPane.showMessageDialog(null, "Akun berhasil dibuat");

            frame.dispose();
            new BankAppMenu();
        }
    }
    private void onLoginActionPerformed() {
        frame.dispose();
        new Login();
    }
}
