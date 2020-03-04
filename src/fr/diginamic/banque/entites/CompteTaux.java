package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {


	private int tauxRemuneration;

	/**
	 * @param numeroDeCompte => Le numéro du compte
	 * @param soldeDuCompte => Le solde du compte
	 * @param tauxRemuneration => Le taux de rémunération
	 */
	public CompteTaux(int numeroDeCompte, int soldeDuCompte, int tauxRemuneration) {
		super(numeroDeCompte, soldeDuCompte);
		setTauxRemuneration(10);
		this.tauxRemuneration = tauxRemuneration;
	}
	
	// Redéfinition du String
	@Override
	public String toString() {
		String nom = super.toString();
		return nom + " Taux : "+ getTauxRemuneration();
	}

	/**
	 * @return Récupérer le taux de rémunération
	 */
	public int getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * @param Définir taux de rémunération
	 */
	public void setTauxRemuneration(int tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

	
}
