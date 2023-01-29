
 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


	public class Cnx {
		Connection connexion ;
		 public Cnx(){
			 super();
				try {
					
					// etape1 driver contient les classes
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("Driver accessible!  ...........ok ");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
					System.out.println("Driver accessible!  ...........NON ");
					System.exit(0);
				}
				
				// etape2 connexion : chemin  utilisateur  motdepass
				try {
					connexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionentreprise","root","");
					System.out.println("Serveur bade de donnee  connecté!...ok");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("Serveur bade de donnee  connecté!...non");
					System.exit(0);
				}
				
			 
		 }
		 
			Connection returner() {
				return connexion;
			}
			
	public static void main(String[] args) {
		Cnx  c= new Cnx();
		
	}	
	
	}
	
	
	


