package com.abdulkadirdilmen;

//import java.util.Scanner;

public class Soru3 {

	public static void main(String[] args) {
		String string = "Bugün güzel bir gün";
		char character = 'g';
		karakterSayici(string, character);
		
//		//alternative with user defined string and char
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Please enter your string");
//		String string = scanner.nextLine();
//		System.out.println("Please enter your character");
//		char character = scanner.nextLine().charAt(0);
//		karakterSayici(string, character);
//		System.out.println(karakterSayiciInt(string, character));
	}

	private static void karakterSayici(String string, char character) {
		int number = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == character) {
				number++;
			}
		}
		System.out.println(number);
	}

	
	
	// solution with return type integer
//	private static int karakterSayiciInt(String string, char character) {
//		int number = 0;
//		for (int i = 0; i < string.length(); i++) {
//			if (string.charAt(i) == character) {
//				number++;
//			}
//		}
//		return number;
//	}



	// alternative with additional check that avoids looping for non-existing in the string
	// condition
//	boolean exists = string.contains(String.valueOf(character));
//	int number = 0;
//	if (exists == false)
//		return number;
//	else {
//	 		//alternative solution that works for no consecutive character as delimiter
////	String[] stringArray = string.split(String.valueOf(character));
////	number = stringArray.length-1;
//		for (int i = 0; i < string.length(); i++) {
//			if (string.charAt(i) == character) {
//				number++;
//			}
//		}
//	}
}
