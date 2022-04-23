package mypackage;

import java.util.ArrayList;

public class MyClass {

	public static void main(String[] args) {
		/*
		//int[] data = new int[3];
		int[] data = new int[4];
		data[0] = 99;
		data[1] = 88;
		data[2] = 75;
		//data[4] = 80;
		data[4] = 80;
	}
	*/
		
		
		/*ArrayList obj = new ArrayList();
		obj.add(99);
		obj.add(88);
		obj.add(75);
		obj.add(80);*/
		
		/*
		 * Object p = 10;
		 */
		/*Object q = 20;
		z = (int) p + (int)q;*/
		
		//Boxing
		/*int a = 5; 
		Object p = a;
		System.out.println(a); //quicker
		System.out.println(p);*/
		
		//Unboxing
		/*Object p = 5;
		int a = (int) p; 
		System.out.println(a);//quicker
		System.out.println(p);*/
		
		//ArrayList data = new ArrayList();
		ArrayList<Integer> data = new ArrayList<Integer>();
		data.add(99);
		data.add(88);
		data.add(75);
		data.add(80);
		//data.add("Hello");
		data.add(90);
		
		//insert at index 2 additional number and moves all following elements 1 position, costly operation, better to use linked list
		//arrayList better for searching than for adding operations
		//data.add(2,35);
		
		int sum = 0;
		//for(Object d:data)
		for(int d:data)
		{
			//sum = sum + (int)d;
			sum = sum + d;
		}
		
		
	}
}
