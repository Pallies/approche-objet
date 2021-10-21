package fr.diginamic.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		SimpleDateFormat formatDate2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date day = new Date();
		System.out.println(day);
		String dayString = formatDate2.format(day);
		System.out.println(dayString);

		SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
		String dateDayFR = formatDate.format(day);
		System.out.println(dateDayFR);

		@SuppressWarnings("deprecation")
		Date day2016 = new Date(116, 4, 19, 23, 59, 30);
//		SimpleDateFormat formatDate2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(formatDate2.format(day2016));

		// object of SimpleDateFormat class
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		// dates to be compare
		Date date1 = null;
		Date date2 = null;
		try {
			date1 = sdf.parse("2020-07-20");
			date2 = sdf.parse("2020-06-18");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// prints dates
		System.out.println("Date 1: " + sdf.format(date1));
		System.out.println("Date 2: " + sdf.format(date2));
		// comparing dates
		if (date1.compareTo(date2) > 0) {
			System.out.println("Date 1 comes after Date 2");
		} else if (date1.compareTo(date2) < 0) {
			System.out.println("Date 1 comes before Date 2");
		} else if (date1.compareTo(date2) == 0) {
			System.out.println("Both dates are equal");
		}
	}

}
