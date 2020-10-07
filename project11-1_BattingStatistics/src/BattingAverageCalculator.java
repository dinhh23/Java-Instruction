import java.text.NumberFormat;

import ui.console.Console;

public class BattingAverageCalculator {

	private static java.text.NumberFormat number;

	public static void main(String[] args) {
		System.out.println("Welcome to the Batting Average Calculator!!!");
		System.out.println();

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			int totalAtBats = Console.getInt("Enter number of times at bat: ", 1, 31);
			System.out.println("0 = out, 1 = single, 2 = double, 3 = triple, 4 = HOME RUN!!!");

			int[] player = new int[totalAtBats];

			double average = 0;
			int counter = 0;
			int results = 0;
			double slugging = 0;
			double sum = 0;
			
			NumberFormat.getNumberInstance();
			NumberFormat number = NumberFormat.getPercentInstance();
			NumberFormat pct = NumberFormat.getPercentInstance();
			number.setMinimumFractionDigits(3);
			
			for (int i = 0; i < totalAtBats; i++) {
				results = Console.getInt("Result for at bat " + (i + 1) + " :", 0, 5);
				if (results > 0) {
					counter += 1;
					sum += results;
				} else {
					counter += 0;
				}
				results = results + 1;
				average = (double) counter / (double) totalAtBats;
				slugging = sum / (double) totalAtBats;

			}

			System.out.println("Batting average: " + number.format(average));
			System.out.println("Slugging percent: " + number.format(slugging));

			choice = Console.getString("Another Player? ");

			System.out.println("BYEEE!!!");
		}

	}

}
