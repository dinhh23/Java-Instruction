import java.util.ArrayList;

public class ProductCollectionApp {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		ArrayList<Product> products = new ArrayList<>();
		products.add(new Product("java", "Murach's Java", 57.50));
		products.add(new Product("andr", "Murach's Android", 59.50));
		products.add(new Product("mysql", "Murach's MySQL", 57.50));
		
		String code = "andr";
		
		for (Product p: products) {
			if(p.getCode().equalsIgnoreCase(code)) {
				System.out.println("Product Found: "+p.toString());
				System.out.println("Index Position: "+products.indexOf(p));
			}
		}
		
		System.out.println("Bye");

	}

}
