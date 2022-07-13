package assignments.mandatory.week1.day2;

public class RemoveDupelicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "We learn java basics as part of java sessions in java week1";
		int count=0;
		String newString = "";

		String text1 [] = text.split(" ");
		
		for(int i=0; i<text1.length; i++) {

			for(int j=i+1; j<text1.length; j++) {

				if(text1[i].equals(text1[j])) {

					text1[j]= "remove";
				}
				
				
			}
		}
		
		for(String str: text1) {
		
			if (str != "remove") {
				newString = newString + str + " ";
			}
		}
		
		System.out.print(newString);

	}
}