public class PairOfDice
{
	private Die die1;
	private Die die2;
	
	public PairOfDice(int sides)
	{
	die1 = new Die (sides);
	die2 = new Die (sides);
	}
	
	public PairOfDice()
	{
	this(6);
	}
	
	public void roll()
	{
		die1.roll();
		die2.roll();
		
	}
	public int getValue1()
	{
		return die1.getValue1();
	}
	public int getValue2()
	{
		return die2.getValue2();
	}
	
	public int getSum()
	{
		return getValue1() + getValue2();
	}
}
