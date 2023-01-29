import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class AfficherCommandeClient {
	JScrollPane scrollPane = new JScrollPane();
	 JFrame frame;
	 JTextField textField;
	 JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AfficherCommandeClient window = new AfficherCommandeClient();
					window.frame.setVisible(true);
				} catch (Exception E) {
					E.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AfficherCommandeClient() {
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
		
		
		JLabel lblNewLabel = new JLabel("Veuillez saisir la reference de client à afficher ses commandes");
		lblNewLabel.setForeground(new Color(255, 182, 193));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 36));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(110, 11, 1155, 61);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("R\u00E9f\u00E9rence Client :");
		lblNewLabel_1.setForeground(new Color(135, 206, 250));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(197, 105, 196, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(469, 107, 166, 30);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		//JPanel panel = new JPanel();
		panel.setBounds(314, 180, 555, 283);
		
		JButton btnNewButton = new JButton("Chercher");
		btnNewButton.setBackground(new Color(135, 206, 235));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(754, 106, 131, 29);
		frame.getContentPane().add(btnNewButton);
		
		
		
				
			
		
	}
	
}