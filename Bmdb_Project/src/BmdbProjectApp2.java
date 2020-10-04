import java.util.Scanner;

public class BmdbProjectApp2 {

	public static void main(String[] args) {

		System.out.println("Welcome to the Bootcamp Movie DB!");
		
		String command = "";
		while (!command.equalsIgnoreCase("3")) {
			System.out.println("Menu");
			System.out.println("1 - Add Actor");
			System.out.println("2 - Add Movie");
			System.out.println("3 - Exit");
			System.out.println();
			command = Console.getString("Command: ");
			System.out.println();

			switch (command) {
			case "1":
			// User Input
				System.out.println("Add an Actor/Actress: ");
				String firstName = Console.getString("First Name? ");
				String lastName = Console.getString("Last Name? ");
				String gender = Console.getString("Gender (Male/Female)? ");
				String birthDate = Console.getString("Birthdate (YYYY-MM-DD? ");
				
			// Display Output
				System.out.println();
				Actor a = new Actor(firstName,lastName,gender,birthDate);
				
				System.err.println(a.displayActorSummary());
				System.out.println();
				break;

			case "2":
			// User Input
				System.out.println("Add A Movie: ");
				String title = Console.getStringSentence("Title? ");
				String year = Console.getString("Year? ");
				String rating = Console.getString("Rating? ");
				String genre = Console.getStringSentence("Genre? ");
				
			// Display Output
				System.out.println();
				Movie m = new Movie(title,year,rating,genre);
				
				System.err.println(m.displayMovieSummary());
				System.out.println();
				break;
				
			case "3":
				break;
				
			default:
				System.out.println("Invalid Entry!");
				System.out.println();
				break;
			}
		}
		
		System.out.print("Bye!");
	}
}
