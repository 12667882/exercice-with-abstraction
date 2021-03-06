public class EmployeHoraire extends Employe {

	final int DUE = 40;
	private int taux_horaire;
	private int nombre_heures;
	private double tarif_horaire;

	EmployeHoraire(String nom, int taux_horaire, int nombre_heures, double tarif_horaire) {
		super(nom);
		setInfosSalaire(taux_horaire, nombre_heures, tarif_horaire);
	}

	EmployeHoraire(String nom) {
		super(nom);
	}

	public void setInfosSalaire(int taux_horaire, int nombre_heures, double tarif_horaire) {
		this.taux_horaire = taux_horaire;
		this.nombre_heures = nombre_heures;
		this.tarif_horaire = tarif_horaire;
	}

	@Override
	public double getSalaire() {
		return (tarif_horaire + (nombre_heures - DUE) * (1 + taux_horaire / 100));
	}

}