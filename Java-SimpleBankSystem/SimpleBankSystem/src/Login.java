import DataStructure.User;

import javax.swing.*;

public class Login {
    private JFrame frame;
    private JPanel Canvas;
    private JPanel LoginView;
    private JTextField TxtFieldId;
    private JButton BtnRegister;
    private JButton BtnLogin;
    private JLabel LblWelcome;
    private JLabel LblId;
    private JLabel LblPassword;
    private JPasswordField PswdFieldPassword;

    public Login() {
        frame = new JFrame("BankApp");
        frame.setContentPane(Canvas);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        BtnRegister.addActionListener((event)->onRegisterActionPerformed());
        BtnLogin.addActionListener((event)->onLoginActionPerformed());
    }

    private void onRegisterActionPerformed() {
        if (MyApp.userDatabase.isFull()) {
            JOptionPane.showMessageDialog(null, "User sudah full!");
        } else {
            frame.dispose();
            new RegisterMenu();
        }
    }

    private void onLoginActionPerformed() {
        if(MyApp.userDatabase.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Belum ada user!");
        }
        else {
            String id = TxtFieldId.getText();
            String password = String.valueOf(PswdFieldPassword.getPassword());
            User user = MyApp.userDatabase.findUser(Integer.parseInt(id), password);

            if (user == null) {
                JOptionPane.showMessageDialog(null, "User tidak dikenali!");
            } else {
                MyApp.currentUser = user;
                frame.dispose();
                new BankAppMenu();
            }
        }
    }
}
