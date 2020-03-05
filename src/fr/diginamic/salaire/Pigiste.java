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

	/** repr�sente le nombre de jours travaill�s pour la soci�t� durant le mois */
	int nbJours;
	
	/** repr�sente le montant journalier de r�mun�ration */
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
