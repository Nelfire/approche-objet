package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {

		//Instanciation de deux cercles
		Cercle c1 = new Cercle(5);
		Cercle c2 = new Cercle(10);
		
		//Affichage périmetre
		c1.perimetreCercle(c1.getRayon());
		

		//Affichage surface
		c2.surfaceCercle(c1.getRayon());
		
		// -----
		Cercle c3 = CercleFactory.creerCercle(40);
		c3.surfaceCercle(c3.getRayon());
		
		
		
		
		
		
	}


}
