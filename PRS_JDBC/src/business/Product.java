package business;

public class Product {
	private int ID;
	private String PartNumber;
	private String Name;
	private double Price;
	private String Unit;
	private String PhotoPath;
	
	public Product() {
		super();
	}

	public Product(int iD, String partNumber, String name, double price, String unit, String photoPath) {
		super();
		this.ID = iD;
		this.PartNumber = partNumber;
		this.Name = name;
		this.Price = price;
		this.Unit = unit;
		this.PhotoPath = photoPath;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		this.ID = iD;
	}

	public String getPartNumber() {
		return PartNumber;
	}

	public void setPartNumber(String partNumber) {
		this.PartNumber = partNumber;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		this.Price = price;
	}

	public String getUnit() {
		return Unit;
	}

	public void setUnit(String unit) {
		this.Unit = unit;
	}

	public String getPhotoPath() {
		return PhotoPath;
	}

	public void setPhotoPath(String photoPath) {
		this.PhotoPath = photoPath;
	}

	@Override
	public String toString() {
		return "Product [ID=" + ID + ", PartNumber=" + PartNumber + ", Name=" + Name + ", Price=" + Price + ", Unit="
				+ Unit + ", PhotoPath=" + PhotoPath + ", toString()=" + super.toString() + "]";
	}

	
	
	
	
}
