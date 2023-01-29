public class Client {
	// les attributs
	String id;	
	String nom ,prenom,sexe,naissance;
	String t[] = new String[5];
	
	//constructeur
	public Client() {
		super();
			
		
		
		id=t[0];
		System.out.println(id);
		nom=t[1];
System.out.println(nom);
		prenom=t[2];
		sexe=t[3];
		naissance=t[4];
		
		}
		
		
	//fin de constructeur
	
	

	


	
	
	public static void main(String[] args) {
		Client c=new Client();
	  System.out.println(c);
	}


	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", sexe=" + sexe + ", naissance="
				+ naissance + "]";
	}
	
	
	
	
	}

