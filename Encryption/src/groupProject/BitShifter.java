package groupProject;

public class BitShifter {

	public static String encrypt(String key) {
		String result = "";
		int inputLength = key.length();
		char ch;
		for (int i = 0; i < inputLength; i++) {
			ch = key.charAt(i);
			ch += 4;
			result += ch;
		}
		return result;
	}

	public static String decrypt(String key) {
		String result = "";
		int inputLength = key.length();
		char ch;
		for (int i = 0; i < inputLength; i++) {
			ch = key.charAt(i);
			ch -= 4;
			result += ch;
		}
		return result;

	}
}