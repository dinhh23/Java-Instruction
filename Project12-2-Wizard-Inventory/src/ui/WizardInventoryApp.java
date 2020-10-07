package ui;

import java.util.ArrayList;
import java.util.Scanner;

import ui.console.Console;

public class WizardInventoryApp {

		public static void main(String[] args) {
			System.out.println("The Wizard Inventory Game!!!");
			System.out.println();
			
			String command = "";
			while (!command.equalsIgnoreCase("exit")) {
				System.out.println("Command Menu");
				System.out.println("show - Show all items");
				System.out.println("grab - Grab an item");
				System.out.println("edit - Edit an item");
				System.out.println("drop - Drop an item");
				System.out.println("exit - Exit program");
				System.out.println();
				command = Console.getString("Command: ");
				System.out.println();

				switch (command) {
				case "show":
				// User Input
					ArrayList<String> codes = new ArrayList<>();
					codes.add("java");
					codes.add("jsp");
					codes.add("mysql");
					for (String s : codes) {
						System.out.println(s);
					}
					
				// Display Output
					
					
					break;

				case "grab":
				// User Input
					
				// Display Output
					
					break;
					
				case "edit":
				// user input 
					
				// display output 
					
					break;
				case "drop":
				// user input 
					
				// display output 
					
					break;
					
				case "exit":
					break;
					
				default:
					System.out.println("Invalid Entry!");
					System.out.println();
					break;
				}
			}
			
			System.out.print("Bye!");
		}
	}
