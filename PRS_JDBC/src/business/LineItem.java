package business;

public class LineItem {
	private int ID;
	private int Quantity;
	
	public LineItem() {
		super();
	}

	public LineItem(int iD, int quantity) {
		super();
		this.ID = iD;
		this.Quantity = quantity;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		this.ID = iD;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		this.Quantity = quantity;
	}

	@Override
	public String toString() {
		return "LineItem [ID=" + ID + ", Quantity=" + Quantity + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
}
