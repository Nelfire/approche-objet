package fr.diginamic.operations;

public class Operations {

	/**
	 * Méthode de calcul
	 * @param a => Chiffre 1 
	 * @param b => Chiffre 2
	 * @param op => Opérateur
	 * @return
	 */
	public static double calcul (double a, double b, char op) {
		double c = 0;
		if(op=='+') {
			c = a + b;
		} else if (op=='-') {
			c = a - b;
		} else if (op=='*') {
			c = a * b;
		} else if (op=='/') {
			c = a / b;
		}
		return c;
	}
}
