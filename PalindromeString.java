package assignments.mandatory.week1.day2;

public class PalindromeString {

	public static void main(String[] args) {

		/*
		 * Check if the given String is palindrome
		 * Step-1 Convert the String to char array
		 * Step-2 Loop the char array in reverse order
		 * Step-3 Convert the char array to String
		 * Step4- Compare both , original String and new reversed char array String
		 */
		
		String text = "madamu";
		
		String reverse = "";
		
		for(int i=text.length()-1; i>=0; i--) {
			
		// System.out.println(text.charAt(i));
		 
	    reverse = reverse + text.charAt(i);
		}
	    
	    if(text.equalsIgnoreCase(reverse)) {
	    	System.out.println("Palindrome");
	    }
	    else System.out.println("It is not a palindrome");
	    	 
		
		
		System.out.print(reverse);
		
		
		
	}
}
