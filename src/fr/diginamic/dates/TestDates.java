package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	/**
		Créez une classe TestDates exécutable
		o Créez une instance de la classe java.util.Date à la date du jour en utilisant un de
		ses constructeurs
		o Affichez l’instance ainsi créée au format suivant :
		 jour/mois/année
		o Créez une instance de la classe Date à la date du jour, et à l’heure suivante :
		23h30 et 59 secondes.
		o Affichez l’instance ainsi créée au format suivant :
		 année/mois/jour heure:minute:seconde
		o Créez une instance de Date contenant la date/heure système et affichez la au
		même format que ci-dessus.
	 */
	public static void main(String[] args) {

		//Créez une instance de la classe java.util.Date à la date du jour en utilisant un de ses constructeurs
		Date date = new Date();
		// Affichez l’instance ainsi créée au format suivant : jour/mois/année
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(formatter.format(date));
		
		//Créez une instance de la classe Date à la date du jour, et à l’heure suivante : 23h30 et 59 secondes.
		Date date2 = new Date();
		date2.getTime();
		date2.setHours(23);
		date2.setMinutes(30);
		date2.setSeconds(59);
		
		//Affichez l’instance ainsi créée au format suivant :  année/mois/jour heure:minute:seconde
		formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(formatter.format(date));

		//Créez une instance de Date contenant la date/heure système et affichez la au même format que ci-dessus
		Date dateSystem = new Date();
		System.out.println(formatter.format(dateSystem));
	}

}
