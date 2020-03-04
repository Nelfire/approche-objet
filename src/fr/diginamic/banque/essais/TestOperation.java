package fr.diginamic.banque.essais;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;
import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {

	public static void main(String[] args) {
		// Definir tableau
		Operation[] tableauOperation = new Operation[4];

		// Opération de crédit
		Credit c1 = new Credit("12/01/2001", 1);
		Credit c2 = new Credit("22/01/2001", 2);

		// Opération de débit
		Debit d1 = new Debit("12/01/2001", 1);
		Debit d2 = new Debit("22/01/2001", 2);

		tableauOperation[0] = c1;
		tableauOperation[1] = c2;
		tableauOperation[2] = d1;
		tableauOperation[3] = d2;

		double soldeGlobal = 0;
		for (int i = 0; i < tableauOperation.length; i++) {
			System.out.println(tableauOperation[i] + "Type d'opération : " + tableauOperation[i].afficherType());
			if (tableauOperation[i].afficherType().equals("Débit")) {
				soldeGlobal = soldeGlobal - tableauOperation[i].getMontantOperation();
			} else {
				soldeGlobal = soldeGlobal + tableauOperation[i].getMontantOperation();
			}
		}
		System.out.println(soldeGlobal);
	}
}
