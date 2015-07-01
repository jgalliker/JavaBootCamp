package solution;

public class PairOfDice
{
	private Die die1;
	private Die die2;
	private int sum;

	public PairOfDice()
	{
		die1 = new Die();
		die2 = new Die();
	}

	public PairOfDice(int sides)
	{
		die1 = new Die(sides);
		die2 = new Die(sides);
	}

	// roll the dice
	public void roll()
	{
		die1.roll();
		die2.roll();
	}

	// get value of die1
	public int getValue1()
	{
		return die1.getValue();
	}

	// get value of die2
	public int getValue2()
	{
		return die2.getValue();
	}

	public int getSum()
	{
		int sum = die1.getValue() + die2.getValue();
		return sum;
	}

}