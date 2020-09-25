
public class mathclassApp {

	public static void main(String[] args) {
		// page 103 in the book 
		long result1 = Math.round(1.667);
		System.out.println(result1);    // result 2 rounded to whole number
		
		int result2 = Math.round(1.49F);  // result 1
		System.out.println(result2);
		
		int result3 = (int)Math.round(1.667);  //result 2 converting to an int
		System.out.println(result3);
		
		// rounding to a 100th decimal value
		double x = 10.315;
		System.out.println(x);
		x = (double)Math.round(x*100) / 100;    // round to 2 decimal place
		System.out.println(x);
		x = (double)Math.round(x*10) / 10;      // round to 1 decimal place
		System.out.println(x);
		
		System.out.println("Generate some random #s...");
		double r = Math.random();
		System.out.println(r);
		r = Math.random()*10;
		System.out.println(r);
		// generate a roll of a die, between 1-6
		int die = (int)(Math.random()*6)+1;
		System.out.println("die roll is: "+die);
		
		
		}
}

