import javax.swing.*;

public class BankAppMenu {
    private JPanel Canvas;
    private JTabbedPane TabPaneBankMenu;
    private JPanel PnlAccount;
    private JPanel PnlDeposit;
    private JPanel PnlWithdraw;
    private JPanel PnlHistory;
    private JLabel BankMenu_LblId;
    private JLabel BanMenu_LblIdValue;
    private JLabel BanMenu_LblPassword;
    private JLabel BankMenu_LblBalance;
    private JLabel BankMenu_LblPasswordValue;
    private JLabel BankMenu_LblBalanceValue;
    private JButton BankMenu_BtnDeposit;
    private JLabel BankMenu_LblBalance1;
    private JLabel BankMenu_LblDepositAmmount;
    private JLabel BankMenu_LblBalanceValue1;
    private JTextField BankMenu_TxtFieldDeposit;
    private JButton BankMenu_BtnWithdraw;
    private JTextField BankMenu_TxtFieldWithdraw;
    private JLabel BankMenu_LblBalance2;
    private JLabel BankMenu_LblWithdrawAmmount;
    private JLabel BankMenu_LblBalanceValue2;
    private JTable table1;

    public BankAppMenu() {
        JFrame frame = new JFrame("BankAppMenu");
        frame.setContentPane(Canvas);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
