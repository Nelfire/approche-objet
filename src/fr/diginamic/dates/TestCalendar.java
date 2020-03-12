package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalendar {

	/**
	� Cr�ez une classe TestCalendar ex�cutable
	o Utilisez la classe java.util.Calendar pour cr�er une instance de Date � la date du
	jour et affichez la au format suivant :
	 jour/mois/ann�e
	o Utilisez la classe java.util.Calendar pour cr�er une instance de Date � la date du
	jour, et � l�heure suivante : 23h30 et 59 secondes.
	o Affichez l�instance ainsi cr��e au format suivant :
	 ann�e/mois/jour heure:minute:seconde
	o Utilisez la classe java.util.Calendar pour cr�er une Date contenant la date/heure
	syst�me et affichez la au format suivant :
	 jj-mm-aaaa hh:mm:ss
	 */
	public static void main(String[] args) {

		//Utilisez la classe java.util.Calendar pour cr�er une instance de Date � la date du jour et affichez la au format suivant : jour/mois/ann�e
		Calendar cal1 = Calendar.getInstance();
		Date date1 = cal1.getTime();
		SimpleDateFormat formatage = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(formatage.format(date1));
		
		//Utilisez la classe java.util.Calendar pour cr�er une instance de Date � la date du jour, et � l�heure suivante : 23h30 et 59 secondes.

		Calendar cal2 = Calendar.getInstance();
//		cal2.set(Calendar.YEAR, 2020);
//		cal2.set(Calendar.MONTH, 2);
//		cal2.set(Calendar.DATE, 12);
		cal2.set(Calendar.HOUR, 23);
		cal2.set(Calendar.MINUTE, 30);
		cal2.set(Calendar.SECOND, 59);
		Date date2 = cal2.getTime();
		
		//Affichez l�instance ainsi cr��e au format suivant : ann�e/mois/jour heure:minute:seconde
		formatage = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(formatage.format(date2));

		
		//Utilisez la classe java.util.Calendar pour cr�er une Date contenant la date/heure syst�me et affichez la au format suivant : jj-mm-aaaa hh:mm:ss
		Calendar cal3 = Calendar.getInstance();
		Date date3 = cal3.getTime();
		formatage = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		System.out.println(formatage.format(date3));
		

	}

}
