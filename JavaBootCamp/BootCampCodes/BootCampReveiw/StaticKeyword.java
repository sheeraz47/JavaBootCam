package BootCampReveiw;


class A{
	int a = 1000;
	static int b = 2000;
	
	static class B{
		public static void main(String[] args) {
			//System.out.println(a);
			System.out.println(b);
		}
	}
	

}



public class StaticKeyword extends A.B{

	static int a = 10;
		int b = 100;
	public static void main(String[] args) {
		
		StaticKeyword obj1 = new StaticKeyword();
					obj1.a=20;
					obj1.b = 1000;
					
		StaticKeyword obj2 = new StaticKeyword();
					obj2.a= 30;
		
		System.out.println(obj1.a); // 30
		System.out.println(obj2.a); //30
		
		System.out.println(obj1.b); //1000
		System.out.println(obj2.b);  // 100
		
		//System.out.println(b);
		System.out.println(a);
		
	}
	
	
	static {
		System.out.println("static block");
	}
	
}
