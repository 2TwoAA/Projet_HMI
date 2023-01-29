

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;

public class Oui {

	JFrame frame;
	JTextField textField;
int ref=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Oui window = new Oui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Oui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		int x =Toolkit.getDefaultToolkit().getScreenSize().width;
		int y=Toolkit.getDefaultToolkit().getScreenSize().height;
		frame.setSize(x/2,y/2);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("r\u00E9f\u00E9rence_client :");
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblNewLabel.setForeground(new Color(238, 130, 238));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(180, 127, 137, 38);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Veuillez saisir la r\u00E9f\u00E9rence de client \u00E0 passer sa commande");
		lblNewLabel_1.setForeground(new Color(218, 112, 214));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(56, 44, 601, 38);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(393, 136, 113, 23);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		frame.setVisible(true);
		JButton btnNewButton = new JButton("Continuer");
		btnNewButton.setBackground(new Color(186, 85, 211));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ref=Integer.parseInt(textField.getText());
				frame.hide();
				new Menu(ref);
			}
		});
		btnNewButton.setBounds(530, 220, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
	/*int returnerReference(){
		
		return this.ref;
	}*/
}
