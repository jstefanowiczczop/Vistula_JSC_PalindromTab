package palindrom;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromTest {

	@Test
	public void testSprawdzPalindrom() {
		Palindrom pali = new Palindrom();
		String a = "kajak";
		boolean oczekiwany = pali.sprawdzPalindrom(a);
		assertEquals(oczekiwany, true);

	}

	public void testSprawdzPalindromNegative() {
		Palindrom pali = new Palindrom();
		String a = "buty";
		boolean oczekiwany = pali.sprawdzPalindrom(a);
		assertEquals(oczekiwany, false);

	}

	@Test
	public void testSprawdzPalindromBigLetter() {
		Palindrom pali = new Palindrom();
		String a = "£ama³";
		boolean oczekiwany = pali.sprawdzPalindrom(a);
		assertEquals(oczekiwany, true);
	}

	@Test
	public void testSprawdzPalindromNull() {
		Palindrom pali = new Palindrom();
		String a = " ";
		boolean oczekiwany = pali.sprawdzPalindrom(a);
		assertEquals(oczekiwany, true);

	}

	@Test
	public void testSprawdzPalindromTabulator() {
		Palindrom pali = new Palindrom();
		String a = "	   ";
		boolean oczekiwany = pali.sprawdzPalindrom(a);
		assertEquals(oczekiwany, false);

	}
}