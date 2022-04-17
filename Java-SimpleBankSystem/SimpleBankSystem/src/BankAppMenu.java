import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankAppMenu {
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
        JFrame frame = new JFrame("BankAppMenu");
        frame.setContentPane(Canvas);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        MyApp myApp = new MyApp();
        System.out.println("Bank Menu ID: " + myApp.getCurrentId());

        //Set ID, Balance, Password of the account
        LblIdValue.setText(String.valueOf(myApp.getCurrentId()));
        LblNameValue.setText(myApp.bank[myApp.getCurrentId()].user.getName());
        LblPasswordValue.setText(myApp.bank[myApp.getCurrentId()].user.getPassword());
        LblBalanceValue.setText(String.valueOf(myApp.bank[myApp.getCurrentId()].getBalance()));

        BtnDeposit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Update balance

            }
        });
        BtnWithdraw.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Update balance

            }
        });
        BtnLogOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myApp.setCurrentId(0);
                frame.dispose();
                new BankApp();
            }
        });
    }
}
