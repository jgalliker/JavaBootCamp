import java.util.Scanner;

public class SquareCubeApp
{
	public static void main(String[] args)
	{
		// welcome
		System.out.println("Learn your squares and cubes");

		// scanner
		Scanner sc = new Scanner(System.in);

		String choice = "y";
		while (choice.equalsIgnoreCase("y"))
		{
			// get user input
			System.out.println("Enter an integer (not too large, please!)");
			int userNo = sc.nextInt();

			System.out.println("Number" + "   " + "Squared" + "   " + "Cubed");
			System.out.println("======" + "   " + "=======" + "   " + "=====");

			for (int i = 1; i <= userNo; i++)
			{
				int square = (int) Math.pow(i, 2);
				int cube = (int) Math.pow(i, 3);

				String message = (" " + i + "       " + square + "        "+ cube);

				System.out.println(message);
			}
			System.out.println();
			System.out.println("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
		}
		sc.close();
	}
}
