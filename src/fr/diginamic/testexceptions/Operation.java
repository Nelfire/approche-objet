package fr.diginamic.testexceptions;

/** Classe qui fournit des méthodes de calcul
 * @author 20-100
 *
 */
public class Operation {
	
	/** Méthode qui calcuel la division de 2 entiers et retourne le resultat
	 * @param a 1er entier
	 * @param b 2eme entier
	 * @return double
	 * @throws DivException si b est égalt a 0
	 */
	public static double diviser(int a, int b) throws DivException {
		
		if(b==0) {
			throw new DivException ("Interdit de diviser par 0");
		}
		double c = a/b;
		return c;
	}
	
	public static double diviserRuntime(double a , double b) {
		//c. Si b vaut 0 alors la méthode remonte une RuntimeException.
		if(b==0) {
			throw new RuntimeException ("Runtime erreur : Interdit de diviser par 0");
		}
		double c = a/b;
		//b. la méthode retourne le résultat de a / b
		return c;
	}

}
