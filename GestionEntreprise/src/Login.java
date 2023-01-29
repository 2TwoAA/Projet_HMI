import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {
	JPanel panel = new JPanel();
	JLabel label= new JLabel("User:");
	JLabel label2 = new JLabel("password:");
	JTextField usertext = new JTextField();
	JPasswordField pass= new JPasswordField();
	JButton B1= new JButton("Login");
	JLabel success = new JLabel("");
	
	

	
	
	public Login() {
		this.setTitle("login");
		this.setSize(300,250);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panel.setLayout(null);
		label.setBounds(10,20,80,25);
		label2.setBounds(10,50,80,25);
		panel.add(label);
		panel.add(label2);
		usertext.setBounds(100,20,165,25);
		panel.add(usertext);
		panel.add(pass);
		B1.setBounds(10,80,80,25);
		panel.add(B1);
		pass.setBounds(100,50,165,25);
		this.add(panel);
		success.setBounds(10,110,300,25);
		panel.add(success);
		this.setVisible(true);
		B1.addActionListener(this);
	
		
		
		
		
	}

	public static void main(String[] args) {
		Login L = new Login();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String User=usertext.getText();
		String passWord =pass.getText();
		if(User.equals("Abderrahim")&& passWord.equals("Java")) {
			success.setText("login succesful!");
			new FenetrePrincipale();
			this.hide();
		
			
			
		}
		this.setVisible(true);
		
		
	}
	

}
