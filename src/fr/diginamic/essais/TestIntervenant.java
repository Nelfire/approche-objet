package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {
		
		// Créez une instance de Salarie et affichez le résultat retourné par la méthode getSalaire
		Salarie personne1 = new Salarie("Paul","STRIGE",2500);
		System.out.println(personne1.getSalaire());

		//Créez une instance de Pigiste et affichez le résultat retourné par la méthode getSalaire
		Pigiste personne2 = new Pigiste("Gerard","DUPONT",90,30);
		System.out.println(personne2.getSalaire());
		
		//Affichage complet des inforamtions
		personne1.afficherDonnees();
		personne2.afficherDonnees();

	}

}
