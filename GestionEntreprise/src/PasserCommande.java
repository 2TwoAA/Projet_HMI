
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class PasserCommande {

	 JFrame frame;
	 int ref;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PasserCommande window = new PasserCommande();
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
	public PasserCommande() {
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
		
		JLabel lblNewLabel = new JLabel("Vous avez la r\u00E9f\u00E9rence de client ?");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(218, 112, 214));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(93, 107, 226, 50);
		frame.getContentPane().add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Oui");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton.setBounds(358, 115, 75, 32);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNon = new JRadioButton("Non");
		rdbtnNon.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNon.setBounds(485, 115, 75, 32);
		frame.getContentPane().add(rdbtnNon);
		frame.setVisible(true);
		JButton btnNewButton = new JButton("Continuer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected()) {
					new Oui();
					frame.hide();
				}
				
				if(rdbtnNon.isSelected()) {
					new CreerClients();
					frame.hide();
				}
			}
		});
		btnNewButton.setBackground(new Color(186, 85, 211));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(321, 206, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
	
int returnerReference(int ref){
		
		return this.ref=ref;
	}
}

