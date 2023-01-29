
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.EventQueue;


import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JRadioButton;


public class Modifier1 {
	String requette ,requette1;
	 JFrame frame;
 JTextField textField;
	JTextField textField_1;
	 JTextField textField_2;
 JTextField textField_4;
	JTextField textField_3;
	JRadioButton rdbtnNewRadioButton, rdbtnNewRadioButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Modifier1 window = new Modifier1();
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
	public Modifier1() {
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
		
		JPanel panel = new JPanel();
		panel.setBounds(189, 212, 905, 402);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" Ref\u00E9rence client :");
		lblNewLabel.setFont(new Font("Sakkal Majalla", Font.BOLD, 32));
		lblNewLabel.setBounds(57, 60, 261, 42);
		panel.add(lblNewLabel);
		
		JLabel lblNom = new JLabel("Nom :");
		lblNom.setFont(new Font("Sakkal Majalla", Font.BOLD, 32));
		lblNom.setBounds(57, 127, 261, 42);
		panel.add(lblNom);
		
		JLabel lblPrenon = new JLabel("Prenon :");
		lblPrenon.setFont(new Font("Sakkal Majalla", Font.BOLD, 32));
		lblPrenon.setBounds(57, 206, 261, 42);
		panel.add(lblPrenon);
		
		JLabel lblSexe = new JLabel("Sexe :");
		lblSexe.setFont(new Font("Sakkal Majalla", Font.BOLD, 32));
		lblSexe.setBounds(57, 278, 261, 42);
		panel.add(lblSexe);
		
		JLabel lblDateNaissance = new JLabel("Date Naissance :");
		lblDateNaissance.setFont(new Font("Sakkal Majalla", Font.BOLD, 32));
		lblDateNaissance.setBounds(57, 339, 261, 42);
		panel.add(lblDateNaissance);
		textField_3 = new JTextField();
		textField_3.setBounds(674, 87, 236, 59);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(375, 61, 337, 42);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(375, 139, 337, 42);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(375, 205, 337, 42);
		panel.add(textField_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(375, 340, 337, 42);
		panel.add(textField_4);
		
rdbtnNewRadioButton = new JRadioButton("femme");
		rdbtnNewRadioButton.setBounds(602, 278, 103, 21);
		panel.add(rdbtnNewRadioButton);
		
	 rdbtnNewRadioButton_1 = new JRadioButton("homme");
		rdbtnNewRadioButton_1.setBounds(388, 278, 103, 21);
		panel.add(rdbtnNewRadioButton_1);
		
		JButton btnNewButton_1 = new JButton("Modifier");

			
				
		btnNewButton_1.setBounds(763, 73, 85, 21);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Modifier");

		btnNewButton_1_1.setBounds(763, 148, 85, 21);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Modifier");

		btnNewButton_1_2.setBounds(763, 206, 85, 21);
		panel.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("Modifier");

		btnNewButton_1_3.setBounds(763, 278, 85, 21);
		panel.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("Modifier");

		btnNewButton_1_4.setBounds(763, 352, 85, 21);
		panel.add(btnNewButton_1_4);
		
		JLabel lblNewLabel_1 = new JLabel("Entrez la reference client:");
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.BOLD, 29));
		lblNewLabel_1.setBounds(172, 68, 423, 82);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Sortir");
		btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			frame.hide();
			new FenetreClient();
		}
	});
		btnNewButton.setBounds(900, 674, 98, 30);
		frame.getContentPane().add(btnNewButton);
		frame.setVisible(true);
	}
}