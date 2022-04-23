package mypackage;

import java.io.File;
//import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyClass {

	public static void main(String[] args) throws IOException {
		
			File f = new File("C:\\Trainings\\scores2.txt");
			//If new Strings should be appended and not overwrite file content, true needs to be set as 2nd parameter
			FileWriter fw = new FileWriter(f, true);
			
			// n= new line
			fw.write("Silvia\n");
			fw.write("Berella\n");
			fw.close();
			System.out.println("Success");
		}
	

}
