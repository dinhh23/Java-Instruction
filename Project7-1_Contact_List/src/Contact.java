
public class Contact {
	// Define Instance Variables 
	private String FirstName;
	private String LastName;
	private String Email;
	private String Phone;
	
	//EMPTY/DEFAULT CONSTRUCTOR 
	public Contact() {
		
	}
	
	//FULLY LOADED CONSTRUCTOR 
	public Contact(String firstName, String lastName, String email, String phone) {
		super();
		this.FirstName = firstName;
		this.LastName = lastName;
		this.Email = email;
		this.Phone = phone;
	}

	
	//GETTER METHOD 
	public String getFirstName() {
		return FirstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		this.LastName = lastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		this.Email = email;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		this.Phone = phone;
	}

	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}
	
	public String displayContact() {
		String str = "-----------------------------------\n";
		str += "--------- Current Contact ---------\n";
		str += "-----------------------------------\n";		
		str += "Name:\t\t"+FirstName+ " " +LastName+"\n";
		str += "Email Address:\t" +Email+"\n";
		str += "Phone Number:\t"+Phone+"\n";
		
		return str;
	
	}
	
	

}
