package ui;

import ui.console.Starter_Console;

public class ConsoleLibraryDemoApp {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		String str = Starter_Console.getLine("Enter a sentence: ");
		
		int n = Starter_Console.getInt("Enter a # between 1 and 10: ", 1,10);
		
		System.out.println(str);
		System.out.println(n);
		
		System.out.println("Bye");

	}

}
