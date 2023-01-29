import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import com.mysql.jdbc.Connection;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.sql.SQLException;

public class ModifierArticle {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
		

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModifierArticle window = new ModifierArticle();
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
	public ModifierArticle() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(224, 255, 255));
		frame.setBounds(100, 100, 1218, 746);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(653, 82, 191, 38);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Entrez la r\u00E9f\u00E9rence de l'article:");
		lblNewLabel.setForeground(new Color(148, 0, 211));
		lblNewLabel.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 34));
		lblNewLabel.setBounds(68, 72, 493, 38);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(138, 43, 226));
		panel.setBounds(139, 198, 942, 402);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(255, 240, 245));
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setBounds(420, 38, 296, 43);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(255, 240, 245));
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(420, 117, 296, 43);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBackground(new Color(255, 240, 245));
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(420, 207, 296, 43);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBackground(new Color(255, 240, 245));
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(420, 284, 296, 43);
		panel.add(textField_4);
		
		JLabel lblNewLabel_1 = new JLabel("Ref\u00E9rence :");
		lblNewLabel_1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 29));
		lblNewLabel_1.setBounds(38, 38, 258, 43);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Libell\u00E9 :");
		lblNewLabel_1_1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 29));
		lblNewLabel_1_1.setBounds(38, 117, 258, 43);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Prix Unitaire :");
		lblNewLabel_2.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 29));
		lblNewLabel_2.setBounds(38, 207, 258, 43);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Quantit\u00E9 :");
		lblNewLabel_2_1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 29));
		lblNewLabel_2_1.setBounds(38, 284, 258, 43);
		panel.add(lblNewLabel_2_1);
		
		JButton btnNewButton = new JButton("Modifier");
		
		
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(789, 38, 104, 36);
		panel.add(btnNewButton);
		
		JButton btnModifier = new JButton("Modifier");
	
				
				
				
		
		btnModifier.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnModifier.setBounds(789, 117, 104, 36);
		panel.add(btnModifier);
		
		JButton btnModifier_1 = new JButton("Modifier");
		
		btnModifier_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnModifier_1.setBounds(789, 202, 104, 36);
		panel.add(btnModifier_1);
		
		JButton btnModifier_2 = new JButton("Modifier");
	
		btnModifier_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnModifier_2.setBounds(789, 284, 104, 36);
		panel.add(btnModifier_2);
		
		JButton btnNewButton_1 = new JButton("Sortir");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.hide();
				new FenetreArticles();
				
				
				
				
			}
		});
		FenetreArticles E;
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1.setBounds(961, 638, 120, 32);
		frame.getContentPane().add(btnNewButton_1);
		//frame.setVisible(true);
		frame.setVisible(true);
	}
}
