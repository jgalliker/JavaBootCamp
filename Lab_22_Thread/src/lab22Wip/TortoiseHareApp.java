package lab22Wip;

import java.util.Scanner;

public class TortoiseHareApp {
	
	public static Thread hare;
	public static Thread tortoise;
	

	public static void main(String[] args, String Tortoise) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ready, steady ... go!");
		
		Tortoise = new ThreadRunner (Tortoise, 0, 10);
		Hare = new ThreadRunner (Hare, 90, 100);
		
		
		

		
		
	}

}
