package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {
		
		// Cr�ez une instance de Salarie et affichez le r�sultat retourn� par la m�thode getSalaire
		Salarie personne1 = new Salarie("Paul","STRIGE",2500);
		System.out.println(personne1.getSalaire());

		//Cr�ez une instance de Pigiste et affichez le r�sultat retourn� par la m�thode getSalaire
		Pigiste personne2 = new Pigiste("Gerard","DUPONT",90,30);
		System.out.println(personne2.getSalaire());
		
		//Affichage complet des inforamtions
		personne1.afficherDonnees();
		personne2.afficherDonnees();

	}

}
