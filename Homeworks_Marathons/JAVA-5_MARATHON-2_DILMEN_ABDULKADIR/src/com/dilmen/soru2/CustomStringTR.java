package com.dilmen.soru2;

public class CustomStringTR {
	private String string;
	
	
	public CustomStringTR(String string) {
		super();
		this.string = string;
	}

	// 10 adet string methodu Customize edildi
	public int uzunluk() {
		int uzunluk = string.length();
		return uzunluk;
	}
	public char[] karakterDizisi() {
		char[] dizi = string.toCharArray();
		return dizi;
	}
	public String kucukHarfYap() {
		String kucuk = string.toLowerCase();
		return kucuk;
	}
	public String buyukHarfYap() {
		String buyuk = string.toUpperCase();
		return buyuk;
	}
	public boolean esittir(String test) {
		boolean isE = string.equals(test);
		return isE;
	}
	public boolean esittirKarakterBoyutuHaric(String test) {
		boolean isEIC = string.equalsIgnoreCase(test);
		return isEIC;
	}
	public char indextekiKarakter(int index) {
		char c = string.charAt(index);
		return c;
	}
	public boolean ileMiBitiyor(String test) {
		boolean isB = string.endsWith(test);
		return isB;
	}
	public boolean ileMiBasliyor(String test) {
		boolean isBa = string.startsWith(test);
		return isBa;
	}
	public int metinIndexi(String test) {
		int index = string.indexOf(test);
		return index;
	}
	
	
	
	
	
	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}
}
