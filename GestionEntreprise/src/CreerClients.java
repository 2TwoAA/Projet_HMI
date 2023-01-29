

import java.awt.EventQueue;
import java.sql.PreparedStatement;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextField;



import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;

public class CreerClients {
	int ref;
	 JFrame frame;
	 JTextField textField;
	 JTextField textField_1;
	JTextField textField_2;
	 JTextField textField_4;
	JButton btnNewButton , btnNewButton_1;
	JRadioButton rdbtnNewRadioButton_1,rdbtnNewRadioButton;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreerClients window = new CreerClients();
			
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public CreerClients() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		int x =Toolkit.getDefaultToolkit().getScreenSize().width;
		int y=Toolkit.getDefaultToolkit().getScreenSize().height;
		frame.setSize(x,y);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 10, 741);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Reference client:");
		lblNewLabel.setBackground(new Color(186, 85, 211));
		lblNewLabel.setBounds(51, 375, 233, 42);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nom");
		lblNewLabel_1.setBounds(51, 438, 233, 42);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Prenon");
		lblNewLabel_2.setBounds(51, 529, 233, 33);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("Date de Naissance :");
		lblNewLabel_4.setBounds(51, 649, 233, 42);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(379, 375, 253, 42);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(379, 450, 253, 42);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(379, 525, 253, 42);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(379, 647, 253, 47);
		frame.getContentPane().add(textField_4);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("femme");
		rdbtnNewRadioButton.setBounds(529, 591, 103, 21);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		 rdbtnNewRadioButton_1 = new JRadioButton("homme");
		rdbtnNewRadioButton_1.setBounds(379, 591, 103, 21);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("Sexe:");
		lblNewLabel_3.setBounds(51, 587, 233, 42);
		frame.getContentPane().add(lblNewLabel_3);
		
	    btnNewButton = new JButton("sortir");
		btnNewButton.setBounds(841, 660, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("enregistrer");
		btnNewButton_1.setBounds(1000, 660, 100, 21);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_5 = new JLabel("  Veuillez saisir les informations du client à enregistrer");
		lblNewLabel_5.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 47));
		lblNewLabel_5.setBounds(51, 24, 1098, 214);
		frame.getContentPane().add(lblNewLabel_5);
		frame.setVisible(true);
	

	

btnNewButton.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		frame.hide();
		new FenetreClient();
	}
});

 
 JButton  btnNewButton_2 = new JButton("Continuer");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.hide();
				ref=Integer.parseInt(textField.getText());
				//new Menu(ref);
			}
		});
	btnNewButton_2.setBounds(1200, 660, 100, 21);
	frame.getContentPane().add(btnNewButton_2);

}
}
