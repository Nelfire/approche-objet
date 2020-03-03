package entites;

public class AdressePostale {
	public int numeroRue;
	public String libelleRue;
	public int codePostal;
	public String ville;
	
	public AdressePostale(int numeroRue, String libelleRue, int codePostal, String ville) {
		this.numeroRue = numeroRue;
		this.libelleRue = libelleRue;
		this.codePostal = codePostal;
		this.ville = ville;
		
		
	}

	/**
	 * @return Retourner le num�ro de rue
	 */
	public int getNumeroRue() {
		return numeroRue;
	}

	/**
	 * @param D�finir un numero de rue
	 */
	public void setNumeroRue(int numeroRue) {
		this.numeroRue = numeroRue;
	}

	/**
	 * @return Retourner le libell� de la rue
	 */
	public String getLibelleRue() {
		return libelleRue;
	}

	/**
	 * @param D�finir un libell� de rue
	 */
	public void setLibelleRue(String libelleRue) {
		this.libelleRue = libelleRue;
	}

	/**
	 * @return Retourner le code postal
	 */
	public int getCodePostal() {
		return codePostal;
	}

	/**
	 * @param D�finir un code postal
	 */
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	/**
	 * @return Retourner le nom de la ville
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * @param D�finir une ville
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}



}
