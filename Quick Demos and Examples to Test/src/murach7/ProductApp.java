package murach7;
import java.util.Scanner;

public class ProductApp
{
	public static void main(String[] args)
	{
		// Welcome message
		System.out.println("Welcome to the Product Selector");
		System.out.println();

		// Display one or more products
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y"))
		{
			// get user input
			System.out.println("Enter product code: ");
			String productCode = sc.next();
			sc.nextLine();

			// get product object
			Product product = ProductDB.getProduct(productCode);

			// display output
			System.out.println();
			System.out.println("SELECTED PRODUCT");
			System.out.println("Description : " + product.getDescription());
			System.out.println("Price: " + product.getFormattedPrice());
			System.out.println();

			// see if user wants to continue
			System.out.println("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
		}
	}
}