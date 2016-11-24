package palindrom;

public class Palindrom {
	// two variables for storing once character

	private static char l = 0;// the variable for storing the characters that are
								// taken from the beginning of word
	private static char p = 0;// the variable for storing the characters that are
								// taken from the end of word
	// Ala, Kajak, £ama³, Zaraz,aiBOfoBia
	// String s = "£ama£";

	public boolean sprawdzPalindrom(String s) {
		char pTab[] = new char[2];// the array to store one letter String
		char lTab[] = new char[2];
		String pStr = "";
		String lStr = "";

		for (int i = 0; i <= s.length(); i++) {

			p = s.charAt(i); // assign the beginning letter to p variable
			l = s.charAt(s.length() - i - 1); // Assign the ending letter to l
												// variable

			pTab[0] = p; // Assign variable p from beginning of the string
			lTab[0] = l;// Assign variable l from the ending of the string
			pTab[1] = 0;
			lTab[1] = 0;

			pStr = new String(pTab);
			lStr = new String(lTab);
			// Compares this String to another String, ignoring case
			// considerations.
			// Compares pStr and LStr and returns true when they are the same or false 
			if (!(pStr.equalsIgnoreCase(lStr))) {

				return false;

			} else {
				i = s.length();

				return true;
			}

		}
		return false;

	}
}
