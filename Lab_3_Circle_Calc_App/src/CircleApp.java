import java.util.Scanner;
public class CircleApp {
	
	public static void main(String[] args) {		

		System.out.println("Welcome to the Circle Tester");
		System.out.println();
		Scanner sc = new Scanner(System.in);

		String choice = ("y");

		while (choice.equalsIgnoreCase("y")) 
		{
			
			//System.out.print("Enter circle radius:  ");
			
			double radius = Validator.getUsersDoubleInput(sc, 
					"Enter circle radius:  ", 0, 100);
			
			Circle c = new Circle(radius); //new instance of circle

			System.out.println("Circumference: " + c.getFormattedCircumference());
			System.out.println("Area: " + c.getFormattedArea() );
			System.out.println();
						
			//System.out.println("Continue? y/n: ");
			//choice = sc.next();
			choice = Validator.getString(sc, "Continue? y/n: ");
			System.out.println();
		}
		
		System.out.println("Goodbye. You created " + Circle.getObjectCount()
				+ " Circle object(s).");
		System.out.println();
		sc.close();
	}
}