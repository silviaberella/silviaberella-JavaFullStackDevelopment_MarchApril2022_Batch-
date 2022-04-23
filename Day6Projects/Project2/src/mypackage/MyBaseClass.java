package mypackage;
public class MyBaseClass{
	
	public int a;
	private int b;
	protected int c;
	int d;
	
	public void MyBaseClass() {
		a = 5;
		b = 10;
		c = 15;
		d = 20;
	}
}
class MyDerivedClass extends MyBaseClass{
	public void MyDerivedClass() {
		a = 5;
		//b = 10;
		c = 15;
		d = 20;
	}
}
class MyOtherClass{
	public void MyOtherClass() {
		MyBaseClass mb = new MyBaseClass();
		mb.a = 5;
		//mb.b = 15;
		mb.c = 20;
		mb.d = 25;
	}
}
