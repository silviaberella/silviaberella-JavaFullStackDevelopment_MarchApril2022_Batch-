package myOtherPackage;

import mypackage.MyBaseClass;

class OtherPackageDerivedClass extends MyBaseClass{
	public void OtherPackageDerivedClass(){
		//OtherPackageDerivedClass opdc = new OtherPackageDerivedClass();
		//opdc.a = 5;
		////opdc.b = 15;
		//opdc.c = 20;
		////opdc.d = 25;
		a = 5;
		//b = 10;
		c = 15;
		//d = 20;
	}
}

class OtherPackageOtherClass{
	public void OtherPackageOtherClass(){
		MyBaseClass mb = new MyBaseClass();
		mb.a = 5;
		//mb.b = 15;
		//mb.c = 20;
		//mb.d = 25;		
	}
}

public class MyClass {

}
