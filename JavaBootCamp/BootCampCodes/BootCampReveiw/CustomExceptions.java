package BootCampReveiw;

import javax.management.RuntimeErrorException;

class BreakTimeException extends RuntimeException{
	public BreakTimeException(String str) {
		super(str);
	}
	
	
}


public class CustomExceptions {

	public static void main(String[] args) {
		BreakTimeException muhtar = new BreakTimeException("It's time for break");
	throw muhtar;
	
	
		//throw new RuntimeException("Runtime exception is found");
		
	}
	
}
