package mypackage;

import java.io.BufferedReader;
import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MyClass {

		public static void main(String[] args) throws IOException 
		{
			String subject;
			Scanner obj = new Scanner(System.in);
			System.out.println("Enter subject: ");
			subject = obj.nextLine();
			boolean isFound = false;
			
			//if file does not exist it will create one and write into it
			File f = new File("C:\\Trainings\\scores.txt");
			
			//read one character
			FileReader fr = new FileReader(f);
			
			//read one line and not only 1 character and buffer characters of line
			BufferedReader br = new BufferedReader(fr);
			//int i = fr.read();
			String line = br.readLine();
			while(line != null)
				{
				var data = line.split(",");
				
				//equals is important because == comparison does not work
				if (data[0].equals(subject))
				{				
				//System.out.print(line);
					//print value of current index of data[0]
					System.out.print(data[1]);
					isFound = true;
					//i = fr.read();
				break;
				}
				//in case of not successful comparison above read next line in file
				line = br.readLine();
				}
			br.close();
			//subject has been found
			if (isFound ==false)
				System.out.println("Not found!");
		}

	}


