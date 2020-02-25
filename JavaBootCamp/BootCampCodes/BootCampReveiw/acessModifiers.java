package BootCampReveiw;

import AccessModifiersTest.TestData;

public class acessModifiers extends TestData{
	
	public static void main(String[] args) {
		TestData obj = new TestData();
		System.out.println( obj.publicData);
	//	 System.out.println( obj.protectedData); // not visible outside the package
	
	
		 
		 acessModifiers obj2 = new acessModifiers();
		 System.out.println( obj2.protectedData);  // inherited
		 System.out.println(obj2.publicData);  // inherited
	
	}

}
