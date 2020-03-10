package fr.diginamic.jdr.essai;

import java.util.Random;
import java.util.Scanner;

import fr.diginamic.jdr.entites.Creature;
import fr.diginamic.jdr.entites.Gobelin;
import fr.diginamic.jdr.entites.Loup;
import fr.diginamic.jdr.entites.Personnage;
import fr.diginamic.jdr.entites.Troll;

public class TestCombat {

	public static void main(String[] args) {

		//Scanner
		Scanner sc = new Scanner(System.in);
		String message;
		//Cr�ation d'un personnage, � d�faut de pas pouvoir le faire dans le switch
		Personnage p1 = new Personnage(null);
		// Points du joueur
		int points = 0;

		//Affichage du menu
		System.out.println("0 - Quitter");
		System.out.println("1 - Cr�er un personnage");
		System.out.println("2 - Lancer le combat");
		System.out.println("3 - Afficher le score");
		
		boolean sortie = false;
		while (!sortie) {
			System.out.println("Choix ?");
			int choix = sc.nextInt();
			switch (choix) {
			case 0: // Quitter
				break;
			case 1: // Cr�er un personnage
				// Personnage p1 = new Personnage();
				System.out.println("Bienvenue dans ce monde, aventurier! Comment vous appellez vous ?");
				String nomJoueur = sc.next();
				p1 = new Personnage(nomJoueur);
				System.out.println("Tr�s bien "+nomJoueur+" � vous de jouer maintenant.");
				
				break;
			case 2: // Lancer un combat
				int creatureRandom = new Random().nextInt(3);
				Creature creature = null;
				// switch pour affectation de la cr�ature
				if (creatureRandom == 0) {
					creature = new Gobelin();
					points = 2;
				} else if (creatureRandom == 1) {
					creature = new Troll();
					points = 5;
				} else if (creatureRandom == 2) {
					creature = new Loup();
					points = 1;
				}
				// V�rifier que le personnage n'est pas d�c�d�
				if (p1.getVie() > 0) {
					System.out.println("Vous affrontez un " + creature.getNom() + ", avec force = "
							+ creature.getForce() + ", vie = " + creature.getVie());
					while (p1.getVie() > 0 && creature.getVie() > 0) {

						// Cas attaque monstre superieure � celle du joueur , joueur subis des d�gats
						if (creature.getAttackValue() > p1.getAttackValue()) {
							p1.setVie(p1.getVie() - creature.getAttackValue());
							if (p1.getVie() <= 0) {

								message = "La cr�ature vous inflige  : " + creature.getAttackValue()
										+ "d�gats. Vous mourrez dans d'atroces souffrances.";
								System.out.println(message);
								System.out.println(Loup.loupsCrees + " loups ont �t� g�n�r�s");
								System.out.println(Gobelin.gobelinCrees + " gobelins ont �t� g�n�r�s");
								System.out.println(Troll.trollCrees + " trolls ont �t� g�n�r�s");
							} else {
								message = "La cr�ature vous inflige  : " + creature.getAttackValue()
										+ "d�gats. Il vous reste " + p1.getVie() + " vie.";
								System.out.println(message);
							}
						} else { // Cas attaque joueur superieure au monste , monste subis des d�gats
							creature.setVie(creature.getVie() - p1.getAttackValue());
							if (creature.getVie() <= 0) {
								message = "la cr�ature meurt.";
								p1.setScore(p1.getScore()+points);
							} else {
								message = "il lui reste " + creature.getVie() + " vie";
							}
							System.out.println(
									"Vous infligez " + p1.getAttackValue() + " d�gats � la cr�ature, " + message);
						}
					}

				} else { // Cas ou personnage est d�c�d�
					System.out.println("Votre personnage "+p1.getNom()+" est d�c�d�. Il a obtenu le score de " + p1.getScore()
							+ " points. Veuillez cr�er un nouveau personnage.");
				}

				break;
			case 3: // Afficher le score
				System.out.println("Score de : " + p1.getScore());
				break;
			}
		}
		sc.close();

//		Scanner sc = new Scanner(System.in);
//		int choixDuJoueur;
//
//		Personnage p1 = new Personnage();
//
//		System.out.println("0 - Quitter");
//		System.out.println("1 - Cr�er un personnage");
//		System.out.println("2 - Lancer le combat");
//		System.out.println("3 - Afficher le score");
//
//		boolean sortie = false;
//		while (!sortie) {
//			choixDuJoueur = sc.nextInt();
//			switch (choixDuJoueur) {
//			
//			case 0: // Quitter
//				break;
//			case 1: // Cr�er un personnage
//				//Personnage p1 = new Personnage();
//				System.out.println("Bienvenue dans ce monde ! Je vous rappelle vos caracteristiques");
//				System.out.println(p1);
//				break;
//			case 2: // Lancer un combat
//				if(p1.getVie()>0) {
//					
//				} else {
//					System.out.println("Votre personnage est d�c�d�. Il a obtenu le score de X points. Veuillez cr�er un nouveau personnage ");
//				}
//				break;
//			case 3: // Afficher le score
//				break;
//
//			}
//		}
//
//		sc.close();

	}

}
