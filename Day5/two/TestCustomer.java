package assigment1;
import java.util.*;

import java.util.Scanner;

public class TestCustomer {

	public static void main(String[] args) throws InvalidInputException {
		Scanner sc=new Scanner(System.in);
		TestCustomer cust=null;
		System.out.println("enter customer no");
		String custNo=sc.nextLine();
		System.out.println("enter customer name");
		String custName=sc.nextLine();
		System.out.println("enter customer category");
		String custCategory=sc.nextLine();
		cust=new TestCustomer(custNo, custName, custCategory);
	}

}
