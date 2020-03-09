package listes;

import java.util.ArrayList;
import java.util.Arrays;

public class TestListeString {

	public static void main(String[] args) {
		
		String elementLePlusGrand = "";
		ArrayList<String> liste = new ArrayList<>(Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"));
		
		//Recherche element le plus long
		for(int i = 0; i < liste.size(); i++) {
			if(liste.get(i).length()>elementLePlusGrand.length()) {
				elementLePlusGrand = liste.get(i);
			}
		}
		System.out.println("Nom le plus long : "+elementLePlusGrand);
		
		//Recherche element le plus long
		for(int i = 0; i < liste.size(); i++) {
			String elementEnMajuscule = liste.get(i);
			liste.set(i,elementEnMajuscule.toUpperCase());
		}
		
		// Afficher les élements
		for (int i = 0; i < liste.size(); i++) {
			System.out.println(liste.get(i));
		}
		
		//Retirer les villes commencant par un N
		for (int i = 0; i < liste.size(); i++) {
			if(liste.get(i).charAt(0) == 'N') {
				liste.remove(i);
			}
		}
		// Afficher les élements
		System.out.println("Villes ne commençant pas par N");
		for (int i = 0; i < liste.size(); i++) {
			System.out.println(liste.get(i));
		}

	}

}
