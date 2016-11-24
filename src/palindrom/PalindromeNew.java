package palindrom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeNew {

	// Ala, Kajak, £ama³, Zaraz,aiBOfoBia,

	public static void main(String[] args) throws IOException {
		Palindrom w = new Palindrom();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Wpisz wyraz i naciœnij \"Enter\": ");
		String s = br.readLine();

		if (w.sprawdzPalindrom(s) == true) {
			System.out.println("Wyraz " + s + " jest palindromem.");

		} else {

			System.out.println("Wyraz " + s + " nie jest palindromem.");
		}

	}

}
