import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SupprimerArticle {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SupprimerArticle window = new SupprimerArticle();
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
	public SupprimerArticle() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(224, 255, 255));
		frame.setBounds(100, 100, 1183, 783);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 240, 245));
		textField.setBounds(468, 289, 159, 56);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("  R\u00E9f\u00E9rence article :");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 27));
		lblNewLabel.setBounds(141, 278, 258, 64);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("sortir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.hide();
				new FenetreArticles();
				
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(616, 455, 123, 39);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("supprimer");
		

       
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(798, 455, 115, 39);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("  Veuillez Saisir la reference d'article");
		lblNewLabel_1.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 39));
		lblNewLabel_1.setForeground(new Color(153, 50, 204));
		lblNewLabel_1.setBounds(60, 23, 1010, 164);
		frame.getContentPane().add(lblNewLabel_1);
		frame.setVisible(true);
	}
	
}

