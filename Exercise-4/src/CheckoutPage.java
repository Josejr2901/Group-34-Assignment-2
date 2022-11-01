import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CheckoutPage extends JFrame {

    private JPanel contentPane;
    private JTextField barcode;
    private JTable table;
    private DefaultTableModel model;
    private JLabel total;

    public CheckoutPage() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        JLabel lblNewLabel = new JLabel("Barcode:");
        lblNewLabel.setBounds(20, 11, 54, 14);
        contentPane.add(lblNewLabel);

        JButton checkoutBtn = new JButton("Checkout");
        checkoutBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                PaymentOption paymentOption = new PaymentOption();
                paymentOption.setVisible(true);
            }
        });
        checkoutBtn.setBounds(139, 227, 89, 23);
        contentPane.add(checkoutBtn);

        barcode = new JTextField();
        barcode.setBounds(83, 8, 86, 20);
        contentPane.add(barcode);
        barcode.setColumns(10);

        JButton cancel = new JButton("Cancel");
        cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                StartSessionPage startSessionPage = new StartSessionPage();
                startSessionPage.setVisible(true);
            }
        });
        cancel.setBounds(238, 227, 89, 23);
        contentPane.add(cancel);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(20, 36, 392, 177);
        contentPane.add(scrollPane);

        table = new JTable();
        model = new DefaultTableModel();
        Object[] column = { "ID", "Name", "Price" };
        model.setColumnIdentifiers(column);
        table.setModel(model);
        scrollPane.setViewportView(table);

        JLabel label = new JLabel("Total:");
        label.setBounds(323, 11, 41, 14);
        contentPane.add(label);

        total = new JLabel("0");
        total.setBounds(366, 11, 46, 14);
        contentPane.add(total);

        JButton addItemBtn = new JButton("Add");
        addItemBtn.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String barcodeStr = barcode.getText();
                Object[] item = CashRegister.addItem(barcodeStr);
                total.setText("$" + Double.toString(CashRegister.getTotal()));

                if (item.length != 0) {
                    model.addRow(item);
                }
                // If a barcode is not recognized, then there will be a new window that pops up
                // and lets the user know there is a barcode error.
                else {
                    JOptionPane.showMessageDialog(null, "Unknown Product", "Barcode Error",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        addItemBtn.setBounds(179, 7, 60, 23);
        contentPane.add(addItemBtn);

    }

}