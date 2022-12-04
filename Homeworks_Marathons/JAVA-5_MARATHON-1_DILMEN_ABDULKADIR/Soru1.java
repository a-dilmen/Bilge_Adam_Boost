package com.abdulkadirdilmen;

import java.util.Scanner;

public class Soru1 {

	public static void main(String[] args) {
		yildizYazici();
		//printStars();

	}
	public static void yildizYazici(){
		String string = "";
		String string2 = "";
		//4 adet 7*("* ")
		for (int i = 0; i < (7+1)/2; i++) {
			for (int j = 0; j< 7; j++) {
				string+="* ";
			}						//sona eklenen boşluğu silme için substring
			System.out.println(string.substring(0,(2*7-1)));
			//sonraki for döngüsünde kullanmak için yeni stringe 7*("* ") değeri atama
			string2 = string;
			string = "";
		}
		for (int i = 14; i > 1 ;i-=2) {
			System.out.println(string2.substring(0,i-1));
		}
		
	}
	
	//interactive method that prints w.r.t. user input number  
	public static void printStars() {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		StringBuilder builder = new StringBuilder();
		builder.append("");
		for (int i = 0; i < (number+1)/2; i++) {
			for (int j = 0; j< number; j++) {
				builder.append("* ");
			}
			builder.setLength(2*number);
			System.out.println(builder);
		}
		for (int i = builder.length(); i > 1 ;i-=2) {
			System.out.println(builder.deleteCharAt(i-1).deleteCharAt(i-2));
		}		
	}

}
