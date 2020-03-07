package fr.diginamic.jdr.entites;

import java.util.Random;

public class Personnage extends Creature {


	private int score = 0;

	
	public Personnage(String nom) {
		this.nom = nom;
		this.force = new Random().nextInt(18) + 12;
		this.vie = new Random().nextInt(50) + 20;
	}


	/** Getter
	 * @return the score
	 */
	public int getScore() {
		return score;
	}


	/** Setter
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}
	
	
}
