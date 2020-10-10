package ui;

import java.util.*;

import ui.console.Console;

public class PigLatinTranslatorApp {

	private static final Object[] List = null;

	public static void main(String[] args) {
		System.out.println("Welcome to the pig latin translator app!");
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			String line = Console.getLine("Enter a line: ");
			// Rules:
			// 1) Split sentence into words array
			// 2) Change to lower case
			// 3) Don't translate words w/ special symbols or numbers
			// 3b) Remove punctuation at end of each word . , !
			// 4) For each word, move the starting consonants to the end and add 'ay'
			// 4b) If starts with a 'y', move 'y' to end
			
			String[] words = line.split(" ");
			//String[] translation = new String[words.length];
			for (String str: words) {
				str.toLowerCase();
				removePunctuation(str);
				if (isAllLetters(str)) {
					str = translate(str);
				}
				System.out.println(str + " ");
			}
			
			choice = Console.getChoiceString("Another line? ", "y", "n");
		}
		
		
		
		
		System.out.println("Bye");
	}
	
	private static String translate(String str) {
		// starts with:
		// a,e,i,o,u - add 'way' to end
		// y - move y to end, add 'ay' to end
		// consonant - move to end until we reach vowel, then add 'ay'
		String[] vowels = {"a","e","i","o","u"};
		for (String s: vowels) {
			if (str.startsWith(s)) {
				str+="way";
				return str;
			}
		}
		if (str.startsWith("y")) {
			str = str.substring(1)+"y";
			return str;
		}
		char chars[] = str.toCharArray();
		for (int i=0; i<str.length(); i++) {
			char c = chars[i];
			char[] vowels2 = {'a', 'e', 'i', 'o', 'u', 'y'};
			for (int j=0; j< vowels.length; j++) {
				if ((c==vowels2[j])) {
					str = str+"ay";
					return str;
				}
				else {
					str = str.substring(1)+str.substring(0,1);
				}
				str+="ay";
			}

		}
		return str;
	}
	
	private static boolean isAllLetters(String str) {
		boolean allLetters = true;
		char[] chars = str.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			char c = chars[i];
			if (!Character.isLetter(c) && (!(i==(chars.length - 1)))) {
				allLetters = false;
				break;
			}
		}
		
		return allLetters;
	}
	
	private static void removePunctuation(String str) {
		char c = str.charAt(str.length()-1);
		if (c=='.' || c=='!' || c=='?') {
			str = str.substring(0,str.length()-1);
		}
	}
	
	
	
	
	
	
	
	
	
	

}
