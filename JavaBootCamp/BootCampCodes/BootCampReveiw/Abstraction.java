package BootCampReveiw;

abstract  class car{
	
	public abstract void start();
	
}

class Toyota extends car{
	
	public void start() {
		System.out.println("With Keys");
	}
}

class BMW extends car{
	public void start() {
		System.out.println("With push button");
	}
}


public class Abstraction {
	
	public static void main(String[] args) {
		car  car1 = new Toyota();
		car1.start();
		
	}
	
	
	
	

}
