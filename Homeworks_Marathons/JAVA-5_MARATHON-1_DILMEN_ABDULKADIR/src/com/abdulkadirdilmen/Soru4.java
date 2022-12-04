package com.abdulkadirdilmen;

import java.util.Scanner;

public class Soru4 {
	// scanner creation to reuse in every method that uses scanner
	static Scanner scanner = new Scanner(System.in);
	// PI initialization to reuse pi value as constant in every method that uses pi
	static final double PI = Math.PI;

	public static void main(String[] args) {
		geometrikHesaplayıcı();
	}
	//kullanıcı girdisine göre hesaplama metodunu çağıran geometrikHesaplayıcı() metodu 
	private static void geometrikHesaplayıcı() {
		int number;
		do {
			//Hesaplayıcı giriş ekranı, her işlem sonunda tekrar çağrılıyor
			System.out.println("* * * * * * * * * * ** * * * * * * *");
			System.out.println("* \t Geometrik Hesaplayıcı \t *");
			System.out.println("* * * * * * * * * * ** * * * * * * *");
			System.out.println("1. Kare alan hesaplama");
			System.out.println("2. Kare çevre hesaplama");
			System.out.println("3. Dikdörtgen alan hesaplama");
			System.out.println("4. Dikdörtgen çevre hesaplama");
			System.out.println("5. Daire alan hesaplama");
			System.out.println("6. Daire Çevre hesaplama");
			System.out.println("7. Çıkış");
			//kullanıcı girdisi formatlama
			number = Integer.parseInt(String.valueOf(scanner.nextLine().trim().charAt(0)));
			//işleme karar verme
			switch (number) {
			case 1:
				//metodu çağırma
				kareAlan();
				break;
			case 2:
				kareCevre();
				break;
			case 3:
				dikdortgenAlan();
				break;
			case 4:
				dikdortgenCevre();
				break;
			case 5:
				daireAlan();
				break;
			case 6:
				daireCevre();
				break;
			case 7:
				break;
			default:
				System.out.println("-------------------------------------");
				System.out.println("İşlem girdinizi kontrol edin");
				System.out.println("-------------------------------------");
				break;

			}

		} while (number != 7);
		System.out.println("-------------------------------------");
		System.out.println("Programdan çıkıldı.");
		System.out.println("-------------------------------------");

	}
	// kare alanını hesaplayıp yazdıran metot 
	private static void kareAlan() {
		System.out.println("Alan Hesabı için karenin bir kenarının uzunluğunu giriniz");
		double edge = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("------------------------------------");
		System.out.println("Karenin alanı = " + edge * edge);
		System.out.println("-------------------------------------");
	}

	private static void kareCevre() {
		System.out.println("Çevre hesabı için karenin bir kenarının uzunluğunu giriniz");
		double edge = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("------------------------------------");
		System.out.println("Karenin çevresi = " + 4 * edge);
		System.out.println("------------------------------------");
	}

	private static void dikdortgenAlan() {
		System.out.println("Alan hesabı için dikdörtgenin bir kenarının uzunluğunu giriniz");
		double edge = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Alan hesabı için dikdörtgenin diğer kenarının uzunluğunu giriniz");
		double edge2 = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("------------------------------------");
		System.out.println("Dikdörtgenin alanı = " + edge * edge2);
		System.out.println("------------------------------------");

	}

	private static void dikdortgenCevre() {
		System.out.println("Çevre hesabı için dikdörtgenin bir kenarının uzunluğunu giriniz");
		double edge = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Çevre hesabı için dikdörtgenin diğer kenarının uzunluğunu giriniz");
		double edge2 = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("------------------------------------");
		System.out.println("Dikdörtgenin çevresi = " + 2 * (edge + edge2));
		System.out.println("------------------------------------");

	}

	private static void daireAlan() {
		System.out.println("Alan Hesabı için dairenin yarıçap uzunluğunu giriniz");
		double radius = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("------------------------------------");
		System.out.println("Dairenin alanı = " + PI * radius * radius);
		System.out.println("-------------------------------------");
	}

	private static void daireCevre() {
		System.out.println("Çevre hesabı için dairenin yarıçap uzunluğunu giriniz");
		double radius = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("------------------------------------");
		System.out.println("Dairenin çevresi = " + 2 * PI * radius);
		System.out.println("-------------------------------------");

	}

}
