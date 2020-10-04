// p. 274
public class Software extends Product {
	
	private String version;

	public Software() {
		super();
	}

	public Software(String code, String description, double price, String verison) {
		super(code, description, price);
		this.version = verison;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Software [version=" + version + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
