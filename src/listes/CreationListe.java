package listes;

import java.util.ArrayList;

public class CreationListe {

	public static void main(String[] args) {
		
		//Cr�ation d'un tableau d'entiers
		ArrayList<Integer> tableauEntiers = new ArrayList<>();
		
		//On remplis le tableau d'�l�ments.
		for (int i = 0; i <= 100; i++) {
			tableauEntiers.add(i);
		}
		
		//On affiche les �l�ments du tableau.
		for (int i = 0; i <= 100; i++) {
			System.out.println(tableauEntiers.get(i));
		}
	}
}
