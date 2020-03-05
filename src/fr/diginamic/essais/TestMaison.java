package fr.diginamic.essais;

import fr.diginamic.maison.*;

public class TestMaison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maison m = new Maison();
		
		m.ajouterPiece(new Chambre(12,1));
		m.ajouterPiece(new Salon(30,0));
		m.ajouterPiece(new Cuisine(18,0));
		m.ajouterPiece(new Chambre(14,2));
		m.ajouterPiece(new Chambre(21,2));
		m.ajouterPiece(new SalleDeBain(12,1));
		m.ajouterPiece(new WC(12,1));
		
		System.out.println(m);
		
		System.out.println(m.getSuperficieTotale());
		
		
		

	}

}
