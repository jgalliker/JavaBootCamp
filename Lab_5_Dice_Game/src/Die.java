public class Die
{
	// instance variables
	public static final int DEFAULT_SIDES = 6;
	private int sides;
	private int value;

	// constructors
	public Die(int value)
	{
		sides = DEFAULT_SIDES;
	}

	// methods
	public void roll()
	{
		value = (int) (Math.random() * sides + 1);
	}

	private int getValue()
	{
		return value;
	}

	public String toString()
	{
		return value + "";
	}
}