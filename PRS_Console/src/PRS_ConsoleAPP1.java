
public class PRS_ConsoleAPP1 {

	public static void main(String[] args) {
		System.out.println(Console.BLUE_BACKGROUND_BRIGHT + "Welcome to the PRS Console App!" + Console.RESET);
		System.out.println();
		
			int command = 0;
		
			while (command!=6) {
				System.out.println(Console.CYAN_BOLD_BRIGHT + "Command Menu:" + Console.RESET);
				System.out.println(Console.CYAN_BOLD_BRIGHT + "1 - Add User" + Console.RESET);
				System.out.println(Console.CYAN_BOLD_BRIGHT + "2 - Add Vendor" + Console.RESET);
				System.out.println(Console.CYAN_BOLD_BRIGHT + "3 - Add Product" + Console.RESET);
				System.out.println(Console.CYAN_BOLD_BRIGHT + "4 - Add Request" + Console.RESET);
				System.out.println(Console.CYAN_BOLD_BRIGHT + "5 - Add Line Item" + Console.RESET);
				System.out.println(Console.CYAN_BOLD_BRIGHT + "6 - Exit" + Console.RESET);
				System.out.println();
			
				command = Console.getInt(Console.CYAN_BOLD_BRIGHT + "Command: " + Console.RESET);
				System.out.println();
			
			switch(command) {
			case 1:
				// add user
				System.out.println("Add a User:");
				int UserID = Console.getInt("ID? ");
				String user = Console.getString("UserName? ");
				String password = Console.getString("Password? ");
				String firstname = Console.getString("FirstName? ");
				String lastname = Console.getString("LastName? ");
				String phonenumber = Console.getString("PhoneNumber? ");
				String email = Console.getString("Email? ");
				String reviewer = Console.getChoiceString("Reviewer? ", "T","F");
				String admin = Console.getChoiceString("Admin? ", "T", "F");
				System.out.println();
				
				System.out.println(Console.BLUE_BOLD + "User Summary!!!" + Console.RESET);
				User u = new User(UserID,user,password,firstname,lastname,phonenumber,email,reviewer,admin);
				System.out.println(Console.PURPLE_BOLD_BRIGHT + u.toString() + Console.RESET);
				System.out.println();
			
			break;
		
			case 2:
				// add vendor 
				System.out.println("Add a Vendor:");
				int VendorID = Console.getInt("ID? ");
				String code = Console.getString("Code? ");
				String name = Console.getString("Name? ");
				String address = Console.getString("Address? ");
				String city = Console.getString("City? ");
				String state = Console.getString("State? ");
				String zip = Console.getString("Zip? ");
				String vPhonenumber = Console.getString("PhoneNumber? ");
				String vEmail = Console.getString("Email? ");
				System.out.println();
				
				System.out.println(Console.BLUE_BOLD + "Vendor Summary:" + Console.RESET);
				Vendor v = new Vendor(VendorID,code,name,address,city,state,zip,vPhonenumber,vEmail);
				System.out.println(Console.PURPLE_BOLD_BRIGHT + v.toString() + Console.RESET);
				System.out.println();
				
			break;
			
			case 3:
				// add product
				System.out.println("Add a Product:");
				int ProductID = Console.getInt("ID? ");
				String partNumber = Console.getString("PartNumber? ");
				String productName = Console.getString("Name? ");
				double price = Console.getDouble("Price? ");
				String unit = Console.getString("Unit? ");
				String photopath = Console.getString("PhotoPath? ");
				System.out.println();
				
				System.out.println(Console.BLUE_BOLD + "Product Summary:" + Console.RESET);
				Product p = new Product(ProductID, partNumber, productName, price, unit, photopath);
				System.out.println(Console.PURPLE_BOLD_BRIGHT + p.toString() + Console.RESET);
				System.out.println();
				
			break;
			
			case 4:
				// add request
				System.out.println("Add a Request");
				int RequestID = Console.getInt("ID? ");
				String Description = Console.getString("Description? ");
				String Justification = Console.getString("Justification? ");
				String DateNeeded = Console.getString("DateNeeded? ");
				String DeliveryMode = Console.getString("DeliveryMode? ");
				String Status = Console.getString("Status? ");
				double Total = Console.getDouble("Total? ");
				String SubmittedDate = Console.getString("SubmittedDate? ");
				String ReasonForRejection = Console.getString("ReasonForRejection? ");
				System.out.println();
				
				System.out.println(Console.BLUE_BOLD + "Request Summary:" + Console.RESET);
				Request r = new Request(RequestID,Description,Justification,DateNeeded,DeliveryMode,Status,Total,SubmittedDate,ReasonForRejection);
				System.out.println(Console.PURPLE_BOLD_BRIGHT + r.toString() + Console.RESET);
				System.out.println();
				
			break;
			
			case 5:
				// add line item
				System.out.println("Add a Line Item");
				int LineItemID = Console.getInt("ID? ");
				int Quantity = Console.getInt("Quantity? ");
				System.out.println();
				
				System.out.println(Console.BLUE_BOLD + "Line Item Summary:" + Console.RESET);
				LineItem li = new LineItem(LineItemID, Quantity);
				System.out.println(Console.PURPLE_BOLD_BRIGHT + li.toString() + Console.RESET);
				System.out.println();
					
			break;
			
			case 6:
				// exit 
			break;
			
			default:
				System.err.println("Invalid Command! Please Try Again!");
				System.out.println();
				break;
			}
		}
		
			System.out.println("Byeeeeee!!!!!");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
