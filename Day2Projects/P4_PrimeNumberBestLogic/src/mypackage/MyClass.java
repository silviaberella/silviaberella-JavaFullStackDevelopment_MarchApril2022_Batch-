package mypackage;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) 
	{
		// Variable declaration
		int input=0;
		int counter = 2;
		int i = 0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Please enter any number: ");
		input = obj.nextInt();

		for(i = 2; i<input;i++)
		{
			if (input%i == 0)
				break;
		}	

		if (i==input)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");

	}

}
