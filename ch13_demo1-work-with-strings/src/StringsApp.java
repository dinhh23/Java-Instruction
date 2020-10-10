
public class StringsApp {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		String name = "Eddie Van Halen";
		System.out.println(name + " is "+name.length()+ " characters long.");
		int index1 = name.indexOf(" ");
		System.out.println(index1);
		int index2 = name.indexOf(" ",6);
		System.out.println(index2);
		String fName = name.substring(0,index1);
		String mName = name.substring(index1 + 1,index2);
		String lName = name.substring(index2+1);
		System.out.println("fName = "+fName);
		System.out.println("mName = "+mName);
		System.out.println("lName = "+lName);
				
		String name1 = "Bob Marley        ";
		name1 = name1.trim();
		System.out.println(name1+".");
		String bob = name1.substring(0,3);
		System.out.println("first name = "+bob);
		
		name1 = name1.replace(" ", "-");
		System.out.println(name1);
		
		String sentence = "Is it lunch time yet?";
		String[] words = sentence.split(" ");
		for (String s: words) {
			System.out.println(s);
		}
		
		StringBuilder sentence1  = new StringBuilder();
		sentence1.append("Hello ");
		sentence1.append("how ");
		sentence1.append("are ");
		sentence1.append("you? ");
		System.out.println(sentence1);
		System.out.println("capacity = "+sentence1.capacity());
		System.out.println("length = "+sentence1.length());
		
		sentence1.insert(6,"Dolly ");
		System.out.println(sentence1);
		
		
		
		
		
		
		System.out.println("Bye");

	}

}
