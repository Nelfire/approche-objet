package fr.diginamic.formes;

import fr.diginamic.chaines.AffichageForme;

public class TestForme {

	public static void main(String[] args) {


		// Cr�ation de 3 instances.
		Cercle f1 = new Cercle(5);
		Carre f2 = new Carre(5);
		Rectangle f3 = new Rectangle(5,5);


		//Appel de la m�thode afficher
		AffichageForme.afficher(f1);
		AffichageForme.afficher(f2);
		AffichageForme.afficher(f3);
		
	

	}


}
