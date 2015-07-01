import java.util.Scanner;

public class DiceRollerApp
{
	private int combined;
    private int count = 0;
    public String message = "";
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		// Welcome
		System.out.println("Welcome to the Grand Circus Casino!");
		
		String choice = "y";
		int counter = 1;

		// Get user input
		System.out.println("Roll the dice? (y/n):  ");
		System.out.println();
		choice = sc.next();

		while (choice.equalsIgnoreCase("y"))
		{
			PairOfDice pod = new PairOfDice();
			pod.roll();
			// display role counter and see if user wants to roll again
			System.out.println("Roll " + counter + ":");
			System.out.println(pod.getValue1());
			System.out.println(pod.getValue2());
			System.out.println(pod.getSum());
			
			
			
			System.out.print("Roll again? (y/n): ");
			choice = sc.next();
			System.out.println();

			counter++;

		}
		sc.close();
	}
}

/*
Dice.roll();
count++;
combined = Dice.getSum();
if (combined == 2) {
    message = "Snake Eyes!";
} else if (combined == 6) {
    message = "Box Cars!";
} else if (combined == 7) {
    message = "Craps!";
}

System.out.print(prompt);

while(true)
	String s = sc.next().toLowerCase();
	
	if(s.equals("y"))
	{
		break;
	}
	else if(s.equals("n"))	



return s;



while(true)
String userInput = sc.next().toLowerCase();
if(userInput.equals("y")){
 //Its yes, do something here
break;
}
else if(userInput.equals("n")){
 //It's no, do something else
 break;
}
else{
  //Handle an invalid entry here
}
*/
