package listes;

import java.util.ArrayList;

public class CreationListe {

	public static void main(String[] args) {
		
		//Création d'un tableau d'entiers
		ArrayList<Integer> tableauEntiers = new ArrayList<>();
		
		//On remplis le tableau d'éléments.
		for (int i = 0; i <= 100; i++) {
			tableauEntiers.add(i);
		}
		
		//On affiche les éléments du tableau.
		for (int i = 0; i <= 100; i++) {
			System.out.println(tableauEntiers.get(i));
		}
	}
}
