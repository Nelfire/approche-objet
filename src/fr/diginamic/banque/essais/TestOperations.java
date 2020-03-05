package fr.diginamic.banque.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {
		//Operations op1 = new Operations();
		
		//Soustraction
		System.out.println(Operations.calcul(5, 8, '-'));
		
		//Addition
		System.out.println(Operations.calcul(5, 8, '+'));
		
		//Multiplication
		System.out.println(Operations.calcul(5, 8, '*'));
		
		//Division
		System.out.println(Operations.calcul(5, 8, '/'));

	}

}
