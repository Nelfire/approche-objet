package listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {

	public static void main(String[] args) {


		//Creer liste 1
		List<String> liste1 = new ArrayList<>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		

		//Creer liste 2
		List<String> liste2 = new ArrayList<>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");
		
		//Creer liste 3
		List<String> liste3 = new ArrayList<>();
		

		//On met le contenue des listes 1 et 2 dans la liste 3
		for(int i = 0; i < liste1.size(); i++) {
			liste3.add(liste1.get(i));
			liste3.add(liste2.get(i));
		}
		
		//On affiche le contenu de la liste 3
		for(int i = 0; i < liste3.size(); i++) {
			System.out.println(liste3.get(i));
		}


	}

}
