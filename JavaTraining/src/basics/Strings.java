package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "ring";
		bookTitle = "The Lord of the rings";

		
		if (bookTitle.contains(wordChoice)) {
			System.out.println("The book contains the word " + wordChoice);			
		}
		String firstname = "Tim";
		String lastname = "Short";
		String SSN = "984162168";
		
		//Print the initials plus last 4 digits of the SSN
		System.out.print(firstname.substring(0,1));
		System.out.print(lastname.substring(0, 1));
		System.out.print(SSN.substring(5));
	}

}
