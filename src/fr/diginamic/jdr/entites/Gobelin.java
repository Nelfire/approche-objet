package fr.diginamic.jdr.entites;

import java.util.Random;

public class Gobelin extends Creature {
	
	
	public static int gobelinCrees=0;

	public Gobelin() {
		nom = "Gobelin";
		force = new Random().nextInt(10) + 5;
		vie = new Random().nextInt(15) + 10;
		gobelinCrees++;
	}
	

}
