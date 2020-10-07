public class ProductManagerApp {

	public static void main(String[] args) {
		System.out.println("hello");
		
		//p. 263 - demonstrate toString() method
		Product p1 = new Product("java", "Murach's Java Programming",57.50);
		
		System.out.println(p1.toString());
		System.out.println(p1);
		
		Book b1 = new Book("mySql", "Murach's MySql", 54.50, "Joel Murach");
		System.out.println(b1);
		
		//p. 269
		Software s1 = new Software("eclipse", "STS Eclipse",0.0,"4.6.1.RELEASE");
		System.out.println(s1);
		
		// p. 269 - code that uses overridden methods
		Product p2 = s1;
		System.out.println("p2 toString...");
		System.out.println(p2);
		s1.getVersion();
		//p2.getVersion();  can't do this!
		
		//p. 279
		if (p2 instanceof Book) {
			System.out.println("p2 is a book!");
		}
		else if (p2 instanceof Software) {
			System.out.println("ps is software!");
		}
		Software s2 = new Software("eclipse", "STS Eclipse",0.0,"4.6.1.RELEASE");
		System.out.println("====   p. 279 stuff ====");
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		
		if (s1==s2) {
			System.out.println("s1 is same as s2");
		}
		else if (s1.equals(s2)) {
			System.out.println("s1 and s2 have the same values");
		}
		else {
			System.out.println("s1 and s2 must not have the same values??");
		}
		
		Software s3 = new Software ("netbeans", "NetBeans", 0, "v2");

		if (s2.equals(s3)) {
			System.out.println("s2 and s3 have same values");
		}
		else {
			System.out.println("s2 and s3 have DIFFERENT values");
		}
			
		
		System.out.println("bye");
	}

}
