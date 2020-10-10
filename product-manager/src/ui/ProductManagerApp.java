package ui;

import java.util.List;

import business.Product;
import db.DAO;
import db.ProductTextFile;
import ui.console.Console;

public class ProductManagerApp {
	private static DAO<Product> productDAO = new ProductTextFile();

	public static void main(String[] args) {
		System.out.println("Welcome to the Product Manager");
		
		int command = 0;
		while (!(command==9)) {
			System.out.println("MENU");
			System.out.println("1 - List All Products");
			System.out.println("2 - Add A Products");
			System.out.println("3 - Delete A Product");
			System.out.println("9 - Exit");
			System.out.println();
			command = Console.getInt("Command?: ", 0, 10);
			switch (command) {
			
			case 1:
				// list all products 
				List<Product> products = productDAO.getALL();
				for (Product p: products) {
					System.out.println(p);
				}
				System.out.println();
				break;
				
			case 2:
				// add a product 
				System.out.println("Add a product:");
				String code = Console.getRequiredString("Code? ");
				String description = Console.getRequiredString("Description? ");
				double price = Console.getDouble("Price? ");
				Product p = new Product(code,description,price);
				if (productDAO.add(p)) {
					System.out.println("Product added successfully!");
				}
				else {
					System.out.println("Issue adding product");
				}
				System.out.println();
				break;
				
			case 3:
				// delete a product
				System.out.println("Delete A Product: ");
				String code1 = Console.getString("Enter product code to delete: ");
				Product p1 = productDAO.get(code);
				if (productDAO.delete(p1)) {
					System.out.println("Product deleted successfully!");
				}
				else {
					System.out.println("Issue deleting product");
				}
				System.out.println();
				break;
				
			case 9:
				break;
				
				
			}
			
		}
		
		
		
		System.out.println("Bye");

	}

}
