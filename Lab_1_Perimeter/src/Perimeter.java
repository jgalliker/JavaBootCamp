import java.util.Scanner;

public class Perimeter {
	public static void main(String[] args) {

		System.out.println("Welcome to Room Dimension Calculator");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		// perform perimeter calculation until choice is not equal to "y"
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			// get the room details from the user
			System.out.print("Enter name of room:  ");
			String roomName = sc.next();
			System.out.print("Enter room length:  ");
			double roomLength = sc.nextDouble();
			System.out.print("Enter room width:  ");
			double roomWidth = sc.nextDouble();

			// calculate the room area and perimeter

			double roomArea = roomLength * roomWidth;
			double roomPerimeter = (2 * roomLength) + (2 * roomWidth);

			// display the calculations

			String message = "Room name: " + roomName + "\n" + "Room area: " + roomArea + "\n"
					+ "Room perimeter: " + roomPerimeter + "\n";

			System.out.println(message);
			
			//see if user wants to continue
			System.out.print("Continue? y/n: ");
			choice = sc.next();
			System.out.println();
		}
		sc.close();
	}
}
