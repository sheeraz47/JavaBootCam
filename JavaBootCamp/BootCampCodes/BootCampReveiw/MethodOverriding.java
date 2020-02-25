package BootCampReveiw;

final class Z extends test{
	
	
} 

 class test {
	
	public void method1() {
		System.out.println("method1 from super class");
	}
	
	
}


public class MethodOverriding extends test{
	
	@Override
	public void method1() {
		System.out.println("method1 from sub class");
	}
	
//	final int a;
//	final static int b;
	
	public static void main(String[] args) {
		MethodOverriding obj = new MethodOverriding();
		obj.method1();
		
		final String gender ="Female";
		//gender ="Male";
		
		final int a;
		
		//System.out.println(a);
		
		
	}

}
