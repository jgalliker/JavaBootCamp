package wIP12;
import java.util.Scanner;

public class OOValidator {
	
	protected Scanner sc;
	
	public OOValidator(Scanner sc) {
		this.sc = sc;
	}

	public int getInt(String prompt) {
		while (true) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				return sc.nextInt();
			}
			System.out.println("Error! Invalid integer value. Try again.");
			sc.nextLine();
		}
	}
		public int getIntWithinRange(String prompt, int min, int max) {
			int input = 0;
			prompt = prompt + min + "and" + max;
			while (true){
				input = getInt(prompt);
				if (input < min)
					System.out.println("Error! Number must be greater than " + min
							+ ".");
				else if (input > max)
					System.out.println("Error! Number must be less than " + max
							+ ".");
				else return input;
				}
		}
			
		public double getDouble(String prompt) {
			while (true) {
				System.out.print(prompt);
				if (sc.hasNextDouble()) {
					return sc.nextDouble();
				}
				System.out.println("Error! Invalid double value. Try again.");
				sc.nextLine();
			}
		}
			public double getDoubleWithinRange(String prompt, double min, double max) {
				prompt = prompt + min + "and" + max;
				double input = 0.0;
				while (true){
					input = getDouble(prompt);
					if (input < min)
						System.out.println("Error! Number must be greater than " + min
								+ ".");
					else if (input > max)
						System.out.println("Error! Number must be less than " + max
								+ ".");
					else return input;
					}
			}
		
}
