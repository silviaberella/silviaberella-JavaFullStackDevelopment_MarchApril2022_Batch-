package mypackage;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) 
	{
		// Variable declaration
		int input=0;
		int counter = 0;
		Scanner obj = new Scanner(System.in);
		input = obj.nextInt();

		for(int i = 1; i<=input;i++)
		{
			if (input%i == 0)
				counter++;
		}	

		if (counter ==2)
			System.out.println("Prime");

	}

}