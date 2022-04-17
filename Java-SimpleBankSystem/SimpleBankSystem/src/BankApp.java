import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankApp {
    private JPanel Canvas;
    private JPanel LoginView;
    private JTextField TxtFieldId;
    private JButton BtnRegister;
    private JButton BtnLogin;
    private JLabel LblWelcome;
    private JLabel LblId;
    private JLabel LblPassword;
    private JPasswordField PswdFieldPassword;

    public BankApp() {
        JFrame frame = new JFrame("BankApp");
        frame.setContentPane(Canvas);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        MyApp myApp = new MyApp();

        BtnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!myApp.isUserFull()) {
                    frame.dispose();
                    new RegisterMenu();
                }
                else {
                    JOptionPane.showMessageDialog(null, "User sudah full!");
                }
            }
        });
        BtnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Cek if account exist, if yes... Go to bank menu
                if(myApp.isUserEmpty()) {
                    JOptionPane.showMessageDialog(null, "Belum ada user!");
                    myApp.getUser();
                }
                else {
                    String id = TxtFieldId.getText();
                    String password = PswdFieldPassword.getPassword().toString();

                    if(myApp.validateUser(id, password)) {
                        myApp.setCurrentId(Integer.parseInt(myApp.bank[Integer.parseInt(id)].user.getID()));
                        frame.dispose();
                        new BankAppMenu();
                        System.out.println(myApp.getCurrentId());
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "User tidak dikenali!");
                    }
                }
            }
        });
    }
}
