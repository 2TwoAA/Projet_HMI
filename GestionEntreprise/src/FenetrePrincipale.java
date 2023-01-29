import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FenetrePrincipale {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenetrePrincipale window = new FenetrePrincipale();
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
	public FenetrePrincipale() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 1060, 768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 1046, 373);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(115, 467, 130, 98);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(456, 467, 130, 98);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(769, 467, 130, 98);
		frame.getContentPane().add(lblNewLabel_4);
		
	    Image img = new ImageIcon(this.getClass().getResource("/entreprise.jpeg ")).getImage();
	    lblNewLabel.setIcon(new ImageIcon(img));
	    
	    
	    Image img1 = new ImageIcon(this.getClass().getResource("/produit.jpeg ")).getImage();
	    lblNewLabel_2.setIcon(new ImageIcon(img1));
	   
	    
	    Image img2 = new ImageIcon(this.getClass().getResource("/client.jpeg ")).getImage();
	    lblNewLabel_3.setIcon(new ImageIcon(img2));
	   
	    
	    Image img3 = new ImageIcon(this.getClass().getResource("/commande.jpeg ")).getImage();
	    lblNewLabel_4.setIcon(new ImageIcon(img3));
	    
	    JButton btnNewButton = new JButton("Gestion articles");
	    btnNewButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		new FenetreArticles();
	    		frame.hide();   
	    		
	    		
	    		
	    	}
	    });
	    btnNewButton.setBackground(new Color(255, 248, 220));
	    btnNewButton.setForeground(new Color(255, 153, 0));
	    btnNewButton.setFont(new Font("Segoe Print", Font.BOLD, 16));
	    btnNewButton.setBounds(87, 588, 208, 42);
	    frame.getContentPane().add(btnNewButton);
	    
	    JButton btnGestionProduit = new JButton("Gestion clients");
	    btnGestionProduit.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		new FenetreClient();
	    		frame.hide();    		
	    		
	    	}
	    });
	    btnGestionProduit.setBackground(new Color(255, 248, 220));
	    btnGestionProduit.setForeground(new Color(51, 51, 255));
	    btnGestionProduit.setFont(new Font("Segoe Print", Font.BOLD, 16));
	    btnGestionProduit.setBounds(421, 588, 208, 42);
	    frame.getContentPane().add(btnGestionProduit);
	    
	    JButton btnGestionCommandes = new JButton("Gestion commandes");
	    btnGestionCommandes.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		new GestionCommande();
	    		frame.hide();   
	    		
	    		
	    		
	    	}
	    });
	    btnGestionCommandes.setBackground(new Color(255, 248, 220));
	    btnGestionCommandes.setForeground(new Color(102, 153, 0));
	    btnGestionCommandes.setFont(new Font("Segoe Print", Font.BOLD, 16));
	    btnGestionCommandes.setBounds(750, 588, 208, 42);
	    frame.getContentPane().add(btnGestionCommandes);
	    
	    JLabel lblNewLabel_1 = new JLabel("                Bienvenue dans l'espace gestion d'entreprise");
	    lblNewLabel_1.setForeground(new Color(204, 102, 102));
	    lblNewLabel_1.setBackground(Color.WHITE);
	    lblNewLabel_1.setFont(new Font("Vivaldi", Font.BOLD, 35));
	    lblNewLabel_1.setBounds(151, 383, 697, 52);
	    frame.getContentPane().add(lblNewLabel_1);
	    
	    JButton btnNewButton_1 = new JButton("sortir");
	    btnNewButton_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		frame.hide();
	    	}
	    });
	    btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
	    btnNewButton_1.setBounds(769, 671, 85, 31);
	    frame.getContentPane().add(btnNewButton_1);
	    frame.setVisible(true);
	 
		
	}
}
