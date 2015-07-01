import java.util.Scanner;

public class RandomNumberApp
{
	public static void main(String[] args)
	{
		//variables
		int count = 0;
		int userNumber = 0;
		
		Scanner sc = new Scanner(System.in);

		int randomNumber = (int) (Math.random() * (100) + 1);
		String choice = "y";

		while (choice.equalsIgnoreCase("y"))
		{
			System.out.println(randomNumber);
			boolean higher = (randomNumber - userNumber) > 10
					|| (randomNumber - userNumber) < -10;
			boolean lower = (randomNumber - userNumber) < 10
					|| (randomNumber - userNumber) > -10;

			while (userNumber != randomNumber)
			{
				System.out.println("Guess a number between 1 and 100: ");
				userNumber = sc.nextInt();
				if (higher)
				{
					System.out.println(">10 difference");
				} else if (lower)
				{
					System.out.println("<10 difference");
				}

				System.out.println("Guess another number: ");
				userNumber = sc.nextInt();
			}
			System.out.println("You're a genius!");
			choice = "n";
		}

	}
	// System.out.println("Play again? ('y' or 'n'): ");
	// choice = sc.next();
	// System.out.println("Guess a number between 1 and 100: ");
				// int userNumber = sc.nextInt();
}