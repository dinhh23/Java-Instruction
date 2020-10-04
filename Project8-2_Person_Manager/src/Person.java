
public class Person {
	private String firstName;
	private String lastName;
	private String ssNumber;
	
	public Person() {
		super();
	}

	public Person(String firstName, String lastName, String ssNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssNumber = ssNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String displayPerson () {
		String str = "You entered a new Customer: ";
		return str;
	}
	
	
	
	
}
