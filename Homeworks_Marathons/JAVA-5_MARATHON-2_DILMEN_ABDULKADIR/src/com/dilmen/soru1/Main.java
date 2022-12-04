package com.dilmen.soru1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
//	 Sorudaki rehber.txt dosyası testler için eklenmiştir.
//	 Hızlı sonuç için hashmap ile rehberi tuttum
//	 Hızlı okuma için Buffer reader kullandım
//	 Kullanıcı girdisini İsim ve Soyisim ilk harfleri büyük ve diğerleri küçük
//		 olacak şekilde verileri tutuğumuz varsayımı ile formatladım.
//	 isim : Ali Kaya , soyisim : "" durumunda hatalı giriş kabul edip sonuc
//		 vermemdim (isim soyisim min 2 char)
//	 dosyayiOkuVeYaz()
//	 girdiyiFormatla()
//	 anahtarDeğeriniYazdır()

	static HashMap<String, String> rehber = new HashMap<>(); // Hızlı sonuç için hashmap
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Main main = new Main();
		// dosyayiOkuVeYaz()
		main.dosyayiHizliOkuVeRehberMapiGüncelle();
		// girdiyiFormatla()
		String key = main.anahtarIsimSoyisimAlipFormatlama(); 
		// anahtarDeğeriniYazdır()
		main.arananNumarayıVeYaHatayiYazdirma(key);

	}

	public void dosyayiHizliOkuVeRehberMapiGüncelle() {
 
		Main main = new Main();
		String path = "rehber.txt";
//		System.out.println("Lütfen dosya adını ve ya youlunu giriniz");
//		path = scanner.nextLine(); // add while until file is found etc.

		try (BufferedReader reader = new BufferedReader(new FileReader(path))) {

			String s = null;
			while ((s = reader.readLine()) != null) {
				rehber.put(main.rehberIcinMetinFormatlama(s)[0], main.rehberIcinMetinFormatlama(s)[1]);
			}

		} catch (FileNotFoundException e) {
			System.out.println("Girdiğiniz dosya aadı ve ya yolunu kontrol ediniz (FileNotFoundException)");
		} catch (IOException e) {
			System.out.println("IOException");
		}
	}

	public String[] rehberIcinMetinFormatlama(String string) {
		String[] strTemp = string.split(";");
		String[] str = { strTemp[0].trim(), strTemp[2].trim() };
		return str;
	}

	public String anahtarIsimSoyisimAlipFormatlama() {
		System.out.print("Lütfen telefonunu aradığınız kişinin adını giriniz: ");
		String adi = scanner.nextLine().trim();
		System.out.print("Lütfen telefonunu aradığınız kişinin soyadını giriniz: ");
		String soyadi = scanner.nextLine().trim();
		// isim ve soyisim ilk harfler büyük olacak şekilde yazdırmak için formatlama
		String key = "";
		try {
			key = adi.substring(0, 1).toUpperCase() + adi.substring(1).toLowerCase() + " "
					+ soyadi.substring(0, 1).toUpperCase() + soyadi.substring(1).toLowerCase();
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("İsim ve ya soyisim en az iki karakter içermelidir");
		}

		return key;
	}

	public void arananNumarayıVeYaHatayiYazdirma(String key) {
		if (null == rehber.get(key)) {
			System.out.println("Aradığınız kişi rehberde kayıtlı değil!");
		} else {
			System.out.println(key + " isimli kişinin telefon numarası: " + rehber.get(key));
		}
	}

}
