package mypackage;

/*interface IFirst{
}

interface ISecond{
}

class MyDerivedClass implements IFirst, ISecond{
}
*/

interface IShape{
	
	default float getPi() {
		return (float) (22.0/7.0);
	}
}


public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
