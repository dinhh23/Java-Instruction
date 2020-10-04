import java.util.Scanner;

public class Table_Of_PowersApp {

	public static void main(String[] args) {
		// 1 - Welcome message 
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Squares and Cubes table");
		System.out.println();
		
	// *** WHILE LOOP STARTS 
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
		// 2 - get user input
			System.out.println("Enter an integer: ");
			int userNumber = sc.nextInt();
			
			
		// 3 - biz logic 
			for (int i = 1; i < 9; i++) {
				int userNumberSquared = (int) Math.pow(userNumber,2);
				int userNumberCubed = (int) Math.pow(userNumber,3);
			
		// 4 - Display output	
			
			
			System.out.println("Number Squared Cubed");
			System.out.println("======" + " " + "=======" + " " + "=====");
			
			String message = "\n" + userNumber + "       " + userNumberSquared + "       " + userNumberCubed;
			
		    System.out.println(message);
		    System.out.println();
		    System.out.println("Continue? (y/n): ");
			System.out.println();
		
			choice = sc.next();
			
	// *** WHILE LOOP ENDS 	
			}
		}
		// 5 - bye message 
		System.out.println("BYEEE!!!");		
	}
}








        // get the input from the user
         

        
        