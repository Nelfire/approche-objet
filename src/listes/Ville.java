package listes;

public class Ville {
	
	private String nom;
	private int nbHabitant;
	/** Constructeur
	 * @param nom
	 * @param nbHabitant
	 */
	public Ville(String nom, int nbHabitant) {
		super();
		this.nom = nom;
		this.nbHabitant = nbHabitant;
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
	/** Getter
	 * @return the nbHabitant
	 */
	public int getNbHabitant() {
		return nbHabitant;
	}
	/** Setter
	 * @param nbHabitant the nbHabitant to set
	 */
	public void setNbHabitant(int nbHabitant) {
		this.nbHabitant = nbHabitant;
	}
	@Override
	public String toString() {
		return "Ville '" + nom + "', Nombre Habitants = " + nbHabitant;
	}
	
	
	public String majuscule() {
		String nomMajuscule = nom.toUpperCase();
		return nomMajuscule;
	}
	

}
