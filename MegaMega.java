import java.util.Scanner;
// I made this edit on Git Hub
public class MegaMega {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		intro();
		if (wantToPlay()) {
			computerWillPickNumbers();			
		}
	}

	public static void intro() {
		System.out.println("Welcome to the MegaMega Lottery!\n");
		System.out.println("Each play costs $2.00.");
		System.out.print("Would you like to play? (y/n) ");
	}

	public static boolean wantToPlay() {
		int repeat = 0;
		
		while (true) {
			String response = input.nextLine();

			if (response.equalsIgnoreCase("YES") || response.equalsIgnoreCase("Y")) {
				System.out.println("Great! Let's play!");
				return true;
			}
			
			else if (response.equalsIgnoreCase("NO") || response.equalsIgnoreCase("N")) {
				System.out.println("That's too bad...");
				return false;
			}
			
			else {
				++repeat;
				if (repeat < 3) {
					System.out.println("I'm sorry, I didn't catch that.\n");
					System.out.print("Would you like to play? (y/n) ");
				}
				else {
					System.out.println("I'm sorry, I can't understand you. Come back later.\n");					
					return false;
				}
			}	
		}
	}

	public static boolean computerWillPickNumbers() {
		System.out.print("Do you want the computer to select your numbers?");

		int repeat = 0;
		
		while (true) {
			String response = input.nextLine();

			if (response.equalsIgnoreCase("YES") || response.equalsIgnoreCase("Y")) {
				System.out.println("Great! Let's play!");
				return true;
			}
			
			else if (response.equalsIgnoreCase("NO") || response.equalsIgnoreCase("N")) {
				System.out.println("That's too bad...");
				return false;
			}
			
			else {
				++repeat;
				if (repeat < 3) {
					System.out.println("I'm sorry, I didn't catch that.\n");
					System.out.print("Would you like to play? (y/n) ");
				}
				else {
					System.out.println("I'm sorry, I can't understand you. Come back later.\n");					
					return false;
				}
			}	
		}	}
}
