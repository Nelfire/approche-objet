package listes;

import java.util.ArrayList;

public class TestVille {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String villeLaPlusPeuplee = "";
		int nbHabitantVilleLaPlusPeuplee = 0;
		int indexVilleLaMoinsPeuplee = 0;
		 
		//Ajout des villes
		ArrayList<Ville> tableau = new ArrayList<>();
		tableau.add(new Ville("Nice",343_000));
		tableau.add(new Ville("Carcassonne",47_800));
		tableau.add(new Ville("Narbonne",53_400));
		tableau.add(new Ville("Lyon",484_000));
		tableau.add(new Ville("Foix",9_700));
		tableau.add(new Ville("Pau",77_200));
		tableau.add(new Ville("Marseille",850_700));
		tableau.add(new Ville("Tarbes",40_600));
		
		//Chercher la ville la plus peuplée
		for (int i = 0; i < tableau.size(); i++) {
			if(tableau.get(i).getNbHabitant()>nbHabitantVilleLaPlusPeuplee) {
				villeLaPlusPeuplee = tableau.get(i).getNom();
				nbHabitantVilleLaPlusPeuplee = tableau.get(i).getNbHabitant();
			}
		}
		
		System.out.println("------------ La ville peuplée est : "+villeLaPlusPeuplee+" avec "+nbHabitantVilleLaPlusPeuplee+" habitants.");
		
		
		//Retirer la ville la moins peuplée
		for (int i = 0; i < tableau.size(); i++) {
			if(tableau.get(i).getNbHabitant()<nbHabitantVilleLaPlusPeuplee) {
				indexVilleLaMoinsPeuplee = i;
			}
		}
		tableau.remove(indexVilleLaMoinsPeuplee);
		
		System.out.println("------------ Tableau sans la ville la moins peuplée : ");
		// Afficher les élements
		for (int i = 0; i < tableau.size(); i++) {
			System.out.println(tableau.get(i));
		}
		
		
		//Modifiez les villes de plus de 100 000 habitants en mettant leur nom en majuscules
		
		for (int i = 0; i < tableau.size(); i++) {
			if(tableau.get(i).getNbHabitant()>100_000) {
				String nomMajuscule = tableau.get(i).majuscule();
				tableau.get(i).setNom(nomMajuscule);
			}
		}
		
		// Afficher le tableau avec les noms de ville > 100 000 hab en maj
		System.out.println("------------ Les villes > 100 000 habitants en majuscule : ");
		for (int i = 0; i < tableau.size(); i++) {
			System.out.println(tableau.get(i));
		}
		
		
	}

}
