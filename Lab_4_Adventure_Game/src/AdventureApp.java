import java.util.Scanner;

public class AdventureApp
{
	public static void main(String[] args)
	{
		System.out.println("Welcome! What is your name? (Type your name)");

		Scanner sc = new Scanner(System.in);
		String userName = sc.next();
		System.out.println("Hi " + userName
				+ "! Would you like to play a game?"
				+ (" (Enter 'y' for yes or 'n' for no) "));

		String choice1 = sc.next();

		if (choice1.equalsIgnoreCase("n"))
		{
			System.out.println("Bye " + userName
					+ "! Maybe we can play another time ...");
		} else
		{
			while (choice1.equalsIgnoreCase("y"))
			{
				System.out
						.println("Excellent! You are walking across a field and you "
								+ "encounter a fire-breathing dragon! ");
				System.out.println(userName + "! What are you going to do?");
				System.out
						.println("Enter '1' for face the beast or '2' for run away");

				int meetDragon = sc.nextInt();
				String meetDragonResponse;
				switch (meetDragon)
				{
				case 1:
					meetDragonResponse = "face the beast";
					break;
				case 2:
					meetDragonResponse = "run away";
					break;
				default:
					meetDragonResponse = "invalid response";
					break;
				}
				System.out
						.println("You approach the dragon. You see that he has ____ heads."
								+ "(enter '1' or '2' or '3')");

				int dragonHeadNo = sc.nextInt();
				String dragonHeads;
				switch (dragonHeadNo)
				{
				case 1:
					dragonHeads = "1";
					break;
				case 2:
					dragonHeads = "2";
					break;
				case 3:
					dragonHeads = "3";
					break;
				default:
					dragonHeads = "invalid response";
					break;
				}
				System.out.println("No one has ever faced a " + dragonHeadNo
						+ "-headed dragon before! Choose your weapon.");
				System.out
						.println("Enter '1' for slingshot, '2' for sword or '3' for bow and arrow");

				int weaponChoice = sc.nextInt();
				String weapon;
				switch (weaponChoice)
				{
				case 1:
					weapon = "slingshot";
					break;
				case 2:
					weapon = "sword";
					break;
				case 3:
					weapon = "bow and arrow";
					break;
				default:
					weapon = "invalid response";
					break;
				}
				System.out
						.println("Armed with your "
								+ weapon
								+ ", you approach the dragon. You can feel its fiery breath as you get closer. "
								+ "It stares at you with its ____ eyes. (enter '1' for red or '2' for blue)");
				int eyeChoice = sc.nextInt();
				String eyeColor;
				switch (eyeChoice)
				{
				case 1:
					eyeColor = "red";
					break;
				case 2:
					eyeColor = "blue";
					break;
				default:
					eyeColor = "invalid response";
					break;
				}
				System.out
						.println("Oh thank goodness! "
								+ eyeColor
								+ "-eyed dragons are friendly. You pet it and become friends.");
				System.out
						.println("You name the dragon ____ (Type a name for the dragon)");
				String dragonName = sc.next();
				System.out.println(userName + " and" + dragonName
						+ " lie happily ever after.");
				System.out.println("That was a great story " + userName
						+ ". Do you want to play this game again?");
				System.out.println("(Enter 'y' for yes or 'n' for no)");
				String choice2 = sc.next();

				if (choice1.equalsIgnoreCase("n"))
				{
					System.out.println("Bye " + userName
							+ "! Maybe we can play another time ...");
				} else
				{
					System.out.println();
				}
			}
		}
	}
}