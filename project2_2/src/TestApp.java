import java.util.Scanner;

public class TestApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Student Registration Form");
		System.out.println("Enter first name: ");
		String sentence = sc.nextLine();
		
		System.out.println("Enter last name: ");
		String sentence1 = sc.nextLine();
		
		System.out.println("Enter year of birth: ");
		String sentence2 = sc.nextLine();
		
		String firstName = "Hung";
		String lastName = "Dinh";

		System.out.println("Welcome " + firstName + " " + lastName + "!");
		System.out.println("Your registration is complete.");
		System.out.println("Your temporary password is:" + firstName + "*" + sentence2 );
	}
}
