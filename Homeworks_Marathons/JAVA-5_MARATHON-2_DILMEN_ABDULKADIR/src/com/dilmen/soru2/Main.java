package com.dilmen.soru2;

public class Main {
	public static void main(String[] args) {
		CustomStringTR cstr = new CustomStringTR("Merhaba");
		System.out.println("1- " + cstr.uzunluk());
		System.out.print("2- ");
		System.out.println( cstr.karakterDizisi());
		System.out.println("2- " + cstr.karakterDizisi());
		System.out.println("3- " + cstr.esittir("Merhaba"));
		System.out.println("3- " + cstr.esittir("merhaba"));
		System.out.println("4- " + cstr.esittirKarakterBoyutuHaric("merhaba"));
		System.out.println("5- " + cstr.buyukHarfYap());
		System.out.println("6- " + cstr.kucukHarfYap());
		System.out.println("7- " + cstr.ileMiBasliyor("Mer"));
		System.out.println("8- " + cstr.ileMiBitiyor("Mer"));
		System.out.println("8- " + cstr.ileMiBitiyor("aba"));
		System.out.println("9- " + cstr.indextekiKarakter(6));
		System.out.println("10-" + cstr.metinIndexi("rh"));


	}
}
