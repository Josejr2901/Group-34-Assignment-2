import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SuccessPage extends JFrame {

    private JPanel contentPane;

    public SuccessPage() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(150, 150, 500, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Payment Successful!");
        lblNewLabel.setFont(new Font("Arial Bold", Font.BOLD, 18));
        lblNewLabel.setBounds(150, 125, 200, 20);
        contentPane.add(lblNewLabel);

        JButton closeBtn = new JButton("Close");
        closeBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                StartSessionPage startSessionPage = new StartSessionPage();
                startSessionPage.setVisible(true);
            }
        });
        closeBtn.setBounds(165, 163, 89, 23);
        contentPane.add(closeBtn);
    }
}