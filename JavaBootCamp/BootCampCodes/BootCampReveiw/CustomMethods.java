package BootCampReveiw;

public class CustomMethods {
	
	public static void main(String[] args) {
		revStr("Muhtar");
		revStr2("Muhtar");
	}

	
	public static void revStr(String str) {
		System.out.println( new StringBuilder(str).reverse()   );
	}
	
	public static void revStr2(String str) {
		for(int i = str.length()-1;  i >= 0; i-- ) {
			System.out.print(""+str.charAt(i));
		}
	}
	
	
}
