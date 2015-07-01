package wIP12;
import java.util.Scanner;
public class ValidatorTestApp {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Validation Tester application");
		MyValidator myValidator = new MyValidator (sc);
		System.out.println("Int Test");
		int num = myValidator.getIntWithinRange("Enter an Integer between", -100, 100);
		System.out.println("Double Test");
		double dub = myValidator.getDoubleWithinRange("Enter a decimal between", -100, 100);		
	    System.out.println("Int:  " + num);
	    System.out.println("Double:   + dub");
	}
}
