package BootCampReveiw;

import java.util.Arrays;

public class ArraysPractice {

	public static void main(String[] args) {
		
		int[] arr = {999, 88888, 1,2,3};
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		int[] arr2 = {1,2,3, 4};
		int[] arr3 = {1,2,3};
		
		boolean r1 = Arrays.equals(arr2, arr3);
		System.out.println(r1);
		
		
	}
}
