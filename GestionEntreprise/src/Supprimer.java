
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Supprimer{
	 
	PreparedStatement st ,st1;
		ResultSet result,result1;
		
	
	 JFrame frame;
	JTextField textField;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the application.
	 */
	public Supprimer() {
		initialize();
	}

	/**
	 
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(230, 230, 250));
		int x =Toolkit.getDefaultToolkit().getScreenSize().width;
		int y=Toolkit.getDefaultToolkit().getScreenSize().height;
		frame.setSize(x,y);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(new Color(224, 255, 255));
		textField.setBounds(512, 241, 216, 60);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Reference client :");
		lblNewLabel.setBackground(new Color(224, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(222, 237, 223, 60);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("supprimer");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(900, 533, 200, 34);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("sortir");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.hide();
				new FenetreClient();
			}
		});
		
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1.setBounds(1150, 533, 200, 34);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("    Veuillez entre la reference du client  à supprimer");
		lblNewLabel_1.setForeground(new Color(148, 0, 211));
		lblNewLabel_1.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 42));
		lblNewLabel_1.setBounds(65, 26, 961, 106);
		frame.getContentPane().add(lblNewLabel_1);
		frame.setVisible(true);
		
	
				
				

		
		
	}

}