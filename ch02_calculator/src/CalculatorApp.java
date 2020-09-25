
public class CalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Calculator App!!!");
		
		// this simple app will add 2 numbers
		
		int n1 = 5;
		int n2 = 25;
		
		int sum = n1 + n2;
		
		System.out.println("The sum is "+sum);
		
		// do more math! \
		double d1 = 25.5;
		double d2 = 5.0;
		
		System.out.println("The difference is "+(d1 - d2));
		System.out.println("The product is "+(d1 * d2));
		System.out.println("The quotient is "+(d2 / d1));
		
		// this doesnt work! [int sum = n1 + d1;]
		
		// change sum2 to double 
		double sum2 = n1 + d1;
		
		// cast d1 as an int
		sum = n1 + (int)d1;
		
		//declare a counter variable 
		int i = 0;
		// add 1 
		i = i + 1;
		i = i + 1;
		
		System.out.println(i);
	
		
		
		
		System.out.println("Byeee!!!");

	}

}
