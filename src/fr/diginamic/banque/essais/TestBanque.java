package fr.diginamic.banque.essais;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {

		//Variables 
		int soldeGlobal = 0;
		
		// Initialisation du tableau de type compte
		Compte[] tableauDeComptes = new Compte[2];

		// Création d'un compte normal
		Compte c1 = new Compte(10, 1_000_000);
		tableauDeComptes[0] = c1;

		// Création d'un compte avec taux
		CompteTaux c2 = new CompteTaux(11, 2_000_000, 5);
		tableauDeComptes[1] = c2;

		// Afficher le tableau
		for (int i = 0; i <= tableauDeComptes.length - 1; i++) {
			System.out.println(tableauDeComptes[i]);
			soldeGlobal = soldeGlobal + tableauDeComptes[i].getSoldeDuCompte();
		}
		System.out.println("Solde global : "+soldeGlobal);

	}

}
