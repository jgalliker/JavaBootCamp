import java.util.Scanner;

public class Validator
{
	public static double getDouble(Scanner sc, String prompt)
	{
		double d = 0;
		boolean isValid = false;

		while (isValid == false)
		{
			System.out.println(prompt);
			if (sc.hasNextDouble())
			{
				d = sc.nextDouble();
				isValid = true;
			} else
			{
				System.out.println("Please enter valid decimal value");
			}
			sc.nextLine();
		}
		return d;
	}

	public static double getUsersDoubleInput(Scanner sc, String prompt, double min,
			double max)
	{
		double d = 0;
		boolean isValid = false;

		while (isValid == false)
		{
			d = getDouble(sc, prompt);
			if (d <= min)
				System.out.println("Please enter value greater than " + min
						+ ".");
			else if (d >= max)
				System.out.println("Please enter value less than " + max + ".");
			else
				isValid = true;
		}
		return d;
	}

	public static String getString(Scanner sc, String prompt)
	{
		System.out.print(prompt);
		String s = sc.next();
		return s;
	
	}
}