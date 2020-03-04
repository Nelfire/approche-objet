package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {


	private int tauxRemuneration;

	/**
	 * @param numeroDeCompte => Le num�ro du compte
	 * @param soldeDuCompte => Le solde du compte
	 * @param tauxRemuneration => Le taux de r�mun�ration
	 */
	public CompteTaux(int numeroDeCompte, int soldeDuCompte, int tauxRemuneration) {
		super(numeroDeCompte, soldeDuCompte);
		setTauxRemuneration(10);
		this.tauxRemuneration = tauxRemuneration;
	}
	
	// Red�finition du String
	@Override
	public String toString() {
		String nom = super.toString();
		return nom + " Taux : "+ getTauxRemuneration();
	}

	/**
	 * @return R�cup�rer le taux de r�mun�ration
	 */
	public int getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * @param D�finir taux de r�mun�ration
	 */
	public void setTauxRemuneration(int tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

	
}
