import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.EventQueue;


public class FenetreClient {
	
	 JFrame frame;
	JLabel lblNewLabel = new JLabel("Espace Client");

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenetreClient window = new FenetreClient();
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
	public FenetreClient() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		int x =Toolkit.getDefaultToolkit().getScreenSize().width;
		int y=Toolkit.getDefaultToolkit().getScreenSize().height;
		frame.setSize(x,y);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 255, 255));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setToolTipText("Bienvenue dans l'Espace Clients");
		lblNewLabel.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 43));
		lblNewLabel.setForeground(new Color(123, 104, 238));
		lblNewLabel.setBounds(10, 84, 426, 289);
		panel.add(lblNewLabel);
		frame.setVisible(true);
		JButton btnNewButton = new JButton("Ajouter client");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CreerClients();
			}
		});
		btnNewButton.setBackground(new Color(65, 105, 225));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tempus Sans ITC", Font.BOLD, 16));
		btnNewButton.setBounds(10, 535, 187, 57);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Modifier client");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Modifier1();
			}
		});
		btnNewButton_1.setBackground(new Color(65, 105, 225));
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 16));
		btnNewButton_1.setBounds(249, 535, 174, 57);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Supprimer client");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Supprimer();
			}
		});
		
		btnNewButton_2.setBackground(new Color(65, 105, 225));
		btnNewButton_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 16));
		btnNewButton_2.setBounds(455, 535, 165, 57);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("chercher Client");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 new ChercherClient();
			}
		});
		
		btnNewButton_3.setBackground(new Color(65, 105, 225));
		btnNewButton_3.setForeground(new Color(0, 0, 0));
		btnNewButton_3.setFont(new Font("Tempus Sans ITC", Font.BOLD, 16));
		btnNewButton_3.setBounds(666, 535, 174, 57);
		panel.add(btnNewButton_3);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(438, 38, 768, 416);
		panel.add(lblNewLabel_1);
		
		
		JButton btnNewButton_4 = new JButton("sortir");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.hide();
				new FenetrePrincipale();
				
				}
		});
			
		
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton_4.setBounds(1200, 650, 127, 31);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_3_1 = new JButton("Afficher les clients");
	
		btnNewButton_3_1.setBackground(new Color(65, 105, 225));
		btnNewButton_3_1.setForeground(new Color(0, 0, 0));
		btnNewButton_3_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 16));
		btnNewButton_3_1.setBounds(902, 535, 174, 57);
		panel.add(btnNewButton_3_1);
		Image img = new ImageIcon(this.getClass().getResource("/client2.jpg ")).getImage();
	    lblNewLabel_1.setIcon(new ImageIcon(img));
		
		
	}	
}
