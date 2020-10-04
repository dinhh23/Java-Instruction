public class PersonManagerAPP {

	public static void main(String[] args) {
			System.out.println("Welcome to the Person Manager!");
			
			//*** WHILE LOOP 
			String choice ="y";
			while (choice.equalsIgnoreCase("y")) {
				String type = Console.getChoiceString("Create Customer or Employee?"
						+ "(c/e): ", "c", "e");
				System.out.println();
				String fName = Console.getString("First Name: ");
				String lName = Console.getString("Last Name: ");
				
				Person p = null;
				
				if(type.equalsIgnoreCase("c")) {
					//create a customer
					String cNumber = Console.getString("Customer Number: ");
					Customer c = new Customer (fName,lName,cNumber);
					p = c;
				}
				else {
					// create an employee
					String ssn = Console.getString("SSN:	");
					Employee e = new Employee(fName,lName,ssn);
					p = e;
				}
				System.out.println();
				
				Class c = p.getClass();
				
				System.out.println("You entered a new "+c.getName()+":");
				System.out.println(p.toString());
				
				choice = Console.getChoiceString("Continue?  ", "y", "n");
			}
			
			System.out.println("Bye!");
	}	
	
}