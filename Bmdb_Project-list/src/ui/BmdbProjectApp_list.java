package ui;
import java.util.ArrayList;
import java.util.Scanner;

import business.Actor;
import business.Movie;
import ui.console.Console;

public class BmdbProjectApp_list {
	
	public static void main(String[] args) {
		System.out.println("Welcome to the Bootcamp Movie DB!");
		
		
		// initialize an array of actors
		ArrayList<String> actors = new ArrayList<>();
		actors.add(Console.getString("First Name?"));
		
		System.out.println(actors);
		
	
		String command = "";
		while (!command.equalsIgnoreCase("7")) {
			System.out.println("Menu");
			System.out.println("1 - Add Actor");
			System.out.println("2 - Add Movie");
			System.out.println("3 - List Movies");
			System.out.println("4 - Find Movie");
			System.out.println("5 - List Actor");
			System.out.println("6 - Find Actor");
			System.out.println("7 - Exit");
			System.out.println();
			command = Console.getString("Command: ");
			System.out.println();

			switch (command) {
			case "1":
			// User Input
				System.out.println("Add an Actor/Actress: ");
				int actorID = Console.getInt("ID? ");
				String firstName = Console.getString("First Name? ");
				String lastName = Console.getString("Last Name? ");
				String gender = Console.getString("Gender (M/F)? ");
				String birthDate = Console.getString("Birthdate (YYYY-MM-DD? ");
					
			// Display Output
				
				break;
				
				
				
			case "2":
			// User Input
				System.out.println("Add A Movie: ");
				int movieID = Console.getInt("ID? ");
				String title = Console.getLine("Title? ");
				String year = Console.getString("Year? ");
				String rating = Console.getString("Rating? ");
				String genre = Console.getLine("Genre? ");
				
			// Display Output
				
				
				
				break;
				
			case "3":
				// List Movies 
				System.out.println("List of all Actor: ");
				
				
				break;
				
			case "4":
				// Find Movie 
				System.out.println("Find an Movie by ID: ");
				
				
			
				break;
			case "5":
				//List Actor
				System.out.println("List of all Actor: ");
				
				System.out.println();
				break;
			case "6":
				// Find Actor
				System.out.println("Find an Actor by ID: ");
				
				
				System.out.println();
				break;
			case "7":
				break;
				
			default:
				System.err.println("Invalid Entry!");
				System.out.println();
				break;
			}
		}
		
		System.out.print("Bye!");
		
		
	}
	
}
