
import java.text.NumberFormat;

// p. 211
// JavaBeans. It is a true POJO (Plain Old Java Object)

public class Product implements Comparable {
	// fields / instance variables 
	private String code;
	private String description;
	private double price;

	// constructor - empty/default constructor  
	public Product() {
		
	}
	
	// constructor - fully loaded constructor 
	public Product(String code, String description, double price) {
		super();
		this.code = code;
		this.description = description;
		this.price = price;
	}
	
	// getter method 
	public String getCode() {
		return code;
	}
	
	// setter method 
	public void setCode(String inCode) {
		code = inCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getPriceFormatted() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(price);
	}

	// generate toString
	@Override 
	public String toString() {
		return "Product [code=" + code + ", description=" + description + ", price =" + getPriceFormatted()
				+ "]";
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Product) {
			Product p = (Product)o;
			return code.compareTo(p.getCode());
		}
		return 0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
