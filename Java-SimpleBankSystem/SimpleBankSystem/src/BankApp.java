import javax.swing.*;

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

    public static void main(String[] args) {
        JFrame frame = new JFrame("BankApp");
        frame.setContentPane(new BankApp().Canvas);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
