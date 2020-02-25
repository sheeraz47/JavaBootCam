package BootCampReveiw;

interface WebDriver{
	
	public void get();
	
}

class ChromeDriver implements WebDriver{
	public void get() {
		System.out.println("Chrome browser is opened");
	}
	
	public void methodC() {
		
	}
}

class FireFoxDriver implements WebDriver{
	
	public void get() {
		System.out.println("Firefox browser is opened");
	}
	
}


public class Polymorphisim {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//driver.methodC();
		
	}
	
	
	
	

}
