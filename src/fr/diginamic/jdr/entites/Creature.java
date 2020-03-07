package fr.diginamic.jdr.entites;

import java.util.Random;

abstract public class Creature {
	
	protected double vie;
	protected double force;
	protected String nom;
	
	
	public int getAttackValue() {
		double degatsSupplementaires = new Random().nextInt(10) + 1;
		return (int) (force+degatsSupplementaires);
	}
	
	/** Getter
	 * @return the vie
	 */
	public double getVie() {
		return vie;
	}
	/** Setter
	 * @param vie the vie to set
	 */
	public void setVie(double vie) {
		this.vie = vie;
	}
	/** Getter
	 * @return the force
	 */
	public double getForce() {
		return force;
	}
	/** Setter
	 * @param force the force to set
	 */
	public void setForce(double force) {
		this.force = force;
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
