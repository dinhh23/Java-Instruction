import java.text.NumberFormat;

public class NumberFormatApp {

	public static void main(String[] args) {
		// page 105 from book 
		double astonMartinPrice = 245689.23;
		double interestPct = .035457;
		
		NumberFormat currency = NumberFormat.getCurrencyInstance(); // add number sign
		NumberFormat pct = NumberFormat.getPercentInstance();  // add percent sign and rounded 
		pct.setMaximumFractionDigits(2); // 2 decimal places and rounded
		
		System.out.println("Car finance info:");
		System.out.println("Price:\t\t"+currency.format(astonMartinPrice));
		System.out.println("Interest:\t"+pct.format(interestPct));
		
	}

}
