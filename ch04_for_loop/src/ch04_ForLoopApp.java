
public class ch04_ForLoopApp {

	public static void main(String[] args) {
		// p. 139 
		
		String numbers = "";
		
		// for this condition run this code 
		// increment is int i = 0
		// boolean expression is i < 20
		// boolean expression is false i++ 
		for (int i = 0; i < 20; i++) {
			numbers += i + " ";
		}
		
		System.out.println(numbers);

	}

}
