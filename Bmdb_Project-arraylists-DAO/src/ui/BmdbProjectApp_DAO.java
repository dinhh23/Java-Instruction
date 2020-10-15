package ui;

import java.time.LocalDate; 
import business.Actor;
import business.Movie;
import db.ActorTextFile;
import db.DAO;
import db.DAO1;
import db.MovieTextFile;
import ui.console.Console;

public class BmdbProjectApp_DAO {
	
	// private static List<Actor> actors = new ArrayList<>();
	// private static List<Movie> movies = new ArrayList<>();
	private static DAO<Actor> actorDAO = new ActorTextFile();
	private static DAO1<Movie> movieDAO = new MovieTextFile();
	
	public static void main(String[] args) {
		System.out.println("Welcome to the Bootcamp Movie DB!");
		System.out.println();
		
		// initialize an array of actors
		// movies.add(new Movie(1,"Blank Panther","2018","PG-13","Superhero"));
		// movies.add(new Movie(2,"Star Wars: The Rise of Skywalker","2019","PG-13","Action"));
		// movies.add(new Movie(3,"Avengers: Endgame","2019","PG-13","Superhero"));
		
		// actors.add(new Actor(1,"Chadwick","Bosement","M", "2020-01-01"));
		// actors.add(new Actor(2,"Morgan","Freeman","M", "2020-02-02"));
		// actors.add(new Actor(3,"Robin","Williams","M", "2020-03-03"));
	
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
				String birthDateStr = Console.getString("Birthdate (YYYY-MM-DD)? ");
				LocalDate birthDate = LocalDate.parse(birthDateStr);
				Actor actor = new Actor(actorID,firstName,lastName,gender,birthDate);
					
			// Display Output
				actorDAO.add(actor);
				System.out.println("Actor Added!!!");
				System.err.println(actor.displayActorSummary());
				break;
				
			case "2":
			// User Input
				System.out.println("Add A Movie: ");
				int movieID = Console.getInt("ID? ");
				String title = Console.getLine("Title? ");
				String year = Console.getString("Year? ");
				String rating = Console.getString("Rating? ");
				String genre = Console.getLine("Genre? ");
				Movie movie = new Movie(movieID,title,year,rating,genre);
				
			// Display Output
				System.out.println();
				movieDAO.add(movie);
				System.out.println("Movie Added!!!");
				System.err.println(movie.displayMovieSummary());
				System.out.println();
				break;
				
			case "3":
				// List Movies 
				System.out.println("List of all Actor: ");
				for (Movie m: movieDAO.getALL()) {
					if (m!=null) {
							System.out.println(m.displayMovieSummary());
							System.out.println();
					}
				}
				
				break;
				
			case "4":
				// Find Movie 
				System.out.println("Find an Movie by ID: ");
				movieID = Console.getInt("ID? ");
				for (Movie m: movieDAO.getALL()) {
					if (m!=null && m.getMovieID()==movieID) {
						System.out.println("Movie found!!!");
						System.out.println(m.displayMovieSummary());
					}
				}
				System.out.println();
			
				break;
			case "5":
				//List Actor
				System.out.println("List of all Actor: ");
				for (Actor a: actorDAO.getALL()) {
					if (a!=null) {
							System.out.println(a.displayActorSummary());
							System.out.println();
					}		
				}
				System.out.println();
				
				break;
			case "6":
				// Find Actor
				System.out.println("Find an Actor by ID: ");
				actorID = Console.getInt("ID? ");
				for (Actor a: actorDAO.getALL()) {
					if (a!=null && a.getActorID()==actorID) {
						System.out.println("Actor found!!!");
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
