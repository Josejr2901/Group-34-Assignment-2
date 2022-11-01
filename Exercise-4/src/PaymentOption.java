import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class PaymentOption extends JFrame {
    private JPanel contentPane;

    public PaymentOption() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel label = new JLabel("Please select your payment method!");
        label.setBounds(111, 11, 196, 14);
        contentPane.add(label);

        JButton payCash = new JButton("Cash");
        payCash.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                SuccessPage successPage = new SuccessPage();
                successPage.setVisible(true);
            }
        });
        payCash.setBounds(38, 103, 89, 23);
        contentPane.add(payCash);

        JButton payDebit = new JButton("Debit Card");
        payDebit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                PaymentPage paymentPage = new PaymentPage();
                paymentPage.setVisible(true);
            }
        });
        payDebit.setBounds(145, 103, 111, 23);
        contentPane.add(payDebit);

        JButton payCredit = new JButton("Credit Card");
        payCredit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                PaymentPage paymentPage = new PaymentPage();
                paymentPage.setVisible(true);
            }
        });
        payCredit.setBounds(266, 103, 104, 23);
        contentPane.add(payCredit);

        JButton payCancel = new JButton("Cancel Session");
        payCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                StartSessionPage startSessionPage = new StartSessionPage();
                startSessionPage.setVisible(true);
            }
        });
        payCancel.setBounds(140, 227, 146, 23);
        contentPane.add(payCancel);
    }

}