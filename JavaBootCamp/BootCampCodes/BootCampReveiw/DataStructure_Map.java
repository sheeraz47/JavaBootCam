package BootCampReveiw;

import java.util.LinkedHashMap;
import java.util.Map;

public class DataStructure_Map {
	
	public static void main(String[] args) {
		Map<String, Integer> mp = new LinkedHashMap();
			mp.put("A", 100);
			mp.put("C", 200);
			mp.put("D", 300);
			mp.put("C", 400);
			
		System.out.println(mp);
		System.out.println("========================");
		
		for(String eachKey: mp.keySet() ) {
			System.out.println(eachKey);
		}
		
		System.out.println("============================");
		
		for(int eachValue: mp.values()) {
			System.out.println(eachValue);
		}
		
		System.out.println("=============================");
		for(Map.Entry<String, Integer>  each: mp.entrySet() ) {
			System.out.println(each.getKey() +" : "+each.getValue());
		}
		
		System.out.println("================================");
		mp.forEach(  (X, Y) ->  System.out.println( X +" : "+Y  )  );
		
		
		
	}

}
