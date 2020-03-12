package fr.diginamic.tri;

import java.util.ArrayList;
import java.util.Collections;

public class TestTriPays {

	public static void main(String[] args) {


		ArrayList<Pays> liste = new ArrayList<>();
		liste.add(new Pays("Japon", 126.8, 42659d));
		liste.add(new Pays("Allemagne", 82.79, 50200d));
		liste.add(new Pays("Inde", 1_368.163, 5174d));
		liste.add(new Pays("France", 66.99, 43551d));
		liste.add(new Pays("Italie", 60.48, 37970d));
		liste.add(new Pays("Russie", 146.780, 27900d));
		liste.add(new Pays("Chine", 1_395.380, 16624d));
		liste.add(new Pays("UK", 66.44, 43620d));
		liste.add(new Pays("USA", 327.2, 57638d));
		
		
		
		
		

		Collections.sort(liste,new ComparatorPibHabitant());
		for(Pays pays: liste) {
			System.out.println(pays);
		}
	}

}
