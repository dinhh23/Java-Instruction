package business;

public class Vendor {
	private int ID;
	private String Code;
	private String Name;
	private String Address;
	private String City;
	private String State;
	private String Zip;
	private String PhoneNumber;
	private String Email;
	
	public Vendor() {
		super();
	}

	public Vendor(int iD, String code, String name, String address, String city, String state, String zip,
			String phoneNumber, String email) {
		super();
		this.ID = iD;
		this.Code = code;
		this.Name = name;
		this.Address = address;
		this.City = city;
		this.State = state;
		this.Zip = zip;
		this.PhoneNumber = phoneNumber;
		this.Email = email;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		this.ID = iD;
	}

	public String getCode() {
		return Code;
	}

	public void setCode(String code) {
		this.Code = code;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		this.Address = address;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		this.City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		this.State = state;
	}

	public String getZip() {
		return Zip;
	}

	public void setZip(String zip) {
		this.Zip = zip;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.PhoneNumber = phoneNumber;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		this.Email = email;
	}

	@Override
	public String toString() {
		return "Vendor [ID=" + ID + ", Code=" + Code + ", Name=" + Name + ", Address=" + Address + ", City=" + City
				+ ", State=" + State + ", Zip=" + Zip + ", PhoneNumber=" + PhoneNumber + ", Email=" + Email
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	

}
