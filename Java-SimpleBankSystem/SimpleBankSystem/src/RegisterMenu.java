import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterMenu {
    private JPanel Canvas;
    private JTextField TxtFieldName;
    private JTextField textField2;
    private JButton BtnLogin;
    private JButton BtnRegister;
    private JLabel LblRegister;
    private JLabel LblName;
    private JLabel LblPassword;

    public RegisterMenu() {
        JFrame frame = new JFrame("RegisterMenu");
        frame.setContentPane(Canvas);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
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
                frame.dispose();
                new BankAppMenu();
            }
        });
    }
}
