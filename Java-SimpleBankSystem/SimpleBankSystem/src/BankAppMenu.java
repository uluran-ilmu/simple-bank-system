import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankAppMenu {
    private JFrame frame;
    private JPanel Canvas;
    private JTabbedPane TabPaneBankMenu;
    private JPanel PnlAccount;
    private JPanel PnlDeposit;
    private JPanel PnlWithdraw;
    private JPanel PnlHistory;
    private JLabel LblId;
    private JLabel LblIdValue;
    private JLabel LblPassword;
    private JLabel LblBalance;
    private JLabel LblPasswordValue;
    private JLabel LblBalanceValue;
    private JButton BtnDeposit;
    private JLabel LblBalance1;
    private JLabel LblDepositAmmount;
    private JLabel LblBalanceValue1;
    private JTextField TxtFieldDeposit;
    private JButton BtnWithdraw;
    private JTextField TxtFieldWithdraw;
    private JLabel LblBalance2;
    private JLabel LblWithdrawAmmount;
    private JLabel LblBalanceValue2;
    private JTable table1;
    private JButton BtnLogOut;
    private JLabel LblNameValue;
    private JLabel LblName;

    public BankAppMenu() {
        frame = new JFrame("BankAppMenu");
        frame.setContentPane(Canvas);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        //Set ID, Balance, Password of the account
        initComponents();

        BtnDeposit.addActionListener((event)->onDepositActionPerformed());
        BtnWithdraw.addActionListener((event)->onWithdrawActionPerformed());
        BtnLogOut.addActionListener((event)->onLogoutActionPerformed());
    }

    public void initComponents() {
        LblIdValue.setText("" + MyApp.currentUser.getId());
        LblNameValue.setText(MyApp.currentUser.getName());
        LblPasswordValue.setText(MyApp.currentUser.getPassword());
        LblBalanceValue.setText("" + MyApp.currentUser.getBank().getBalance());
    }

    public void onDepositActionPerformed() {

    }

    public void onWithdrawActionPerformed() {

    }

    public void onLogoutActionPerformed() {
        MyApp.currentUser = null;
        frame.dispose();
        new Login();
    }
}
