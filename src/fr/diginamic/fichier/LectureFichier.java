package fr.diginamic.fichier;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

public class LectureFichier {

	public static void main(String[] args) throws IOException {
		// On localise le fichier, qu'on stock dans la variable file
		File file = new File(
				"C:/Users/20-100/Desktop/COURS DTA/10.03.2020 - AUTOFORMATION JAVA/recensement population 2016.csv");
		// On ecrit le contenu du fichier dans un tableau "lignes"
		List<String> lignes = FileUtils.readLines(file, "UTF-8");

		// Variables
		Scanner sc = new Scanner(System.in);
		int populationOccitanie = 0;
		int PlusPetiteVilleDuDepartementHeraut = 1_000_000_000;
		String nomPlusPetiteVilleDuDepartementHeraut = "";
		// Cr�ation de deux arrayList vide, pour y accueillir les 10 villes les plus
		// (petites/Grandes) Etape 6.
		ArrayList<Ville> villesLesPlusGrandesHeraut = new ArrayList<>();
		ArrayList<Ville> villesLesPlusPetitesHeraut = new ArrayList<>();
		// Cr�ation de d'un arrayList vide, pour y accueillir les 10 villes les plus
		// peupl�es d'occitanie. Etape 8
		ArrayList<Ville> villesLesPlusGrandesOccitanie = new ArrayList<>();
		ArrayList<Ville> listeCompleteVilles = new ArrayList<>();
		

		for (int i = 1; i < lignes.size(); i++) {

			String ligne = lignes.get(i);

			// On commence par d�coupe.
			String[] morceaux = ligne.split(";");
			String codeRegion = morceaux[0];
			String nomRegion = morceaux[1];
			String codeDepartement = morceaux[2];
			String codeCommune = morceaux[5];
			String nomCommune = morceaux[6];
			String populationString = morceaux[7];

			// On transforme la population string en int, en virant les espaces
			int population = Integer.parseInt(populationString.replace(" ", ""));

			// On instancie des villes en rapport aux donn�es r�cup�r� ci-dessus
			Ville ville = new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, population);
			listeCompleteVilles.add(ville);

			/*
			 * Etape 3 : o Recherchez dans la liste la ville de Montpellier et affichez
			 * toutes les informations la concernant
			 */

			if (ville.getNomCommune().equals("Montpellier")) {
				// System.out.println(ville);
			}

			/*
			 * � Etape 4 : o Exploitez les donn�es dont vous disposez pour afficher la
			 * population de tout le d�partement de l�H�rault.
			 */

			// ville.afficherVillesDuDepartement("84");

			/*
			 * � Etape 5 : Affichez la plus petite ville du d�partement
			 * 
			 */

			if (ville.getCodeDepartement().equals("34")) {
				if (ville.getPopulation() < PlusPetiteVilleDuDepartementHeraut) {
					PlusPetiteVilleDuDepartementHeraut = ville.getPopulation();
					nomPlusPetiteVilleDuDepartementHeraut = ville.getNomCommune();
				}

			}

			/*
			 * 
			 * � Etape 6 : o Affichez les 10 plus grandes villes du d�partement o Affichez
			 * les 10 plus petites villes du d�partement
			 */
			if (ville.getCodeDepartement().equals("34")) {
				// Tant que j'ai moins de 10 valeurs dans mon tableau dynamique, je le remplis
				// des villes rencontr�es
				if (villesLesPlusPetitesHeraut.size() <= 9) {
					villesLesPlusPetitesHeraut.add(ville);
				} else // Si mon tableau est d�j� plein, alors je remplaces les villes d�j� pr�sentes
						// dedans par les nouvelles villes rencontr�es avec moins d'habitants
				{
					// Parcourir le tableau de ville cr��, pour y v�rifier la population, et les
					// remplacer si je rencontre de nouvelles donn�es plus interessantes
					for (int j = 0; j < villesLesPlusPetitesHeraut.size(); j++) {
						if (villesLesPlusPetitesHeraut.get(j).getPopulation() > population) {
							// Si la ville que je suis en train d'analyser depuis le fichier excel est plus
							// petite que ma ville dans mon tableau alors je la remplace
							villesLesPlusPetitesHeraut.set(j, ville);
							// Puis je force la fin du tableau, pour pas remplacer les autres
							j = villesLesPlusPetitesHeraut.size();
						}
					}

				}
			}

			boolean flag = false;
			if (ville.getCodeDepartement().equals("34")) {
				// Tant que j'ai moins de 10 valeurs dans mon tableau dynamique, je le remplis
				if (villesLesPlusGrandesHeraut.size() <= 9) {
					villesLesPlusGrandesHeraut.add(ville);
				} else // Si mon tableau est d�j� plein, alors je remplaces les villes d�j� pr�sentes
						// dedans par les nouvelles villes rencontr�es avec plus d'habitants
				{
					// Parcourir le tableau de ville
					for (int k = 0; k < villesLesPlusGrandesHeraut.size(); k++) {
						if(flag==false) {
							if (villesLesPlusGrandesHeraut.get(k).getPopulation() < population) {
								// Si la ville que je suis en train d'analyser depuis le fichier excel est plus
								// grande que ma ville dans mon tableau alors je la remplace
								villesLesPlusGrandesHeraut.set(k, ville);
								// Puis je force la fin du tableau, pour pas remplacer les autres
								flag = true;
							}
						}

					}

				}
			}

			/*
			 * Etape 7 : o Affichez la population de toute la r�gion Occitanie
			 */

			if (ville.getNomRegion().equals("Occitanie")) {
				populationOccitanie = populationOccitanie + ville.getPopulation();
			}

			/*
			 * 
			 * � Etape 8 (plus difficile): o Affichez les 10 villes les plus importantes de
			 * la r�gion Occitanie o Affichez le d�partement le plus peupl� de la r�gion
			 * Occitanie
			 * 
			 */
			
			if (ville.getNomRegion().equals("Occitanie")) {
				// Tant que j'ai moins de 10 valeurs dans mon tableau dynamique, je le remplis
				if (villesLesPlusGrandesOccitanie.size() <= 9) {
					villesLesPlusGrandesOccitanie.add(ville);
				} else // Si mon tableau est d�j� plein, alors je remplaces les villes d�j� pr�sentes
						// dedans par les nouvelles villes rencontr�es avec plus d'habitants
				{
					// Parcourir le tableau de ville
					for (int k = 0; k < villesLesPlusGrandesOccitanie.size(); k++) {
						if (villesLesPlusGrandesOccitanie.get(k).getPopulation() < population) {
							// Si la ville que je suis en train d'analyser depuis le fichier excel est plus
							// grande que ma ville dans mon tableau alors je la remplace
							villesLesPlusGrandesOccitanie.set(k, ville);
							// Puis je force la fin du tableau, pour pas remplacer les autres
							k = villesLesPlusGrandesOccitanie.size();
						}
					}

				}
			}
			

			
			

		}
		


		// Etape 6

		try {
			System.out.println("Villes les plus grandes d'H�raut :\n\n"+Ville.Rechercher10PlusGrandesVilles(listeCompleteVilles, "34"));
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}


		// Etape 7
		System.out.println("La population totale de l'occitanie est de : " + populationOccitanie + " �mes.");
		

		// Etape 8
		System.out.println("Villes les plus grandes d'Occitanie :");
		System.out.println(villesLesPlusGrandesOccitanie);
		

		// Dans le cas o� vous �tiez parti sur le TP facile, il faudra que vous ajoutiez quelques interactions avec l'utilisateur au moyen de la classe Scanner. Cela vous rapprochera de ce qui �tait demand� dans le TP le plus difficile.
		System.out.println("Les plus grandes villes de quel d�partement souhaitez-vous voir (deux chiffres)? :");
		Integer choix = sc.nextInt();
		

		try {
			System.out.println("Voici les villes les plus peupl�es du d�partement "+choix+"\n\n"+Ville.Rechercher10PlusGrandesVilles(listeCompleteVilles, choix.toString()));
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		sc.close();
		
		

		

	}

}
