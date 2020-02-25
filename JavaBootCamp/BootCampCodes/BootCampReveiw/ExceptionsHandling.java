package BootCampReveiw;

public class ExceptionsHandling {
	
	public static void main(String[] args) {
		try {
			System.out.println(new int[] {1,2,3} [100]  );
		} catch(Exception e) {
			System.out.println("Index out of bound");
		} finally {
			System.out.println("Finally block");
		}
		
	try {	
		Thread.sleep(3000);
	}catch(Exception e) {
		
	}
		
	System.out.println("Test completed");
		
	// method1();
	
	RuntimeException re = new RuntimeException();
	
	//throw re;
		
	}
	
	
	
	public static void method1() throws Exception{
		Thread.sleep(2000);
	}
	
	
	

}
