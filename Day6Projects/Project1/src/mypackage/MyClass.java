package mypackage;

abstract class Salary{
	public int getHRA(int basic) {
		return 40*basic/100;
	}
	public int getPF(int basic) {
		return 12*basic/100;
	}	
	
	public abstract int getCA();
	public abstract int getSA();

}

class Cognizant extends Salary{

	public int getCA() {
		return 6000;
	}
	public int getSA() {
		return 12000;
	}
	
}

class Accenture extends Salary{

	@Override
	public int getCA() {
		return 8000;
	}
	
	
	@Override
	public int getSA() {
		// TODO Auto-generated method stub
		return 11000;
	}
	
}

class Microsoft extends Salary{

	@Override
	public int getCA() {
		return 12000;
	}
	
	@Override
	public int getSA() {
		return 21000;
	}
	
	public int getCovidAssistance() {
		return 1000;
	}
	
}

class Google extends Salary{

	@Override
	public int getCA() {
		return 14000;
	}
	
	@Override
	public int getSA() {
		return 18000;
	}
	
}

class Deloitte extends Salary{

	@Override
	public int getCA() {
		// TODO Auto-generated method stub
		return 9000;
	}

	@Override
	public int getSA() {
		// TODO Auto-generated method stub
		return 13000;
	}
}


public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Salary s;
		//Microsoft m = new Microsoft();
		//System.out.println(m.getSA());
		s = new Microsoft();
		System.out.println(s.getSA());
		
		s = new Google();
		System.out.println(s.getSA());
		
		Microsoft m = new Microsoft();
		System.out.println(m.getCovidAssistance());
		
		//Google g = new Google();
		//System.out.println(g.getSA());

	}

}
