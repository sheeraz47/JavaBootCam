package BootCampReveiw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DataStructure_Collection {
	
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList();
				list.addAll(Arrays.asList(1,1,1,2,2,2,3,3,3,4,4,4));
				
				System.out.println(list);
				System.out.println(list.get(2));
				
	System.out.println("======================================");
		Set<Integer> set = new LinkedHashSet<>();
				set.addAll(Arrays.asList(1,1,1,2,2,2,3,3,3,4,4,4,4));
				
		System.out.println(set);
		//System.out.println(set.get(1));
			
		Iterator<Integer> it = set.iterator();
		
		while(it.hasNext()) {
			
			if(it.next() == 3) {
				it.remove();
			}
			
		}
	
	System.out.println(set);
	
	
	
	
	
		
	}

}
