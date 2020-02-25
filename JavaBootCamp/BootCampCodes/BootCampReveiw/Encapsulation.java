package BootCampReveiw;

class Data{
	private String username ="123";
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
}


public class Encapsulation {

	public static void main(String[] args) {
		Data obj1= new Data();
		
		obj1.setUsername("124");
		
		//System.out.println(obj1.username); // private is only visible within the class
		System.out.println(obj1.getUsername());
		
	}
	
	
}
