package business;

import java.time.LocalDate;

public class Actor {
	// Instance Variables 
	private int actorID;
	private String FirstName;
	private String LastName;
	private String Gender;
	private LocalDate BirthDate;
	
	//Empty Constructor 
	public Actor() {
		super();
		
	}
	
	public Actor(int actorID, String firstName, String lastName, String gender, LocalDate birthDate) {
		super();
		this.actorID = actorID;
		this.FirstName = firstName;
		this.LastName = lastName;
		this.Gender = gender;
		this.BirthDate = birthDate;
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

	public LocalDate getBirthDate() {
		return BirthDate;
	}

	public void setBirthdate(LocalDate birthDate) {
		this.BirthDate = birthDate;
	}

	public String displayActorSummary() {
		String str = "*****Actor Summary*****\n";
		str += "-----------------------\n";
		str += actorID + "," + " " + FirstName + " "  + LastName+"," + " " 
				+ (Gender.equalsIgnoreCase("M") ? "Male" : "Female") 
						+"," + " " + "born" + " " + BirthDate;
				
		return str;
	}
	
	

}

	

