package solution;
import java.util.Scanner;

public class DiceRollerApp
{
	public static void main(String args[])
	{
		// display a welcome message
		System.out.println("Welcome to the Paradise Roller application");
		System.out.println();

		// create the Scanner object
		Scanner sc = new Scanner(System.in);

		String choice = Validator.getRequiredString(sc,
				"Roll the dice? (y/n): ");
		System.out.println();

		// continue until choice isn't equal to "y" or "Y"
		int counter = 1;
		while (choice.equalsIgnoreCase("y"))
		{
			PairOfDice dice = new PairOfDice(6);
			dice.roll();

			System.out.println("Roll " + counter + ": ");
			System.out.println(dice.getValue1());
			System.out.println(dice.getValue2());

			if (dice.getSum() == 2)
			{
				System.out.println("Snake eyes!");
			} else if (dice.getSum() == 7)
			{
				System.out.println("Craps!");
			} else if (dice.getSum() == 12)
			{
				System.out.println("Box cars!");
			}

			System.out.println();

			choice = Validator.getRequiredString(sc, "Roll again? (y/n): ");
			System.out.println();

			counter++;
		}
	}
}