package mypackage;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int input;
		String result;
		Scanner obj = new Scanner(System.in);
		int sum = 0;
		
		System.out.println("Please enter any number: ");
		input = obj.nextInt();
		
		// Find sum od n natural numbers
		
		for (int i=1; i<=input;i++)
			sum += i;
		
		System.out.println("Sum: "+sum);
	}

}
