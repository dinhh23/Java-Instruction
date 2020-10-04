import java.util.Scanner;

public class ContactListAPP {

	public static void main(String[] args) {
			System.out.println("Welcome to the Contact List Application!");
			
			//*** WHILE LOOP 
			String choice ="y";
			while (choice.equalsIgnoreCase("y")) {
				System.out.println();
				String firstName = Console.getString("Enter First Name: ");
				String lastName = Console.getString("Enter Last Name: ");
				String email = Console.getString("Enter Email: ");
				String phone = Console.getString("Enter Phone: ");
				
				System.out.println();
				//Contact.displayContact();		-> can't call until I create an instance 
				Contact c = new Contact(firstName,lastName,email,phone);	//from above 
				
				System.out.println(c.displayContact());
				System.out.println();
				
				choice = Console.getString("Continue? ");
			}
			
			System.out.println("Bye!");
	}	
	
}
