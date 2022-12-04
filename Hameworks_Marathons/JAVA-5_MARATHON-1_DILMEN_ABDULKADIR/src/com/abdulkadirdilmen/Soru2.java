package com.abdulkadirdilmen;

import java.util.Scanner;

public class Soru2 {

	public static void main(String[] args) {

		// Örnek kullanım 1
		int sayiDizisi[] = { 9, 7, 5, 3, 7, 1, 4,2,3,9,7, 3, 18, 2, 0, 7 };
		
		// Örnek kullanım 2
//		int sayiDizisi[] = { 0, 1, 5, 3 };
		
//		Soru2 soru2 = new Soru2();
//		int[] sayiDizisi = soru2.inputArray();
		repeatingNumber(sayiDizisi);

		
	}

	private static void repeatingNumber(int[] intAray) {
		// initializing the number and control parameter index
		int sayi = -1, index = -1;
		// looping thru input array to check repetition
		for (int i = 0; i < intAray.length; i++) {
			for (int j = 0; j < intAray.length; j++) {
				// in the first encounter with repetition ending inner loop and assigning values
				if (i != j && intAray[i] == intAray[j]) {
					sayi = intAray[i];
					index = i;
					break;
				}
			}
			// checking to break outer loop
			if (index > -1)
				break;
		}
		// checking for output
		if (index == -1) {
			System.out.println("Tekrar eden sayı bulunamamıştır.");
			return;
		} else {
			// finding number of repetition
			int repetition = 1;
			for (int i = index + 1; i < intAray.length; i++) {
				if (intAray[index] == intAray[i]) {
					repetition++;
				}
			}
			System.out.println(sayi + " sayisi " + repetition + " kez tekrar ediyor.");
		}

	}
	//additional method for user input
	private int[] inputArray() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen kaç adet sayı girmek istediğinizi giriniz: ");
		int arrayLength = scanner.nextInt();
		System.out.println("Bir sayı girip enter a basınız:  ");
		int[] sayiDizisi = new int[arrayLength];
		for (int i = 0; i < sayiDizisi.length; i++) {
			sayiDizisi[i] = scanner.nextInt();
		}
		return sayiDizisi;

	}

}
