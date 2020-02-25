package BootCampReveiw;

public class Constructors {
	
	public Constructors() {
		System.out.println("Default constructor");
	}

	public Constructors(int a) {
		// Constructors();
		this();
		System.out.println("Constructor with int argument");
	}
	
	int a =100;
	
	public static void main(String[] args) {
		
		Constructors obj = new Constructors(100);
		
		//System.out.println(this.a);
	}
	
	public void method2() {
		System.out.println("method 2");
	}
	
	public void method1() {
		System.out.println(this.a);
		this.method2();
	}
	
	
}
