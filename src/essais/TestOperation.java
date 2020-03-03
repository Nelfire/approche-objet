package essais;

import java.util.Scanner;

import entites.Operation;

public class TestOperation {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int nb1;
		int nb2;
		//Addition
		Operation addition = new Operation();
		int resultatAddition = addition.addition(5, 7);
		System.out.println(resultatAddition);

		//Addition2
		int resultatAddition2 = Operation.addition2(5, 7);
		System.out.println(resultatAddition2);


		//Multiplication
		Operation multiplication = new Operation();
		int resultatMultiplication = multiplication.multiplication(5, 7);
		System.out.println(resultatMultiplication);
		

		//Soustraction
		Operation soustraction = new Operation();
		int resultatSoustraction = soustraction.soustraction(5, 7);
		System.out.println(resultatSoustraction);

		System.out.println("Choix ?");
		System.out.println("1 - Addition");
		System.out.println("2 - Multiplication");
		System.out.println("3 - Soustraction");
		int choix = sc.nextInt();
		
		switch(choix) {
		case 1: //Addition
			System.out.println("Vos deux chiffres à additionner ?");
			nb1 = sc.nextInt();
			nb2 = sc.nextInt();
			System.out.println(addition.addition(nb1, nb2));
			break;
		case 2:	//Multiplication	
			System.out.println("Vos deux chiffres à multiplier ?");	
			nb1 = sc.nextInt();
			nb2 = sc.nextInt();
			System.out.println(multiplication.multiplication(nb1, nb2));
			break;
		case 3: //Soustraction
			System.out.println("Vos deux chiffres à soustraire ?");
			nb1 = sc.nextInt();
			nb2 = sc.nextInt();
			System.out.println(soustraction.soustraction(nb1, nb2));
			break;
		default:
			break;
			
		}
	}

}
