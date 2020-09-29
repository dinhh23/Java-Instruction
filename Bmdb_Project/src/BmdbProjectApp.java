import java.util.Scanner;

public class BmdbProjectApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the Bootcamp Movie DB!");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		String command = "";
		while (!command.equalsIgnoreCase("3")) {
			System.out.println("Menu");
			System.out.println("1 - Add Actor");
			System.out.println("2 - Add Movie");
			System.out.println("3 - Exit");
			System.out.println();
			System.out.print("Command: ");
			command = sc.next();
			System.out.println();

			switch (command) {
			case "1":
			// User Input
				System.out.println("Add an Actor:");
				System.out.print("First Name? ");
				String firstName = sc.next();
				System.out.print("Last Name? ");
				String lastName = sc.next();
				System.out.print("Gender (Male/Female)? ");
				String gender = sc.next();
				System.out.print("BirthDate (YYYY-MM-DD)? ");
				String birthdate = sc.next();
				System.out.println();
				
			// Display Output
				System.out.println("Actor Summary:");
				String messageActor = (firstName + " " + lastName + "," + " " + gender + "," + " " + "born" + " " + birthdate);
				System.out.println(messageActor);
				System.out.println();
				break;

			case "2":
			// User Input
				System.out.println("Add a Movie: ");
				System.out.print("Title? ");
				String movieName = sc.nextLine();
				movieName += sc.nextLine();
				System.out.print("Year? ");
				int movieYear = sc.nextInt();
				System.out.print("Rating? ");
				String movieRating = sc.next();
				System.out.print("Genre? ");
				String movieGenre = sc.next();
				movieGenre += sc.nextLine();
				System.out.println();
				
			// Display Output
				System.out.println("Movie Summary: ");
				String messageMovie = movieName + " " + movieRating + " " + "was released in" + " " + movieYear + "." + " "
						+ "Genre(s): " + movieGenre;
				System.out.println(messageMovie);
				System.out.println();
				break;

			case "3":
				break;
				
			default:
				System.out.println("Invalid Entry!");
				break;
			}
		}
		sc.close();
		System.out.print("Bye!");
	}
}
