package assignments.mandatory.week1.day2;

public class ReverseEvenWords1 {

	public static void main(String[] args) {


		String test = "I am a software tester";
		String testArray [] = test.split(" ");
		
		for(int i=0; i<testArray.length; i++) {
			
			if(i%2 !=0) {
				
				String stringOdd = testArray[i];
				
				for(int j=stringOdd.length()-1; j>=0; j--) {
					System.out.print(stringOdd.charAt(j));
				}
			}
			else {
				System.out.print(testArray[i]);
			}
			
			System.out.print(" ");
		}
	
	
	
	}


}
