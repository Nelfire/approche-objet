package fr.diginamic.chaines;

import fr.diginamic.banque.entites.Client;
import fr.diginamic.banque.entites.Compte;

public class ManipulationChaine {

	public static void main(String[] args) {
		
		//D�claration de la chaine, avec pour s�parateur des ";"
		String chaine = "Durand;Marcel;012543;1 523";

		System.out.println("Premier caractere : "+chaine.charAt(0));
		System.out.println("Taille chaine: "+chaine.length());
		System.out.println("Premier ; rencontr� en position : "+chaine.indexOf(';'));
		System.out.println("Nom de famille : " + chaine.substring(0, chaine.indexOf(';')));
		System.out.println("Nom de famille en maj : " + (chaine.substring(0, chaine.indexOf(';')).toUpperCase()));
		System.out.println("Nom de famille en min : " + (chaine.substring(0, chaine.indexOf(';')).toLowerCase()));
		
		//Cr�ation d'un tableau s�parant les diff�rents �l�ments de la chaine, � partir du s�parateur ";"
		String[] donnee = chaine.split(";");
		
		//Affichage de toutes les donn�es pour voir si �a fonctionne
		for(int i=0; i<donnee.length; i++) {
			System.out.print(donnee[i]+"    ");
		}

		//Cr�ation d'une instance de client
		Client client1 = new Client(donnee[0],donnee[1]);
		
		//Cr�ation d'une instance de compte
		Compte compte1 = new Compte(Integer.parseInt(donnee[2]),Integer.parseInt(donnee[3].replace(" ","")));

		//Affichage
		System.out.println("\n\nAffichage des instances cr��es : \n");
		System.out.println(client1);
		System.out.println(compte1);
		
		

	}

}
