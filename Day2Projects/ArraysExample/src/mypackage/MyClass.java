package mypackage;

public class MyClass {

	public static void main(String[] args) {
		// Variable declaration
		// int[] data = new int[5];
		int[] data = new int[]{10,20,30,25,40};
		// for loop printing array values based on index
		for (int i=0;i<data.length;i++)
			System.out.println(data[i]);
		// for each loop prins values stored in array, not considering the index
		
		// by declaration by using var variable needs to be initialized, so that data type can be determined by assigned values and their datatype
		for (var d:data)
			System.out.println(d);
		
		
		
		// biggest number
		int[] newdata = new int[] {12, 75, 45, 99, 32};
		int big = data[0];
		for (var d:newdata)
		{
			if (d>big)
				big = d;
		}
		System.out.println("Biggest number: "+big);
	}
}