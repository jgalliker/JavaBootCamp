package solution;
public class Die
{
	private int sides;
	private int value;

	public Die()
	{
		this.sides = 6; // default to a six-sided die
		this.value = 1; // initialize value to 1
	}

	public Die(int sides)
	{
		this.sides = sides; // let the user set the sides
		this.value = 1; // initialize value to 1
	}

	// roll the die
	public void roll()
	{
		value = (int) (Math.random() * sides); // number from 0 to sides
		value++;
	}

	public int getValue()
	{
		return value;
	}
}