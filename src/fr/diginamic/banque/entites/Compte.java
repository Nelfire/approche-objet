package fr.diginamic.banque.entites;

public class Compte {

	private int numeroDeCompte;
	private int soldeDuCompte;
	
	/**
	 * @param numeroDeCompte
	 * @param soldeDuCompte
	 */
	public Compte(int numeroDeCompte, int soldeDuCompte) {
		this.numeroDeCompte = numeroDeCompte;
		this.soldeDuCompte = soldeDuCompte;
	}

	/**
	 * @return Retourne le numéro de compte
	 */
	public int getNumeroDeCompte() {
		return numeroDeCompte;
	}

	/**
	 * @param Définir numéro de compte
	 */
	public void setNumeroDeCompte(int numeroDeCompte) {
		this.numeroDeCompte = numeroDeCompte;
	}

	/**
	 * @return Retourne solde du compte
	 */
	public int getSoldeDuCompte() {
		return soldeDuCompte;
	}

	/**
	 * @param Définir solde du compte
	 */
	public void setSoldeDuCompte(int soldeDuCompte) {
		this.soldeDuCompte = soldeDuCompte;
	}

	
	@Override
	public String toString() {
		return "Compte [numeroDeCompte=" + numeroDeCompte + ", soldeDuCompte=" + soldeDuCompte + "]";
	}
	
	
	
	
	
}
