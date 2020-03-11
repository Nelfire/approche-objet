package fr.diginamic.tri;

import java.util.HashSet;

public class Pays implements Comparable<Pays> {

	/** nom du pays*/
	private String nom;
	/** nbHabitants du pays */
	private double nbHabitants;
	/** PIB du pays */
	private double PIB;
	/** Constructeur
	 * @param nom
	 * @param nbHabitants
	 * @param pIB
	 */
	/** Constructeur
	 * @param nom
	 * @param nbHabitants
	 * @param pIB
	 */
	public Pays(String nom, double nbHabitants, double pIB) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		PIB = pIB;
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
	 * @return the nbHabitants
	 */
	public double getNbHabitants() {
		return nbHabitants;
	}
	/** Setter
	 * @param nbHabitants the nbHabitants to set
	 */
	public void setNbHabitants(double nbHabitants) {
		this.nbHabitants = nbHabitants;
	}
	/** Getter
	 * @return the pIB
	 */
	public double getPIB() {
		return PIB;
	}
	/** Setter
	 * @param pIB the pIB to set
	 */
	public void setPIB(double pIB) {
		PIB = pIB;
	}
	@Override
	public String toString() {
		return "Pays : " + nom + ", Nb habitants : " + nbHabitants + ", PIB :" + PIB;
	}
	
//	
//	@Override
//	public int compareTo(Pays pays2) {
//		int result = this.nom.compareTo(pays2.nom);
//		
//		return result;
//	}
	

	// Tri par PIB pays
	@Override
	public int compareTo(Pays pays2) {
		double result = this.PIB - pays2.getPIB();
		return (int) result;
	}
	
	
	
	
	
	
}
