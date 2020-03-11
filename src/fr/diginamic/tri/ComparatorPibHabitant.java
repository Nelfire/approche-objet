package fr.diginamic.tri;

import java.util.Comparator;

public class ComparatorPibHabitant implements Comparator<Pays> {

	@Override
	public int compare(Pays pays1, Pays pays2) {
		double result = pays1.getPIB() - pays2.getPIB();
		return (int) result;
	}

}
