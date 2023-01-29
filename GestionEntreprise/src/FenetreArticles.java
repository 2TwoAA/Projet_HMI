import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FenetreArticles {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenetreArticles window = new FenetreArticles();
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
	public FenetreArticles() {
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
		frame.getContentPane().setBackground(new Color(230, 230, 250));
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Ajouter article");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AjouterArticle();
				frame.hide();
				
				
				
			}
		});
		btnNewButton.setBackground(new Color(123, 104, 238));
		btnNewButton.setFont(new Font("Freestyle Script", Font.BOLD, 40));
		btnNewButton.setBounds(875, 168, 271, 52);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Modifier article");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ModifierArticle();
				frame.hide();
				
				
				
				
				
			}
		});
		btnNewButton_1.setBackground(new Color(123, 104, 238));
		btnNewButton_1.setFont(new Font("Freestyle Script", Font.BOLD, 40));
		btnNewButton_1.setBounds(875, 257, 271, 52);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Supprimer article");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SupprimerArticle();
				frame.hide();
				
				
				
				
			}
		});
		btnNewButton_2.setBackground(new Color(123, 104, 238));
		btnNewButton_2.setFont(new Font("Freestyle Script", Font.BOLD, 40));
		btnNewButton_2.setBounds(875, 347, 271, 52);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("chercher article");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ChercherArticle();
				frame.hide();
				
				
				
				
				
				
			}
		});
		btnNewButton_3.setBackground(new Color(123, 104, 238));
		btnNewButton_3.setFont(new Font("Freestyle Script", Font.BOLD, 40));
		btnNewButton_3.setBounds(875, 439, 271, 52);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("Espace Articles");
		lblNewLabel.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 56));
		lblNewLabel.setForeground(new Color(148, 0, 211));
		lblNewLabel.setBounds(798, 30, 506, 67);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_3_1 = new JButton("Afficher articles");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AfficherArticle();
				frame.hide();
			
				
				
				
				
			}
		});
		btnNewButton_3_1.setFont(new Font("Freestyle Script", Font.BOLD, 40));
		btnNewButton_3_1.setBackground(new Color(123, 104, 238));
		btnNewButton_3_1.setBounds(875, 527, 271, 52);
		frame.getContentPane().add(btnNewButton_3_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(10, 31, 788, 687);
		frame.getContentPane().add(lblNewLabel_1);
		Image img = new ImageIcon(this.getClass().getResource("/products.jpg ")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img));
		
		JButton btnNewButton_4 = new JButton("Sortir");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.hide();
				new FenetrePrincipale();
				
				
				
				
				
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_4.setBounds(958, 645, 85, 21);
		frame.getContentPane().add(btnNewButton_4);
		frame.setVisible(true);
	}
}
