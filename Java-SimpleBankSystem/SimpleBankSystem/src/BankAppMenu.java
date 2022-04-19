import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.ArrayList;

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
    private JTable TblHistory;
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
        updateLabels();

        BtnDeposit.addActionListener((event) -> onDepositActionPerformed());
        BtnWithdraw.addActionListener((event) -> onWithdrawActionPerformed());
        BtnLogOut.addActionListener((event) -> onLogoutActionPerformed());
    }

    public void updateLabels() {
        LblIdValue.setText("" + MyApp.currentUser.getId());
        LblNameValue.setText(MyApp.currentUser.getName());
        LblPasswordValue.setText(MyApp.currentUser.getPassword());
        LblBalanceValue.setText("" + MyApp.currentUser.getBank().getBalance());
        LblBalanceValue1.setText("" + MyApp.currentUser.getBank().getBalance());
        LblBalanceValue2.setText("" + MyApp.currentUser.getBank().getBalance());

        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(new String[] {"Balance", "Mutation", "Timestamp"});
        ArrayList<String[]> entries = MyApp.currentUser.getBank().getHistory().getAllStringEntries();

        for (int i = 0; i < entries.size(); i++) {
            String[] entry = entries.get(i);
            tableModel.addRow(entry);
        }
        TblHistory.setModel(tableModel);
    }

    public void onDepositActionPerformed() {
        int mutationValue;

        mutationValue = Integer.parseInt(TxtFieldDeposit.getText());
        int result = JOptionPane.showConfirmDialog(null,
                "Apakah Anda yakin dengan jumlah deposit?",
                "Konfirmasi deposit", JOptionPane.YES_NO_OPTION);

        if (result == JOptionPane.YES_OPTION) {
            MyApp.currentUser.getBank().deposit(mutationValue);
            JOptionPane.showMessageDialog(null, "Deposit berhasil");
            updateLabels();
        }
    }

    public void onWithdrawActionPerformed() {
        int mutationValue;

        mutationValue = Integer.parseInt(TxtFieldWithdraw.getText());

        if (!MyApp.currentUser.getBank().canWithdraw(mutationValue)) {
            JOptionPane.showMessageDialog(null, "Saldo tidak mencukupi!");
        } else {
            int result = JOptionPane.showConfirmDialog(null,
                    "Apakah Anda yakin dengan jumlah penaerikan?",
                    "Konfirmasi penarikan", JOptionPane.YES_NO_OPTION);

            if (result == JOptionPane.YES_OPTION) {
                MyApp.currentUser.getBank().withdraw(mutationValue);
                JOptionPane.showMessageDialog(null, "Penarikan berhasil");
                updateLabels();
            }
        }
    }

    public void onLogoutActionPerformed() {
        MyApp.currentUser = null;
        frame.dispose();
        new Login();
    }
}
