import java.util.Scanner;

public class GradeConvert {

	public static void main(String[] args) {
		System.out
				.println("Please enter integer test scores that ranges from 0 to 100.");
		System.out.println();

		// create a Scanner object and choice variable
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			// get number grade from user
			System.out.print("Enter a numerical grade:  ");
			int numberScore = sc.nextInt();

			// assign letter grade from integer value
			String letterGrade = "A";
			if (numberScore >= 88)
				letterGrade = "A";
			else if (numberScore >= 80)
				letterGrade = "B";
			else if (numberScore >= 67)
				letterGrade = "C";
			else if (numberScore >= 60)
				letterGrade = "D";
			else
				letterGrade = "F";
			// display data to the console
			String message = "Number score:  " + numberScore + "\n"
					+ "Letter grade:  " + letterGrade + "\n";
			System.out.println(message);

			// See if the user wants to continue
			System.out.print("Continue? y/n:  ");
			System.out.println();
			choice = sc.next();

		}
	}
}
