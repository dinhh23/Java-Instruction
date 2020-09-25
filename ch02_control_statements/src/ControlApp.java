import java.util.Scanner;

public class ControlApp {

	public static void main(String[] args) {
		// ch2 pages 65 - 69
		
		// if & while statement 
		Scanner sc = new Scanner(System.in);
		//initialize choice to 'y' so loop will run
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")) {
			System.out.println("Enter traffic light color");
			String color = sc.nextLine();
			
			if (color.equalsIgnoreCase("Red")) {    //method on the String class
				System.out.println("Red Light - stop!");
			}
			else if (color.equalsIgnoreCase("Yellow")) {     //method on the String class
				System.out.println("Yellow Light - stop!");
			}
			else {  // no condition to test 
				System.out.println("Green Light - GOOOOO!");
			}		
			System.out.println("Continue?(y/n) ");
			choice = sc.nextLine();
		}		
		
		System.out.println("BYEEE!!!");
	}
}