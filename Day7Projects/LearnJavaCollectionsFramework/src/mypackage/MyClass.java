package mypackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;

public class MyClass {

	public static void main(String[] args) {
		
		//In general linkedlist is better when list will be manipulated in  the middle of the list; in case of just adding at the end or printing array list is faster
		// This has been tried in different examples in the following
		
		//ArrayList<Integer> data = new ArrayList<Integer>();
		/*LinkedList<Integer> data = new LinkedList<Integer>();
		data.add(55);
		data.add(82);
		data.add(74);
		data.add(65);
		data.add(2);
		data.add(74);
		System.out.println(data.get(1));
		data.add(1,77);
		System.out.println(data.get(1));
		//data.clear();
		System.out.println(data.get(1));
		System.out.println(data.contains(99));
		
		//gives first occurence of 74
		System.out.println(data.indexOf(74));
		System.out.println(data.lastIndexOf(74));
		data.remove(2);
		for (var d:data)
			System.out.println("Liste nach remove: "+d);
		//data.remove();
		
		// in case of String you can remove not only via index, but also via the value/contengt itself, this does not work for integer
		ArrayList<String> dataLetters = new ArrayList<String>();
		dataLetters.add("Silvia");
		dataLetters.add("benni");
		dataLetters.add("Wobo");
		dataLetters.add("henning");
		dataLetters.remove("benni");
		
		var result = data.toArray();
		//for list I need to take getIndex, for arrays I need to take the 2nd one below
		System.out.println(data.get(1));
		System.out.println(result[1]);
		*/
		//ArrayList<Integer> data = new ArrayList<Integer>();
		//LinkedList<Integer> data = new LinkedList<Integer>();
		//HashSet<Integer> data = new HashSet<Integer>();
		//TreeSet<Integer> data = new TreeSet<Integer>();
		//data.add(55);
		//data.add(82);
		//data.add(74);
		//data.add(55);
		//data.add(2);
		//data.add(74);
		//for (var d:data)
			
			//for ArrayList and LinkedList all doublicate values will be printed, not sorted;  in HashSet no duplicates will be printed, in any order, not sorted
			//I TreeSet no duplicates and stores it in sorted order, ascending order
		//	System.out.println(d);
		
		//	//Not sorted by key, no list like above, but HashMap
		//HashMap<String, Integer> marks = new HashMap<String, Integer>();
		
		//Sorted by key
		TreeMap<String, Integer> marks = new TreeMap<String, Integer>();
		marks.put("Silvia",1);
		marks.put("WoBo",2);
		marks.put("Benni",3);
		marks.put("John",4);
		marks.put("John",5);
		marks.put("John",6);
		System.out.println(marks.get("Benni"));
		//keys must be unqiue, if 2 times JOhn, the last one will be printed only
		System.out.println(marks.get("John"));
		System.out.println(marks.size());
		
		
		var Subjects = marks.keySet();
		for (var s:Subjects)
			System.out.println(s);
		
		
	}

}
