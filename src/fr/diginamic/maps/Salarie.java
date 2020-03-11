package fr.diginamic.maps;

public class Salarie {

	/** nom de la personne */
	private String nom;
	/** salaire de la personne */
	private int salaire;
	
	/** Constructeur
	 * @param nom
	 * @param salaire
	 */
	public Salarie(String nom, int salaire) {
		super();
		this.nom = nom;
		this.salaire = salaire;
	}

	/** Recupere le nom de la personne
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Definir nom de la personne
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Recuperer salaire de la personne
	 * @return the salaire
	 */
	public int getSalaire() {
		return salaire;
	}

	/** Definir salaire de la personne
	 * @param salaire the salaire to set
	 */
	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return "Le salarié : " + nom + " à un salaire de : " + salaire;
	}
	
	
	
	
	
	
}
