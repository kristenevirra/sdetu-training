package basics;

public class Strings {
	
	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "The Lord of the rings";
		
		
		if (bookTitle.contains(wordChoice)){
			System.out.println("The book contains the world " + wordChoice);
				
	}
		String browser = "Chrome";
		//(browser == "chrome")
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is chrome");
		}
		String firstName = "Tim";
		String lastName = "Short";
		String SSN = "984162168";
		
		
		System.out.println("There are " + SSN.length() + "diits in your SSN");
		
		//Print the initials plus last 4 digits od SSN
		System.out.println(firstName.substring(0,1));
		System.out.println(lastName.substring(0,3));
		System.out.println(SSN.substring(5));
		
	}
}
