package mypackage;

import java.util.Scanner;

public class Product {
		public int id;
		public String name;
		public int price;
		
public Product() {
		id = 0;
		name = null;
		price = 0;
		}
		
public Product(int id, String name, int price) {
	this.id = id;
	this.name = name;
	this.price = price;	
}
		
public void readProduct() {
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter product id: ");
	id = Integer.parseInt(obj.nextLine());
	System.out.println("Enter product name: ");
	name = obj.nextLine();
	System.out.println("Enter product price: ");
	price = Integer.parseInt(obj.nextLine());
	
}
public void writeProduct() {
	System.out.println("Id: "+id);
	System.out.println("Name: "+name);
	System.out.println("Price: "+price);
}
}
