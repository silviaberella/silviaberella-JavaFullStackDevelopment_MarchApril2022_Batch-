package mypackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) throws IOException 
	{
		//file must exist, otherwise error
		File f = new File("C:\\Trainings\\scores.txt");
		FileReader fr = new FileReader(f);
		//The cgaracter will be read as ascii int value
		int i = fr.read();
		
		//if read value is -1 then file cursor is at the end
		while(i!= -1)
			{
			//as ascii value of character will be returned this ascii value needs to be converted to character in order to be able to print out the character and not the ascii value of the character
			System.out.print((char)i);
				i = fr.read();
			}
		fr.close();
	}
}
