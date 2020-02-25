package BootCampReveiw;

public class methodOverloading {

	public static void main(String[] args) {
		add(10, 20);
		
		double a = add(10.5, 20.5);
		System.out.println(a);
		
	}
	
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public static double add(double a, double b) {
		return a+b;
	}
	
}
