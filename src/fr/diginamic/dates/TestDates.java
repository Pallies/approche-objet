package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		SimpleDateFormat formatDate2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date day = new Date();
		System.out.println(day);
		String dayString =formatDate2.format(day);
		System.out.println(dayString);
		
		SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
		String dateDayFR = formatDate.format(day);
		System.out.println(dateDayFR);
		
		@SuppressWarnings("deprecation")
		Date day2016 = new Date(116,4,19,23,59,30);
//		SimpleDateFormat formatDate2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(formatDate2.format(day2016));
		
	}

}
