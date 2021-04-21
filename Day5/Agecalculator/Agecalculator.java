package com.exception.assignment3;

import java.text.ParseException;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;


public class AgeCalculator {
	public static int calculateAge(String dob) {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		int year = 0;
		try {
      LocalDate today = LocalDate.now();
			LocalDate ld = LocalDate.parse(dob, format);
			year = Period.between(ld, today).getYears();
		} catch (Exception e) {
			System.out.println("format should be like this dd/MM/yyyy ");
		}
		return year;

	}
}
