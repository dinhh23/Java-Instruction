package business;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Actor {
	// Instance Variables 
	private int actorID;
	private String FirstName;
	private String LastName;
	private String Gender;
	private LocalDate Birthdate;
	
	//Empty Constructor 
	public Actor() {
		super();
		
	}
	
	public Actor(int actorID, String firstName, String lastName, String gender, String Birthdate) {
		super();
		this.actorID = actorID;
		this.FirstName = firstName;
		this.LastName = lastName;
		this.Gender = gender;
		this.Birthdate = dateConverter(Birthdate);
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

	public LocalDate getBirthdate(LocalDate birthDate) {
		return Birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.Birthdate = birthdate;
	}

	public String displayActorSummary() {
		String str = "*****Actor Summary*****\n";
		str += "-----------------------\n";
		str += actorID + "," + " " + FirstName + " "  + LastName+"," + " " 
				+ (Gender.equalsIgnoreCase("M") ? "Male" : "Female") 
						+"," + " " + "born" + " " + Birthdate;
				
		return str;
	}
	
	private static LocalDate dateConverter(String birthDate) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
		dtf = dtf.withLocale(Locale.US);
		LocalDate date = LocalDate.parse(birthDate, dtf);
		return date;
	}

}

	

