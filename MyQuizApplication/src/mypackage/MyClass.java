package mypackage;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		
		// variable declarations:
		int start, answer, score = 0;
		
		// Record name of player and welcome player
		System.out.println("Please enter your name: ");
		Scanner obj = new Scanner(System.in);
		System.out.println("Hi "+obj.nextLine());
		System.out.println("Please answer the following questions!");
		System.out.println("Each right answer gives you a score of 10 points!");
		System.out.println("Are you ready to start the quiz (yes=1, no = 0)?");
		start =obj.nextInt();
		
		//Start Quiz
		if (start == 1){
			System.out.println("What ist the capital of UK (1: London 2: New York 3: Rom? ");
			answer =obj.nextInt();
			if (answer == 1) {
				score = score + 10;
			} 
			
			
			System.out.println("What ist the capital of India (1: London 2: Delhi 3: Bangalore ? ");
			answer =obj.nextInt();
			if (answer == 2) {
				score = score + 10;
			}
			
			System.out.println("What ist the capital of Italy (1: London 2: Rom 3: Sevilla ? ");
			answer =obj.nextInt();
			if (answer == 2) {
				score = score + 10;
			}
			
					
			System.out.println("What ist the capital of Germany (1: Bonn 2: Rom 3: Berlin ? ");
			answer =obj.nextInt();
			if (answer == 3) {
				score = score + 10;
			}
			
					
			System.out.println("What ist the capital of Denmark (1: Copenhagen 2: Helsinki 3: Sofia ? ");
			answer =obj.nextInt();
			if (answer == 1) {
				score = score + 10;
			}
			
					
			// Now quiz results (score) will be evaluated:
			if (score >= 45)
			{
				System.out.println("Congratulations! Great job, you have scored "+score+ " points!");
			}
			else if (score >= 30) {
				System.out.println("Congratulation, you have passed the quiz with "+score+ " points!");
			}
			else {
				System.out.println("Sorry, you have not passed the quiz with "+score+ " points!");
				System.out.println("Please try again!");
			}
		
		} //end Quiz
	}

}