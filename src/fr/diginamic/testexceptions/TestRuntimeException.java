package fr.diginamic.testexceptions;

public class TestRuntimeException {

	/**
	5) Cr�ez un nouveau package fr.diginamic.testexceptions
	6) Dans ce package cr�ez une classe TestRuntimeException ex�cutable
	7) Modifiez la classe Operation avec une m�thode static diviserRuntime:
	a. cette m�thode prend en param�tre 2 param�tres de type double a et b
	b. la m�thode retourne le r�sultat de a / b
	c. Si b vaut 0 alors la m�thode remonte une RuntimeException.
	8) Depuis la classe Application, appelez la m�thode diviserRuntime de la classe Operation
	dans 2 cas :
	a. un premier appel qui se passe bien et qui affiche le r�sultat
	b. un second appel qui se passe mal.
	9) essayer de catcher l�excep.
	 */
	public static void main(String[] args) {

		// a. un premier appel qui se passe bien et qui affiche le r�sultat
		double div1 = Operation.diviserRuntime(25.0, 5.0);
		System.out.println(div1);

		// b. un second appel qui se passe mal.
//		double div2 = Operation.diviserRuntime(5, 0);
//		System.out.println(div2);
		
		//9) essayer de catcher l�excep
		
		try {
			double div3 = Operation.diviserRuntime(5, 0);
			System.out.println(div3);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
