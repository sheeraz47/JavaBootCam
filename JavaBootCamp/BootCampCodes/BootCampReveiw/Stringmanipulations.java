package BootCampReveiw;

public class Stringmanipulations {

	public static void main(String[] args) {
		String str ="CYBERTEK";
			str = str.toLowerCase();
			
			str = str.toUpperCase();
			
			System.out.println(str);
			
		StringBuffer sb = new StringBuffer("Cybertek");	
			sb.append(" School");
			
			System.out.println( sb.reverse() );
		
	}
}
