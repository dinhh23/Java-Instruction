

public class ProductManagerAPP {
	
	public static void main(String[] args) {
		System.out.println("Hello");
		
		// p.263 - demonstrate toString() method
		Product p1 = new Product("java", "Murach's Java Programming", 57.50);
		
		System.out.println(p1.toString());
		System.out.println(p1);
		
		Book b1 = new Book("mySql", "Murach's MySql", 54.50, "Joel Murach");
		System.out.println(b1);
		
		// p.269
		Software s1 = new Software("eclipse", "STS Eclipse", 0.0, "4.6.1.RELEASE");
		System.out.println(s1);
		
		// p.260 - code that uses overridden methods 
		Product p2 = s1;
		System.out.println("p2 toString...");
		System.out.println(p2);
		s1.getVersion();
		//p2.getVerison; don't do this
		
		//p.279
		if (p2 instanceof Book) {
			System.out.println("p2 is a book!");
		}
		else if (p2 instanceof Soft);
		
				
		System.out.println("Bye");
	}

}
