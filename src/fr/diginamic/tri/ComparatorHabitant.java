package fr.diginamic.tri;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Pays>{

	@Override
	public int compare(Pays pays1, Pays pays2) {
		double result = pays1.getNbHabitants() - pays2.getNbHabitants();
		return (int) result;
	}
	
	

}
