
public class Actor {
	// Instance Variables 
	private String FirstName;
	private String LastName;
	private String Gender;
	private String Birthdate;
	
	//Empty Constructor 
	public Actor() {
		super();
		
	}
	
	//Fully Loaded Constructor 
	public Actor(String firstName, String lastName, String gender, String birthdate) {
		super();
		this.FirstName = firstName;
		this.LastName = lastName;
		this.Gender = gender;
		this.Birthdate = birthdate;
	}
	
	//getter/setter
	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		this.LastName = lastName;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		this.Gender = gender;
	}

	public String getBirthdate() {
		return Birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.Birthdate = birthdate;
	}
	
	public String displayActorSummary() {
		String str = "*****Actor Summary*****\n";
		str += "-----------------------\n";
		str += FirstName + " "  + LastName+"," + " " + Gender+"," + " " + "born" + " " + Birthdate;
				
		return str;
	}
	
	
}
