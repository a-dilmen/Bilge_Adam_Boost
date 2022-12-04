package com.dilmen.soru3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

public class HayvanatBahcesi {
	Map<String, Hayvan> hayvanlar = new HashMap<>();
	Set<String> hayvanAdlari = new HashSet<>();

	public void bahceyeMemeliHayvanEkle(MemeliHayvan memeliHayvan) {
		if (ayniİsimdeBaskaHayvanVarmi(memeliHayvan)) {
			System.out.println("Aynı isimli bir hayvan mevcut hayvanat bahçesine eklenemedi");
		} else {
			hayvanlar.put(memeliHayvan.getAd(), memeliHayvan);
		}
	}

	public void bahceyeSurungenEkle(Surungen surungen) {
		if (ayniİsimdeBaskaHayvanVarmi(surungen)) {
			System.out.println("Aynı isimli bir hayvan mevcut hayvanat bahçesine eklenemedi");
		} else {
			hayvanlar.put(surungen.getAd(), surungen);
		}
	}

	public void hayvanSesCikarsin(Hayvan hayvan) {
		hayvan.sesCikar();
	}

	public void hayvaninCinsiniBul(String ad) {
		String message = "";
		if (hayvanlar.get(ad) != null) {
			message = hayvanlar.get(ad).getAd() + " bir " + hayvanlar.get(ad).getUstSinifAdi();
		} else
			message = ad + " isimli hayvan Hayvanat Bahçesinde yok";
		System.out.println(message);

	}

	public void hayvanBilgileriniYazdir(String hayvanAdi) {
		if (hayvanlar.get(hayvanAdi) != null)
			System.out.println(hayvanlar.get(hayvanAdi));
		else
			System.out.println(hayvanAdi + " isminde bir hayvan Hayvanat Bahçesinde yok");
	}

	public void hayvaniHareketEttir(String ad) {
		if (hayvanlar.get(ad).getSinifAdi().equalsIgnoreCase("aslan")) {
			Aslan tempA = (Aslan) hayvanlar.get(ad);
			tempA.yuru();
		} else if (hayvanlar.get(ad).getSinifAdi().equalsIgnoreCase("yilan")) {
			Yilan tempA = (Yilan) hayvanlar.get(ad);
			tempA.surun();
		} else if (hayvanlar.get(ad).getSinifAdi().equalsIgnoreCase("kertenkele")) {
			Kertenkele tempA = (Kertenkele) hayvanlar.get(ad);
			tempA.surun();
		} else if (hayvanlar.get(ad).getSinifAdi().equalsIgnoreCase("maymun")) {
			Maymun tempA = (Maymun) hayvanlar.get(ad);
			tempA.yuru();
		}

	}

	public boolean ayniİsimdeBaskaHayvanVarmi(Hayvan hayvan) {
		boolean isAnyWithSameName = !hayvanAdlari.add(hayvan.getAd());
		boolean isAnyWithSameName2 = hayvanlar.containsKey(hayvan);
		boolean isAnyWithSameName3 = hayvanlar.containsValue(hayvan);
//		return isAnyWithSameName;
		return isAnyWithSameName2;
//		return isAnyWithSameName3;
	}

}
