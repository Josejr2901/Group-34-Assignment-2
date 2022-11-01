import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StartSessionPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public StartSessionPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("Start Session");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CashRegister.createInstance();
				dispose();
				CheckoutPage checkoutPage = new CheckoutPage();
				checkoutPage.setVisible(true);
			}
		});
		btnNewButton.setBounds(152, 113, 126, 23);
		contentPane.add(btnNewButton);
	}
}