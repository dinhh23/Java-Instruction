public class PersonManagerAPP {

	public static void main(String[] args) {
			System.out.println("Welcome to the Person Manager!");
			
			//*** WHILE LOOP 
			String choice ="y";
			while (choice.equalsIgnoreCase("y")) {
			
				
				choice = Console.getChoiceString("Continue? (y/n):");
			}
			
			System.out.println("Bye!");
	}	
	
}