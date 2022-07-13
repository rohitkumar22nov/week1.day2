package assignments.mandatory.week1.day2;

import java.util.Arrays;

public class FindIntersectionArray {

	public static void main(String[] args) {
		
		/*
		 * Find Intersection between two Arrays
		 * Step-1 Sort both the Array
		 * Step-2 Run first Array in a for loop
		 * Step-3 Run second Array inside the first loop and compare each value on same index until end to find common values
		 * 
		 */

		int a[] = {1,2,3,6,8,9};
		int b[] = {4,7,2,7,4,5, 10, 3, 4,9};
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		for(int i=0; i<a.length; i++) {
			
			for(int j=0; j<b.length; j++) {
				
				if(a[i]==b[j]) {
					System.out.println("array a & b intersection values are : " + a[i]);
					//System.out.println("array b: " + b[j]);
				}
				
			}
		}
		
		
		
	}

}
