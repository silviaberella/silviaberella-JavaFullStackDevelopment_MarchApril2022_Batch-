package mypackage;

class Node{
	public int data;
	public Node next;
}

class SinglyLinkedList{
	private Node head;
	//Node head = new Node();
	public boolean isEmpty() {
		return (head == null);
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = head;
		head = newNode;
	}
	public void printLinkedList() {
		Node current = head;
		while (current !=null){
		System.out.println(current.data);	
		current = current.next;
		}
	}
	public void insertLast (int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if (head == null)
		{
			head = newNode;
			//newNode.next = head;
			//head = newNode;
		}
		else
		{
			Node current = head;
			while (current.next !=null)
			{
				current = current.next;
			}
			current.next = newNode;
		}
	}
	
	public void deleteFirst() {
		head = head.next;
	}
	
	public void deleteLast() 
	{
		Node current = head;
		Node previous = null;
		if (head != null) {

			while (current.next !=null)
			{
				previous = current;
				current = current.next;
			}
		previous.next = null;
			
			}
	
	
	}
	
	public int size() {
		int count = 0;
		Node current = head;
		while (current.next !=null)
		{
			count ++;
			current = current.next;
		}
		return count;
		
	}
	
	
}


public class MyClass {

	public static void main(String[] args) {
		SinglyLinkedList data = new SinglyLinkedList();
		data.insertFirst(99);
		data.insertFirst(75);
		data.insertFirst(45);
		//data.printLinkedList();
		data.insertLast(200);
		data.insertLast(500);
		data.printLinkedList();
		data.deleteFirst();
		data.printLinkedList();
		System.out.println(data.size());
		data.deleteLast();
		System.out.println(data.size());
		data.printLinkedList();

	}

}
