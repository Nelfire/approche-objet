package fr.diginamic.salaire;

public class Pigiste extends Intervenant {
	/** Constructeur
	 * @param nbJours
	 * @param montant
	 */
	public Pigiste(String nom, String prenom, int nbJours, double montant) {
		super(nom, prenom);
		this.nbJours = nbJours;
		this.montant = montant;
	}

	/** représente le nombre de jours travaillés pour la société durant le mois */
	int nbJours;
	
	/** représente le montant journalier de rémunération */
	double montant;
	
	
	
	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return nbJours*montant;
	}
	
	/** Getter
	 * @return Retourne le status
	 */
	public String getStatus() {
		return "Pigiste";
	}



}
