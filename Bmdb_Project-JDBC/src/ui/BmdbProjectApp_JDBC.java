package ui;

import java.time.LocalDate;  
import business.Actor;
import business.Movie;
import db.ActorDB;
import db.DAO;
import db.DAO1;
import db.MovieDB;
import ui.console.Console;

public class BmdbProjectApp_JDBC {
	
	private static DAO<Actor> actorDAO = new ActorDB();
	private static DAO1<Movie> movieDAO = new MovieDB();
	
	public static void main(String[] args) {
		System.out.println("Welcome to the Bootcamp Movie DB!");
		System.out.println();
	
		String command = "";
		while (!command.equalsIgnoreCase("10")) {
			System.out.println("Menu");
			System.out.println("1 - Add Actor");
			System.out.println("2 - Add Movie");
			System.out.println("3 - List Movies");
			System.out.println("4 - Find Movie");
			System.out.println("5 - List Actor");
			System.out.println("6 - Find Actor");
			System.out.println("7 - Delete Actor");
			System.out.println("8 = Delete Movie");
			System.out.println("9 - Find Actors for Last Name");
			System.out.println("10 - Exit");
			System.out.println();
			command = Console.getString("Command: ");
			System.out.println();
			switch (command) {
			
			case "1":
			// Add Actor
				System.out.println("Add an Actor/Actress: ");
				String firstName = Console.getString("First Name? ");
				String lastName = Console.getString("Last Name? ");
				String gender = Console.getString("Gender (M/F)? ");
				String birthDateStr = Console.getString("Birthdate (YYYY-MM-DD)? ");
				LocalDate birthDate = LocalDate.parse(birthDateStr);
									
			// Display Output
				System.out.println();
				Actor actor = new Actor(firstName,lastName,gender,birthDate);
				actorDAO.add(actor);
				System.out.println("Actor Added!!!");
				System.err.println(actor.displayActorSummary());
				System.out.println();
				break;
				
			case "2":
			// Add Movie
				System.out.println("Add A Movie: ");
				String title = Console.getLine("Title? ");
				String year = Console.getString("Year? ");
				String rating = Console.getString("Rating? ");
				String genre = Console.getLine("Genre? ");
				Movie movie = new Movie(title,year,rating,genre);
				
			// Display Output
				System.out.println();
				movieDAO.add(movie);
				System.out.println("Movie Added!!!");
				System.err.println(movie.displayMovieSummary());
				System.out.println();
				break;
				
			case "3":
				// List Movies 
				System.out.println("List of all Movies: ");
				for (Movie m: movieDAO.getALL()) {
					if (m != null) {
							System.out.println(m.displayMovieSummary());
							System.out.println();
					}
				}
				
				break;
				
			case "4":
				// Find Movie 
				System.out.println("Find an Movie by ID: ");
				int MovieID = Console.getInt("ID? ");
				Movie m = movieDAO.get(MovieID);
					if (m != null) {
					System.out.println(m.displayMovieSummary());
				}
					else {
					System.out.println("No movie found for id: "+MovieID);
				}
					System.out.println();			
					break;
				
			case "5":
				// List Actor
				System.out.println("List of all Actor: ");
				for (Actor a: actorDAO.getALL()) {
					if (a != null) {
							System.out.println(a.displayActorSummary());
							System.out.println();
					}		
				}
				System.out.println();
				break;
				
			case "6":
				// Find Actor
				System.out.println("Find an Actor by ID: ");
				int actorID = Console.getInt("ID? ");
				Actor a = actorDAO.get(actorID);
					if (a != null) {
					System.out.println(a.displayActorSummary());
				}
					else {
					System.out.println("No actor found for id: "+actorID);
				}
					System.out.println();
					break;	
				
			case "7":
				// delete actor 
				System.out.println("Delete an actor by ID: ");
				actorID = Console.getInt("ID? ");
				a = actorDAO.get(actorID);
				if (a != null) {
					if (actorDAO.delete(a)) {
						System.out.println("Delete Sucessful!");
				}
				else {
					System.out.println("Error deleting actor!");
					}
				}
				else {
					System.out.println("No actor found for id: "+actorID);
				}
				System.out.println();
				break;
				
			case "8":
				// delete movie
				System.out.println("Delete an movie by ID: ");
				MovieID = Console.getInt("ID? ");
				m = movieDAO.get(MovieID);
				if (m != null) {
					if (movieDAO.delete(m)) {
						System.out.println("Delete Sucessful!");
				}
				else {
					System.out.println("Error deleting movie!");
					}
				}
				else {
					System.out.println("No movie found for id: "+MovieID);
				}
				System.out.println();
				break;
				 			
			case "9":
				
		
					break;	
				
				
				
			case "10":
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
