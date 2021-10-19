package fr.diginamic.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	private final static Locale LOCAL_RU=new Locale("ru","RU");
	private final static Locale[] I18n= {Locale.FRENCH,Locale.FRANCE,Locale.CHINESE,Locale.CHINA,Locale.GERMAN,Locale.GERMANY,Locale.ENGLISH,Locale.US,LOCAL_RU};
	public static void main(String[] args) throws ParseException {

		Calendar cal = Calendar.getInstance();
		cal.set(2016, 4, 19, 23, 59, 30);// définition du time
		Date day2016 = cal.getTime(); // donne le time courant si celui-ci n'est pas défini
		SimpleDateFormat dateYYYY = new SimpleDateFormat("dd/MM/yyyy");
		String afficheDay=String.format("format date format %s",dateYYYY.format(day2016));
		System.out.println(afficheDay);
		
		Date day2 = Calendar.getInstance().getTime(); // donne la date du jour car la date n'a pas été redéfinie
		SimpleDateFormat dateJ = new SimpleDateFormat("yyyy/MMMM/dd HH:mm:ss");
		String afficheDay2=String.format("format de date : %s " ,dateJ.format(day2));
		System.out.println(afficheDay2);

		SimpleDateFormat dateIso;
		for(Locale iso : I18n) {
			dateIso= new SimpleDateFormat("EEEE dd/MMMM/yyyy HH:mm:ss",iso);
			String str = String.format("Date %s sous l'écriture %s",dateIso.format(day2),String.valueOf(iso));
			System.out.println(str);
		}
		
//		Transformation d'un string en Date
		String dateChaine = " 18/09/2021";
		SimpleDateFormat transformDate = new SimpleDateFormat("dd/MM/yyyy");
		Date d=transformDate.parse(dateChaine);
		System.out.println(d);
	}

}
