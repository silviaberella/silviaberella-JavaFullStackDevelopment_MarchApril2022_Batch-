package mypackage;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Employee emp = new Employee();
		//Employee emp = new Employee(101, "Silvia", 2000);
		//emp.readData();
		//emp.printData();
		
		//Product p = new Product();
		Product p1 = new Product(100, "book", 50);
		//p1.readProduct();
		p1.writeProduct();
		Product p2 = new Product();
		p2.readProduct();
		p2.writeProduct();
	}

}
