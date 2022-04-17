import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterMenu {
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
        JFrame frame = new JFrame("RegisterMenu");
        frame.setContentPane(Canvas);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        MyApp myApp = new MyApp();

        BtnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new BankApp();
            }
        });
        BtnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Cek if total account not max, if not create account and go to bank menu
                if(myApp.isUserFull()) {
                    JOptionPane.showMessageDialog(null, "User penuh!");
                }
                else {
                    int id = myApp.getTotalUser();
                    String name = TxtFieldName.getText();
                    String password = PswdFieldPassword.getPassword().toString();
                    int deposit = Integer.parseInt(TxtFieldDeposit.getText());

                    myApp.CreateAccount(String.valueOf(id), name, password, deposit);
                    myApp.setCurrentId(id);
                    System.out.println("Register Menu ID: " + myApp.getCurrentId());

                    JOptionPane.showMessageDialog(null, "Akun berhasil dibuat");

                    frame.dispose();
                    new BankAppMenu();

                    myApp.getUser();
                }
            }
        });
    }
}
