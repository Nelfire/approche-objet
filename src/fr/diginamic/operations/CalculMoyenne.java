package fr.diginamic.operations;

public class CalculMoyenne {

	double[] tab2 = new double[0];

	/** Constructeur
	 * @param tab
	 */
	public CalculMoyenne() {

	}
	
	public void ajouter(double val) {
		
		// On crée un tableau temporaire plus grand d'une case que le tableau précédent
		double[] tmp = new double[tab2.length + 1];
		
		// On stocke toutes les valeurs du tableau précédent dans le nouveau tableau
		for (int i = 0; i < tmp.length - 1 && tab2.length > 0; i++) {
			tmp[i] = tab2[i];
		}
		
		// Puis en fin de tableau, on stocke la valeur saisie
		tmp[tmp.length - 1] = val;
		
		// On affecte enfin le tableau tmp au tableau tab
		tab2 = tmp;
	}
	
	public double calcul() {
		double val = 0;
		for(int i=0; i<tab2.length;i++) {
			val = val + tab2[i];
		}
		return val;
	}
	
	
	/* 
	 * 
	 * 
	 * 	public void ajouter(double val) {
		tab[tab.length-1] = val;
		tabTemporaire = tab;
		double[] tab = {tabTemporaire.length+1};
		tab = tabTemporaire;
		double[] tabTemporaire = {tab.length};
		
		
		for(int i=0; i<tab.length;i++) {
			System.out.println(tab[i]);
		}
	}
	
	
	
	
	 public void ajouterValeurTableau(double val) {
		tab[tab.length-1] = val;
		tabTemporaire = tab;
		double[] tab = {tabTemporaire.length+1};
		double[] tabTemporaire = {tab.length};
	}
	
	public static double calcul(double tab[]) {
		double val = 0;
		for(int i=0; i<tab.length;i++) {
			val = val + tab[i];
			val = val / tab.length;
		}
		return val;
	}
	 */
}
