package com.dilmen.soru4;

import java.util.HashMap;
import java.util.Map;

public class EkonomiYolcu extends Yolcu {
	private Map<String, Integer> biletlerE;
	private final int EKONOMIFIYAT = 100;

	public EkonomiYolcu(int id, String ad, String soyad) {
		super(id, ad, soyad);
		this.biletlerE = new HashMap<>();
	}

	@Override
	public void yolcuBilgileriniGetir() {
		System.out.println("Yolcu Bilgileri --> Ekonomi Yolcusu "+getAd()+" Biletleri "+biletlerE );

	}

	@Override
	public void biletAl(EFirmaAdi eFirmaAdi) {
		String mesaj = "";
		int biletFiyatı = EKONOMIFIYAT + getBASEFIYAT();
		
		if (biletlerE.containsKey(eFirmaAdi.toString())) {
			biletlerE.put(eFirmaAdi.toString(), biletlerE.get(eFirmaAdi.toString())+biletFiyatı);
			mesaj = eFirmaAdi.toString() + " Adlı firmadan bir bilet daha alınmıştır biletleriniz-->" + biletlerE;
		} else {
			biletlerE.put(eFirmaAdi.toString(), biletFiyatı);
			mesaj = getAd() + " Adlı  yolcu " + eFirmaAdi.toString()
					+ " için Ekonomi sınıfından bilet alınmıştır Biletleriniz -->" + biletlerE;
		}
		setKoltukNo(biletNumaraları.get((int) (Math.random() * biletNumaraları.size())));
		biletNumaraları.remove((int) (Math.random() * biletNumaraları.size()));
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

	public Map<String, Integer> getBiletler() {
		return biletlerE;
	}
}
