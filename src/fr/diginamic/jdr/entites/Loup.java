package fr.diginamic.jdr.entites;

import java.util.Random;

public class Loup extends Creature {
	
	/** Nombre d'instances de loups créées */
	public static int loupsCrees = 0;
	
	public Loup() {
		nom = "Loup";
		force = new Random().nextInt(8) + 3;
		vie = new Random().nextInt(10) + 5;
		loupsCrees++;
	}
	
	

}
