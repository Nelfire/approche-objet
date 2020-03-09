package fr.diginamic.formesInterface;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjetGeometrique[] tab = new ObjetGeometrique[2]; // Tableau de 2

		tab[0] = new Cercle(5.0);
		tab[1] = new Rectangle(4.0,6.5);

		
		for (ObjetGeometrique objetGeometrique : tab) {
			System.out.println(objetGeometrique.getClass().getSimpleName());
			System.out.println("Perimetre : "+objetGeometrique.perimetre());
			System.out.println("Surface : "+objetGeometrique.surface());
			
		}
	}

}
