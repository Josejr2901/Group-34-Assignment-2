import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PaymentPage extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;

    public PaymentPage() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("First Name:");
        lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel.setBounds(10, 11, 113, 14);
        contentPane.add(lblNewLabel);

        textField = new JTextField();
        textField.setHorizontalAlignment(SwingConstants.LEFT);
        textField.setColumns(10);
        textField.setBounds(10, 36, 190, 20);
        contentPane.add(textField);

        JLabel lblNewLabel_1 = new JLabel("Last Name:");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_1.setBounds(10, 67, 125, 14);
        contentPane.add(lblNewLabel_1);

        textField_1 = new JTextField();
        textField_1.setHorizontalAlignment(SwingConstants.LEFT);
        textField_1.setText("");
        textField_1.setColumns(10);
        textField_1.setBounds(10, 92, 190, 20);
        contentPane.add(textField_1);

        JLabel lblNewLabel_1_1 = new JLabel("Card Number:");
        lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_1_1.setBounds(10, 126, 139, 14);
        contentPane.add(lblNewLabel_1_1);

        textField_2 = new JTextField();
        textField_2.setHorizontalAlignment(SwingConstants.LEFT);
        textField_2.setText("");
        textField_2.setColumns(10);
        textField_2.setBounds(10, 151, 190, 20);
        contentPane.add(textField_2);

        JLabel lblNewLabel_1_1_1 = new JLabel("Expiration date:");
        lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_1_1_1.setBounds(10, 182, 98, 14);
        contentPane.add(lblNewLabel_1_1_1);

        JLabel lblNewLabel_1_1_2 = new JLabel("CVV/CVC");
        lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_1_1_2.setBounds(116, 182, 98, 14);
        contentPane.add(lblNewLabel_1_1_2);

        textField_3 = new JTextField();
        textField_3.setHorizontalAlignment(SwingConstants.LEFT);
        textField_3.setText("");
        textField_3.setColumns(10);
        textField_3.setBounds(10, 207, 86, 20);
        contentPane.add(textField_3);

        textField_4 = new JTextField();
        textField_4.setHorizontalAlignment(SwingConstants.LEFT);
        textField_4.setText("");
        textField_4.setColumns(10);
        textField_4.setBounds(114, 207, 86, 20);
        contentPane.add(textField_4);

        JButton purchaseBtn = new JButton("Complete Purchase");
        purchaseBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                SuccessPage successPage = new SuccessPage();
                successPage.setVisible(true);
            }
        });
        purchaseBtn.setBounds(252, 227, 160, 23);
        contentPane.add(purchaseBtn);

        JLabel lblTotal = new JLabel("Total:");
        lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
        lblTotal.setBounds(275, 11, 55, 14);
        contentPane.add(lblTotal);

        JLabel total = new JLabel("$0.0");
        total.setHorizontalAlignment(SwingConstants.CENTER);
        total.setBounds(345, 11, 55, 14);
        total.setText("$" + Double.toString(CashRegister.getTotal()));
        contentPane.add(total);
    }

}