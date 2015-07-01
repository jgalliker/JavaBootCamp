import java.text.NumberFormat;
public class Circle
{
	private double radius; //declare instance variables
	private static int objectCount;
	
	public Circle(double radius) //constructor for radius variable
	{
		this.radius = radius;
		objectCount++; //iterate static counter
	}
	
	public double getCircumference() // circumference method
	{
		double circumference = Math.PI * 2 * this.radius;
		return circumference;
	}
	
	public String getFormattedCircumference()
	{ 
		return formatNumber(this.getCircumference());			
	}
	
	public double getArea() //area method
	{
		double area = Math.PI * Math.pow(this.radius,2);
		return area;
	}
	public String getFormattedArea()
	{
		return formatNumber(this.getArea());
	}
	private String formatNumber(double x)
	{
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMaximumIntegerDigits(7);
		return number.format(x);
	}
	public static int getObjectCount()
	{
		return objectCount;
	}
	
}
