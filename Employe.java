abstract class Employe {

	// abstract class can have protected variable
	protected String nom;

	// abstract class can have constructor
	Employe(String nom) {
		this.nom = nom;
	}

	// this is a concrete method
	public String getNom() {
		return nom;
	}
	
    // these are abstract methods
	public abstract double getSalaire();

}
