
public class PRS_ConsoleAPP {

	public static void main(String[] args) {
		System.out.println("Welcome to the PRS Console App!");
		System.out.println();
		
			int command = 0;
		
			while (command!=6) {
				System.out.println("Command Menu:");
				System.out.println("1 - Add User");
				System.out.println("2 - Add Vendor");
				System.out.println("3 - Add Product");
				System.out.println("4 - Add Request");
				System.out.println("5 - Add Line Item");
				System.out.println("6 - Exit");
				System.out.println();
			
				command = Console.getInt("Command: ");
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
				Boolean reviewer = Console.getChoiceString("Reviewer? ", "T","F");
				String admin = Console.getChoiceString("Admin? ", "T", "F");
				System.out.println();
				
				System.out.println("User Summary!!!");
				User u = new User(UserID,user,password,firstname,lastname,phonenumber,email,reviewer,admin);
				System.out.println(u.toString());
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
				
				System.out.println("Vendor Summary:");
				Vendor v = new Vendor(VendorID,code,name,address,city,state,zip,vPhonenumber,vEmail);
				System.out.println(v.toString());
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
				
				System.out.println("Product Summary:");
				Product p = new Product(ProductID, partNumber, productName, price, unit, photopath);
				System.out.println(p.toString());
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
				
				System.out.println("Request Summary:");
				Request r = new Request(RequestID,Description,Justification,DateNeeded,DeliveryMode,Status,Total,SubmittedDate,ReasonForRejection);
				System.out.println(r.toString());
				System.out.println();
				
			break;
			
			case 5:
				// add line item
				System.out.println("Add a Line Item");
				int LineItemID = Console.getInt("ID? ");
				int Quantity = Console.getInt("Quantity? ");
				System.out.println();
				
				System.out.println("Line Item Summary:");
				LineItem li = new LineItem(LineItemID, Quantity);
				System.out.println(li.toString());
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
