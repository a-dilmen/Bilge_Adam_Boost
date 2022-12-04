package com.dilmen.soru4;

import java.util.HashMap;
import java.util.Map;

public class BusinessYolcu extends Yolcu {

	private boolean isVIP;
	private Map<String, Integer> biletlerB;

	private final int BUSINESSFIYAT = 200;
	private final int BUSINESSVIPFIYAT = 150;

	public BusinessYolcu(int id, String ad, String soyad, boolean isVIP) {
		super(id, ad, soyad);
		this.isVIP = isVIP;
		this.biletlerB = new HashMap<>();
	}

	@Override
	public void yolcuBilgileriniGetir() {
		System.out.println("Yolcu Bilgileri --> Busines Yolcusu "+getAd()+" Biletleri "+biletlerB );

	}

	@Override
	public void biletAl(EFirmaAdi eFirmaAdi) {
		String mesaj = "";
		int biletFiyatı;
		if (isVIP()) {
			biletFiyatı = BUSINESSFIYAT + BUSINESSVIPFIYAT + getBASEFIYAT();
			biletlerB.put(eFirmaAdi.toString(), biletFiyatı);
			mesaj = getAd() + " Adlı  yolcu " + eFirmaAdi.toString() + " için VIP bilet alınmıştır Biletleriniz -->"
					+ biletlerB;
		} else {
			biletFiyatı = BUSINESSFIYAT + getBASEFIYAT();
			biletlerB.put(eFirmaAdi.toString(), biletFiyatı);
			mesaj = getAd() + " Adlı  yolcu " + eFirmaAdi.toString() + " için bilet alınmıştır Biletleriniz -->"
					+ biletlerB;
		}
		int sayi = (int)(Math.random()*biletNumaraları.size());
		setKoltukNo(biletNumaraları.get(sayi));
		biletNumaraları.remove(sayi);
		System.out.println(mesaj);
	}

	@Override
	public void checkInYap() {
		if (isCheckIn()) {
			System.out.println(getAd() + " için chekin zaten yapılmıştır uçağa binebilirsiniz");
		} else {
			System.out.println("Checkin yapılmıştır iyi uçuşlar");
			setCheckIn(true);
		}

	}

	@Override
	public void ucagaBin() {
		if (!isCheckIn()) {
			System.out.println("Uçağa binmek için önce checkin yapınız");
		} else
			System.out.println(getAd() + " "+ getKoltukNo() + " numaralı koltukda uçağa binebilirsiniz");

	}

	public boolean isVIP() {
		return isVIP;
	}

	public void setVIP(boolean isBusiness) {
		this.isVIP = isBusiness;
	}

	public Map<String, Integer> getBiletler() {
		return biletlerB;
	}
}
