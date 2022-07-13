package assignments.mandatory.week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {

		/*
		 * Step1- Convert String to char array
		 * Step2- Loop it with 'for-loop' with array.length
		 * Step3- while looping it, keep getting index value of each char
		 * Step4- Keep taking mod % of each index to identify if the index is odd keep turning it to uppercase.
		 * Step5- Additional Step with forLoop 'j' to bring the index to show case the odd character to ODD.
		 */

		String name = "testleaf";
		char nameArray [] = name.toCharArray();
		int StringArrayLength = name.length();

		for(int i=0; i< nameArray.length; i++) {
		
			int indexValue = i; 

			if(indexValue%2==0) {
				System.out.print(nameArray[i]);
			}
			if(indexValue%2>0) {

				System.out.print(name.toUpperCase().charAt(indexValue));
			}
		}
		
		System.out.println();
		for(int j=0; j<StringArrayLength; j++) {
			System.out.print(j);
		}
	}
}
