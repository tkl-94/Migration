package tkl;

public class Mda {
	private String name;
	private String prenom;
	private String ville;
	private String pays;
	private String nationalite;
	private String Mahmoud;
	
	
	
	
	public Mda(String name, String prenom, String ville, String pays) {
		super();
		this.name = name;
		this.prenom = prenom;
		this.ville = ville;
		this.pays = pays;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	@Override
	public String toString() {
		return "Mda [name=" + name + ", prenom=" + prenom + ", ville=" + ville + ", pays=" + pays + "]";
	}
	
	
	
	
	
	
	

}
