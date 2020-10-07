
public class Employee extends Person implements Printable, DepartmentConstants {
	private String ssn;
	private int department;

	public Employee() {
		super();
	}

	public Employee(String firstName, String lastName, String ssn, int dept) {
		super(firstName, lastName);
		this.ssn = ssn;
		this.department = dept;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return super.toString()+"\n"+"SSN:   XXX-XX-"+ssn.substring(7);
	}

	// return firstName lastName (deptDescription)
	@Override
	public void print() {
		String dept = "Unknown";
		if (department == ADMIN) {
			dept = "Adminstration";
		}
		else if (department == EDITORIAL) {
			dept = "Editorial";
		}
		else if (department == MARKETING) {
		}	
			
		System.out.println(firstName + " " + lastName + "("+dept+")");	
		}
	}
	
	
	
	
