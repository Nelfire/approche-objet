package fr.diginamic.testexceptions;

public class TestRuntimeException {

	/**
	5) Créez un nouveau package fr.diginamic.testexceptions
	6) Dans ce package créez une classe TestRuntimeException exécutable
	7) Modifiez la classe Operation avec une méthode static diviserRuntime:
	a. cette méthode prend en paramètre 2 paramètres de type double a et b
	b. la méthode retourne le résultat de a / b
	c. Si b vaut 0 alors la méthode remonte une RuntimeException.
	8) Depuis la classe Application, appelez la méthode diviserRuntime de la classe Operation
	dans 2 cas :
	a. un premier appel qui se passe bien et qui affiche le résultat
	b. un second appel qui se passe mal.
	9) essayer de catcher l’excep.
	 */
	public static void main(String[] args) {

		// a. un premier appel qui se passe bien et qui affiche le résultat
		double div1 = Operation.diviserRuntime(25.0, 5.0);
		System.out.println(div1);

		// b. un second appel qui se passe mal.
//		double div2 = Operation.diviserRuntime(5, 0);
//		System.out.println(div2);
		
		//9) essayer de catcher l’excep
		
		try {
			double div3 = Operation.diviserRuntime(5, 0);
			System.out.println(div3);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
