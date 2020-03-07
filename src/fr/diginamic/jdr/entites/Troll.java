package fr.diginamic.jdr.entites;

import java.util.Random;

public class Troll extends Creature {
	
	
	public static int trollCrees=0;

	public Troll() {
		nom = "Troll";
		force = new Random().nextInt(15) + 10;
		vie = new Random().nextInt(30) + 20;
		trollCrees++;
	}
}
