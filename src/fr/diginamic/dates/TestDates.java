package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	/**
		Cr�ez une classe TestDates ex�cutable
		o Cr�ez une instance de la classe java.util.Date � la date du jour en utilisant un de
		ses constructeurs
		o Affichez l�instance ainsi cr��e au format suivant :
		 jour/mois/ann�e
		o Cr�ez une instance de la classe Date � la date du jour, et � l�heure suivante :
		23h30 et 59 secondes.
		o Affichez l�instance ainsi cr��e au format suivant :
		 ann�e/mois/jour heure:minute:seconde
		o Cr�ez une instance de Date contenant la date/heure syst�me et affichez la au
		m�me format que ci-dessus.
	 */
	public static void main(String[] args) {

		//Cr�ez une instance de la classe java.util.Date � la date du jour en utilisant un de ses constructeurs
		Date date = new Date();
		// Affichez l�instance ainsi cr��e au format suivant : jour/mois/ann�e
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(formatter.format(date));
		
		//Cr�ez une instance de la classe Date � la date du jour, et � l�heure suivante : 23h30 et 59 secondes.
		Date date2 = new Date();
		date2.getTime();
		date2.setHours(23);
		date2.setMinutes(30);
		date2.setSeconds(59);
		
		//Affichez l�instance ainsi cr��e au format suivant :  ann�e/mois/jour heure:minute:seconde
		formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(formatter.format(date));

		//Cr�ez une instance de Date contenant la date/heure syst�me et affichez la au m�me format que ci-dessus
		Date dateSystem = new Date();
		System.out.println(formatter.format(dateSystem));
	}

}
