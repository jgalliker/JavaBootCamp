package groupProject;

import java.util.Scanner;

public class EncryptionApp {

	public static void main(String[] args) {
		String passcode = "test";
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Encryption App!");
		System.out.println();
		System.out.println("Enter a string of text:   ");
		passcode = sc.nextLine();

		System.out.println("Encrypted word: " + BitShifter.decrypt(passcode));
		System.out.println("Decrypted word: " + passcode);

		sc.close();

	}

}
