
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Menu {
	int Qte[];
Object [] libele;
int reference[];
   JFrame frame;
	int ref;
	String quantite= "";
	JComboBox<Object> comboBox ;
	Statement st ,st2;
	ResultSet result;
	JScrollPane centre;
	Cnx  c= new Cnx();
	Connection connexion = c.returner();
	 JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					int val=0;
					Menu window = new Menu(val);
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
	public Menu(int ref) {
		this.ref=ref;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(221, 160, 221));
		int x =Toolkit.getDefaultToolkit().getScreenSize().width;
		int y=Toolkit.getDefaultToolkit().getScreenSize().height;
		frame.setSize(x, y);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("veuillez s\u00E9lectionner les articles  command\u00E9es par  le client ");
		lblNewLabel.setForeground(new Color(255, 182, 193));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(168, 37, 890, 86);
		frame.getContentPane().add(lblNewLabel);
		
		//recuperer tous les articles pour qu'on puisse les afficher dans une list
		
		try {
			String requette="select  * from articles ";
			st=connexion.createStatement();//st connecter avec bd
			st.execute(requette);
			result=st.executeQuery(requette);
			int k=0;
			if(result.next()) {
				result.last();
				k=result.getRow();
				result.beforeFirst();
			}
		
		libele= new Object[k];
		reference= new int [k];
		Qte=new int [k];
		int i=0;
		while(result.next()) {
			libele[i]=result.getString(2);
			reference[i]=result.getInt(1);
			Qte[i]=result.getInt(4);
			i++;
		}
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		comboBox= new JComboBox<Object>(libele);
		comboBox.setEditable(true);
		comboBox.setBounds(606, 159, 282, 49);
		frame.getContentPane().add(comboBox);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e.getSource();
				//zone de saisie de quantité
				
				quantite = JOptionPane.showInputDialog(null,"Entrez la quantité à commander :");
				
				try {
					String requette1 =  "INSERT INTO commande (id,reference,quantite,date)" +
				            "VALUES (?,?,?,?)";
					PreparedStatement st1= connexion.prepareStatement(requette1);
					st1.setInt(1,ref);
					st1.setInt(2,reference[chercherI((String)comboBox.getSelectedItem())]);
					st1.setInt(3,Integer.parseInt(quantite));
					st1.setString(4,textField.getText());
					st1.executeUpdate();
					JOptionPane.showMessageDialog(null, "Commande bien Enregistré !");
					
				} catch (SQLException e1) {
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "Commande n'est pas Enregistré !");
				
				}
				
			//soustraire la quantite commandée de  la quantité produit	
				
           try {             
	          int qte= Qte[chercherI((String)comboBox.getSelectedItem())]-Integer.parseInt(quantite);
	               String requette2 = "UPDATE articles set Quantité ='"+qte+"' where reference='"+reference[chercherI((String)comboBox.getSelectedItem())]+"'";
					st2=connexion.createStatement();
					  st2.executeUpdate(requette2);
					  connexion.close();
				} catch (SQLException e11) {
					// TODO Auto-generated catch block
					e11.printStackTrace();
				}
				
			}
		});
		
		JButton btnNewButton_1 = new JButton("Sortir");
		btnNewButton_1.setBackground(new Color(186, 85, 211));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.hide();
				new GestionCommande();
			}
		});
		btnNewButton_1.setBounds(1073, 415, 156, 43);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("date :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setForeground(new Color(221, 160, 221));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(133, 206, 114, 43);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(257, 206, 119, 43);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		frame.setVisible(true);
	}
	int chercherI(String s) {
		int k=0;
		for(int i=0;i<libele.length;i++) {
			if (libele[i]==s) {
				k=i;
			}
		}
		return k;
	}
}

