import java.util.Scanner;

public class FactorialApp
{
	public static void main(String[] args)
	{
		int userNo; 
		int i;
		long factCalc = 1;

		// welcome
		System.out.println("Welcome to the Factorial Calculator");

		// scanner
		Scanner sc = new Scanner(System.in);

		String choice = "y";
		while (choice.equalsIgnoreCase("y"))
		{
			// get user input
			factCalc = 1;
			System.out
					.println("Enter an integer that is greater than 0 but less than 10");
			userNo = sc.nextInt();

			{
				for (i = 1; i <= userNo; i++)
				{
					factCalc *= i;
				}
				System.out.println("Factorial of " + userNo + " is = " + factCalc);

			}
			System.out.println();
			System.out.println("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
		}
		sc.close();
	}
}


