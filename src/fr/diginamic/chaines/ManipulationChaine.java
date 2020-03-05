package fr.diginamic.chaines;

import fr.diginamic.banque.entites.Client;
import fr.diginamic.banque.entites.Compte;

public class ManipulationChaine {

	public static void main(String[] args) {
		
		//Déclaration de la chaine, avec pour séparateur des ";"
		String chaine = "Durand;Marcel;012543;1 523";

		System.out.println("Premier caractere : "+chaine.charAt(0));
		System.out.println("Taille chaine: "+chaine.length());
		System.out.println("Premier ; rencontré en position : "+chaine.indexOf(';'));
		System.out.println("Nom de famille : " + chaine.substring(0, chaine.indexOf(';')));
		System.out.println("Nom de famille en maj : " + (chaine.substring(0, chaine.indexOf(';')).toUpperCase()));
		System.out.println("Nom de famille en min : " + (chaine.substring(0, chaine.indexOf(';')).toLowerCase()));
		
		//Création d'un tableau séparant les différents éléments de la chaine, à partir du séparateur ";"
		String[] donnee = chaine.split(";");
		
		//Affichage de toutes les données pour voir si ça fonctionne
		for(int i=0; i<donnee.length; i++) {
			System.out.print(donnee[i]+"    ");
		}

		//Création d'une instance de client
		Client client1 = new Client(donnee[0],donnee[1]);
		
		//Création d'une instance de compte
		Compte compte1 = new Compte(Integer.parseInt(donnee[2]),Integer.parseInt(donnee[3].replace(" ","")));

		//Affichage
		System.out.println("\n\nAffichage des instances créées : \n");
		System.out.println(client1);
		System.out.println(compte1);
		
		

	}

}
