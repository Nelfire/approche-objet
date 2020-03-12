package fr.diginamic.testenumeration;

public enum Saison {

	PRINTEMPS("Printemps"),
	ETE("Ete"),
	AUTOMNE("Automne"),
	HIVER("Hiver");
	private String nom;
	private Saison(String nom) {
		this.nom = nom;
	}
	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
