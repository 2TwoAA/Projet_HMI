import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GestionCommande {

	 JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					GestionCommande window = new GestionCommande();
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
	public GestionCommande() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		int x =Toolkit.getDefaultToolkit().getScreenSize().width;
		int y=Toolkit.getDefaultToolkit().getScreenSize().height;
		frame.setSize(x,y);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenue dans Espace Commande");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(221, 160, 221));
		lblNewLabel.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel.setBounds(10, 100, 712, 197);
		frame.getContentPane().add(lblNewLabel);
		
		///image
		
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		Image img = new ImageIcon(this.getClass().getResource("/GestionCommande.PNG")).getImage();
	    lblNewLabel_1.setIcon(new ImageIcon(img));
	    
	    
		lblNewLabel_1.setBounds(752, 34, 588, 332);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Passer Commande");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.hide();
				new PasserCommande();
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(199, 21, 133));
		btnNewButton.setBounds(131, 500, 205, 56);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnAfficherCommandes = new JButton("Afficher  toutes  les Commandes");
		btnAfficherCommandes.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnAfficherCommandes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.hide();
				new AfficherCommandes();
			}
		});
		btnAfficherCommandes.setBackground(new Color(199, 21, 133));
		btnAfficherCommandes.setForeground(new Color(0, 0, 0));
		btnAfficherCommandes.setBounds(465, 500, 230, 56);
		frame.getContentPane().add(btnAfficherCommandes);
		
		JButton btnAfficherCommande = new JButton("Afficher Commandes d'un client");
		btnAfficherCommande.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.hide();
				new AfficherCommandeClient();
			}
		});
		btnAfficherCommande.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnAfficherCommande.setBackground(new Color(199, 21, 133));
		btnAfficherCommande.setForeground(new Color(0, 0, 0));
		btnAfficherCommande.setBounds(821, 500, 242, 56);
		frame.getContentPane().add(btnAfficherCommande);
		
		JButton btnSortir = new JButton("sortir");
		btnSortir.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnSortir.setForeground(new Color(135, 206, 250));
		btnSortir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.hide();
				new FenetrePrincipale();
			}
		});
		btnSortir.setBounds(1173, 600, 130, 40);
		frame.getContentPane().add(btnSortir);
		frame.setVisible(true);
	}
}
