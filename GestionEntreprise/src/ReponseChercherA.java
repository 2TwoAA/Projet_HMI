
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReponseChercherA {
	Object[] T;

	public JFrame frame;
		public ReponseChercherA(Object[] T) throws SQLException {
			this.T=T;
			initialize();
		}

		private void initialize() {
			frame = new JFrame();
			int x =Toolkit.getDefaultToolkit().getScreenSize().width;
			int y=Toolkit.getDefaultToolkit().getScreenSize().height;
			frame.setSize(x,y);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			frame.getContentPane().setBackground(new Color(230, 230, 250));
			frame.setBounds(100, 100, 1193, 765);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			JPanel panel = new JPanel();
			panel.setBackground(new Color(138, 43, 226));
			panel.setBounds(218, 209, 776, 430);
			frame.getContentPane().add(panel);
			panel.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("R\u00E9f\u00E9rence Article :");
			lblNewLabel.setFont(new Font("MV Boli", Font.BOLD, 30));
			lblNewLabel.setBounds(30, 44, 378, 48);
			panel.add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("Libellé :");
			lblNewLabel_1.setFont(new Font("MV Boli", Font.BOLD, 30));
			lblNewLabel_1.setBounds(30, 119, 247, 35);
			panel.add(lblNewLabel_1);
			
			JLabel lblNewLabel_2 = new JLabel("Prix Unitaire :");
			lblNewLabel_2.setFont(new Font("MV Boli", Font.BOLD, 30));
			lblNewLabel_2.setBounds(30, 196, 247, 35);
			panel.add(lblNewLabel_2);
			
			
			JLabel lblNewLabel_2_1_1 = new JLabel("Quantité :");
			lblNewLabel_2_1_1.setFont(new Font("MV Boli", Font.BOLD, 30));
			lblNewLabel_2_1_1.setBounds(30, 331, 247, 35);
			panel.add(lblNewLabel_2_1_1);
			
			JLabel lblNewLabel_3 = new JLabel(String.valueOf(T[0]));
			lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
			lblNewLabel_3.setBounds(501, 57, 275, 35);
			panel.add(lblNewLabel_3);
			
			JLabel lblNewLabel_3_1 =new JLabel (String.valueOf(T[1]));
			lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
			lblNewLabel_3_1.setBounds(501, 125, 275, 35);
			panel.add(lblNewLabel_3_1);
			
			JLabel lblNewLabel_3_2 = new JLabel (String.valueOf(T[2]));
			lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
			lblNewLabel_3_2.setBounds(501, 196, 275, 35);
			panel.add(lblNewLabel_3_2);
			
			
			JLabel lblNewLabel_3_4 = new JLabel (String.valueOf(T[3]));
			lblNewLabel_3_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
			lblNewLabel_3_4.setBounds(501, 337, 265, 35);
			panel.add(lblNewLabel_3_4);
			
			JLabel lblNewLabel_4 = new JLabel("Les informations d'article cherch\u00E9 :");
			lblNewLabel_4.setForeground(new Color(148, 0, 211));
			lblNewLabel_4.setBackground(new Color(255, 240, 245));
			lblNewLabel_4.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 55));
			lblNewLabel_4.setBounds(162, 32, 906, 116);
			frame.getContentPane().add(lblNewLabel_4);
			
			JButton btnNewButton = new JButton("Sortir");
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 23));
			btnNewButton.setBounds(953, 666, 138, 40);
			frame.getContentPane().add(btnNewButton);
			frame.setVisible(true);
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new ChercherArticle();
					frame.hide();
				}
			});
			frame.setVisible(true);
		}

	}
