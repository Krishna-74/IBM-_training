package assignment;	 

import java.text.ParseException;
import java.util.Scanner;

public class TestAgeCalculatetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter DOB (dd/mm/yyyy):");
		String dob = sc.next();
		int age = AgeCalculator.calculateAge(dob);
		if (age != 0)
			System.out.println(age);
	}
}
