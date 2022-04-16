import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankApp {
    private JPanel Canvas;
    private JPanel LoginView;
    private JTextField LoginView_TxtField_ID;
    private JTextField LaginView_TxtField_Password;
    private JButton LoginView_Btn_Register;
    private JButton LoginView_Btn_Login;
    private JLabel LoginView_Lbl_Welcome;
    private JLabel LoginView_Lbl_ID;
    private JLabel LoginView_Lbl_Password;

    public BankApp() {
        JFrame frame = new JFrame("BankApp");
        frame.setContentPane(Canvas);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        LoginView_Btn_Register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new RegisterMenu();
            }
        });
        LoginView_Btn_Login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Cek if account exist, if yes... Go to bank menu
                frame.dispose();
                new BankAppMenu();
            }
        });
    }
}
