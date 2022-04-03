package mypackage;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		// Variable declaration
		int input;
		String result;
		Scanner obj = new Scanner(System.in);
		System.out.println("Please enter any er: ");
		input = obj.nextInt();
		
		/*
		 if (input%2 == 0)
			result = "Even Number";
		else
			result = "Odd Number"; */
		
		result = (input%2 == 0) ? "Even Number" : "Odd Number";
		
		System.out.println("Result: "+result);
			
	}

}
