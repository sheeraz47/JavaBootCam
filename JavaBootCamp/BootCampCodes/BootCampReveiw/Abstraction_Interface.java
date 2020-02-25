package BootCampReveiw;


public interface Abstraction_Interface {
	
	 int a =100;     // public static final
	
	public static void main(String[] args) {  // static method
	//	a = 200;
		System.out.println(a);
	}
	
	/*
	public void method1() { 
		
	}
	*/
	
	public void method2();  // abstract method
	
	public default void mm() {  // default method
		
	}
	
	
}



class class1{
	
	
}

class class2 extends class1 implements Abstraction_Interface{


	public void method2() {
	
		
	}
	
}









