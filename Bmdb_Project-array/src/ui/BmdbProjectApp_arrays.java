package ui;
import java.util.Scanner;

import business.Actor;
import business.Movie;
import ui.console.Console;

public class BmdbProjectApp_arrays {
	
	private static Actor[] actors = new Actor[100];
	private static Movie[] movies = new Movie[100];
	
	public static void main(String[] args) {
		System.out.println("Welcome to the Bootcamp Movie DB!");
		
		// initialize an array of actors
		movies[1] = new Movie(1,"Blank Panther","2018","PG-13","Superhero");
		movies[2] = new Movie(2,"Star Wars: The Rise of Skywalker","2019","PG-13","Action");
		movies[3] = new Movie(3,"Robin","Williams","Male","1951-07-21");
		
		actors[1] = new Actor(1,"Chadwick","Boseman","Male","1976-11-29");
		actors[2] = new Actor(2,"Morgan","Freeman","Male","1937-06-01");
		actors[3] = new Actor(3,"Robin","Williams","Male","1951-07-21");
	
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
				System.out.println();
				Actor actor = new Actor(actorID,firstName,lastName,gender,birthDate);
				for (int i=0; i<actors.length; i++) {
					if (actors[i] == null) {
						actors[i] = actor;	
						break;
						}
				}
				System.out.println("Actor Added!!!");
				System.err.println(actor.displayActorSummary());
				System.out.println();
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
				System.out.println();
				Movie movie = new Movie(movieID,title,year,rating,genre);
				for (int i=0; i<movies.length; i++) {
					if (movies[i] == null) {
						movies[i] = movie;	
						break;
						}
				}
				System.out.println("Movie Added!!!");
				System.err.println(movie.displayMovieSummary());
				System.out.println();
				break;
				
			case "3":
				// List Movies 
				System.out.println("List of all Actor: ");
				for (Movie m: movies) {
					if (m!=null) {
							System.out.println(m.displayMovieSummary());
					}
				}
				
				break;
				
			case "4":
				// Find Movie 
				System.out.println("Find an Movie by ID: ");
				movieID = Console.getInt("ID? ");
				for (Movie m: movies) {
					if (m!=null && m.getMovieID()==movieID) {
						System.out.println("Actor found:!");
						System.out.println(m.displayMovieSummary());
					}
				}
				System.out.println();
			
				break;
			case "5":
				//List Actor
				System.out.println("List of all Actor: ");
				for (Actor a: actors) {
					if (a!=null) {
							System.out.println(a.displayActorSummary());
					}
				}
				System.out.println();
				break;
			case "6":
				// Find Actor
				System.out.println("Find an Actor by ID: ");
				actorID = Console.getInt("ID? ");
				for (Actor a: actors) {
					if (a!=null && a.getActorID()==actorID) {
						System.out.println("Actor found:!");
						System.out.println(a.displayActorSummary());
					}
				}
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
