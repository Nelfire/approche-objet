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
	 * @return the numeroDeCompte
	 */
	public int getNumeroDeCompte() {
		return numeroDeCompte;
	}

	/**
	 * @param numeroDeCompte the numeroDeCompte to set
	 */
	public void setNumeroDeCompte(int numeroDeCompte) {
		this.numeroDeCompte = numeroDeCompte;
	}

	/**
	 * @return the soldeDuCompte
	 */
	public int getSoldeDuCompte() {
		return soldeDuCompte;
	}

	/**
	 * @param soldeDuCompte the soldeDuCompte to set
	 */
	public void setSoldeDuCompte(int soldeDuCompte) {
		this.soldeDuCompte = soldeDuCompte;
	}

	/*
	@Override
	public String toString() {
		return "Compte [numeroDeCompte=" + numeroDeCompte + ", soldeDuCompte=" + soldeDuCompte + "]";
	}
	*/
	
	
	
	
	
}
