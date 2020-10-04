import java.util.InputMismatchException;
import java.util.Scanner;

public class DiceRollerApp {

	public static void main(String[] args) {
			System.out.println("Welcome to the basic calculator app!");
			System.out.println("++++++++++++++++++++++++++++++++++++");
			System.out.println();
			Scanner sc = new Scanner(System.in);
			String choice = "y"; 
			
		while (choice.equalsIgnoreCase("y")) {
			// *** CONTINUE LOOP STARTS HERE
			// Start a game - generate random number (theNumber)
			int theNumber = (int)(Math.random()*100) + 1;
			System.out.println(theNumber);
			// Display the "I'm thinking..." Message 
			System.out.println("I'm thinking of a number from 1 to 100." + "\nTry to guess it.");
			// -initialize the count variable = 0 (count logic) 
			int count = 0;
			int guess = 0;
			while(guess!=theNumber) {
				// *** 'win' LOOP starts  'guess == theNumber??
				// propmt user input (guess)
				guess = getIntWithinRange("Enter Number: ", sc, 1, 100);
				// - validate user entry: int, within 1 to 100 (withinRange)
				count++;
				// biz logic 
				// - compare guess vs theNumber
				int diff = theNumber - guess;
				// - display the appropriate message: win, too low, too high, way too high, way too low 
				String message = "";
				if (diff > 10) {
					message += "Way Too low!	Guess Again.";
				}
				else if (diff < -10) {
					message += "Way too high!	Guess Again.";
				}
				else if (diff > 0) {
					message += "Too Low!	Guess Again.";
				}
				else if (diff < 0) {
					message += "Too High!	Guess Again.";
				}
				else {
					//win
					message += "You got it in " +count+ " " +"tries!\n";
					if (count <= 3) {
						message +="Great Work! You're a mathematical wizard!!";
					} 
					else if (count <= 7) {
						message +="Not bad! You've got some potential.\n";
					}
					else {
						message +="What took you so long? Maybe you should take some lessons";
					}
				}
				System.out.println(message+"\n");
				// - display the 'win' message: in requirements
				// ** 'win' LOOP ends 
			}
			// *** CONTINUE LOOP ENDS	
				sc.nextLine();
				choice = getChoiceString("Try Again? ", sc, "y", "n");
			}
			System.out.println("Bye - Come Back Soon!");
			
		}
	
	// get an integer from console 
	// use exception handling to check input
	public static int getInt(String prompt, Scanner sc) {
		int userGuess = 0;
		while (true) {
			try {
				System.out.println(prompt);
				userGuess = sc.nextInt();
				break;
			}
			catch (InputMismatchException ime) {
				System.out.println("Error! Invalid Integer. Try again. \n");
				sc.nextLine();
				continue;
			}
		}
		return userGuess;
	}
	
	public static int getIntWithinRange(String prompt, Scanner sc, int min, int max) {
		int userGuess = 0;
		boolean isValid = false;		// keep running the loop for valid input
		
		while (!isValid) {
			userGuess = getInt(prompt, sc);
			if (userGuess < min) {
				System.out.println("Error! Number must be >= "+min+".");
			}
			else if (userGuess > max) {
				System.out.println("Error! Number must be <= "+max+".");
			}
			else {
				isValid = true;
			}
		}
		
		return userGuess;
	}
	
	// get a required string which is only 1 of 2 valid choice (s1,s2)
	private static String getChoiceString(String prompt, Scanner sc,
															String s1, String s2) {
		String str = "";
		boolean isValid = false;
		while (!isValid) {
			str = getRequiredString(prompt, sc);
			if (!str.equalsIgnoreCase(s1) && !str.equalsIgnoreCase(s2)) {
				// entry is invalid
				System.out.println("Invalid Entry: Expected values are " + s1 + " "+ "or" + " "+ s2 + ".");
			}
			else {
				isValid = true;
			}
		}
		return str;
	}


	private static String getRequiredString(String prompt, Scanner sc) {
		String str = ""; 
		boolean isValid = false;
		while (!isValid) {
			System.out.println(prompt);
			str = sc.nextLine();
			if (str.equals("")) {
				System.out.println("Invalid Entry... This Field is Required");
			}	
			else {
				isValid = true;
			}
		}
		return str;
	}

    
	
	
	
	}
	
	
	
	


	
	
	

