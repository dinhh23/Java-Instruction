package business;

public class Actor {
	// Instance Variables 
	private int actorID;
	private String FirstName;
	private String LastName;
	private String Gender;
	private String Birthdate;
	
	//Empty Constructor 
	public Actor() {
		super();
		
	}
	
	public Actor(int actorID, String firstName, String lastName, String gender, String birthdate) {
		super();
		this.actorID = actorID;
		this.FirstName = firstName;
		this.LastName = lastName;
		this.Gender = gender;
		this.Birthdate = birthdate;
	}

	//getter/setter
	public int getActorID() {
		return actorID;
	}

	public void setActorID(int actorID) {
		this.actorID = actorID;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getBirthdate() {
		return Birthdate;
	}

	public void setBirthdate(String birthdate) {
		Birthdate = birthdate;
	}

	public String displayActorSummary() {
		String str = "*****Actor Summary*****\n";
		str += "-----------------------\n";
		str += actorID + "," + " " + FirstName + " "  + LastName+"," + " " 
				+ (Gender.equalsIgnoreCase("M") ? "Male" : "Female") 
						+"," + " " + "born" + " " + Birthdate;
				
		return str;
	}

	
	
	
	
}
