package fr.diginamic.operations;

public class Operations {

	/**
	 * M�thode de calcul
	 * @param a => Chiffre 1 
	 * @param b => Chiffre 2
	 * @param op => Op�rateur
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
