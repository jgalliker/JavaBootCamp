import java.util.Scanner;

public class Validator
{
	public static String getString(Scanner sc, String prompt)
	{
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
	
	
	
}

}