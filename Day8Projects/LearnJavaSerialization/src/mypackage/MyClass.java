package mypackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Formatter.BigDecimalLayoutForm;

class Employee implements Serializable{
	int id;
	String name;
	int salary;
	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
}


public class MyClass {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//Serialization object
		Employee emp = new Employee(101, "Silvia", 2000);
		FileOutputStream fout = new FileOutputStream("C:\\Trainings\\Serialization\\Employees.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(emp);
		out.close();
		fout.close();
		
		//Deserialization
		FileInputStream fis = new FileInputStream("C:\\Trainings\\Serialization\\Employees.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee emp1 = (Employee)ois.readObject();
		System.out.println("Id = "+emp1.id);
		System.out.println("Name = "+emp1.name);
		System.out.println("Salary = "+emp1.salary);
		
		ois.close();
		fis.close();
	}

}
