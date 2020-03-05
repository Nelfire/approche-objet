package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		
		CalculMoyenne c1 = new CalculMoyenne();
		c1.ajouter(5);

		 CalculMoyenne c2 = new CalculMoyenne();
		c2.ajouter(15);
		
		CalculMoyenne c3 = new CalculMoyenne();
		c3.ajouter(25);


		System.out.println(c1.calcul());
		System.out.println(c2.calcul());
		System.out.println(c3.calcul());


	}

}
