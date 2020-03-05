package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		
		CalculMoyenne c1 = new CalculMoyenne();
		c1.ajouter(2.5);
		c1.ajouter(8.5);
		c1.ajouter(14.0);

		System.out.println(c1.calcul());

		CalculMoyenne c2 = new CalculMoyenne();
		c2.ajouter(20.0);
		c2.ajouter(10.0);

		System.out.println(c2.calcul());
		
		CalculMoyenne c3 = new CalculMoyenne();
		c3.ajouter(25.0);
		c3.ajouter(12.0);

		System.out.println(c3.calcul());



	}

}
