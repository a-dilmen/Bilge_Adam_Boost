package com.dilmen.soru4;

public class Sedan implements IOtomobil{

	public Sedan() {
		super();
		banzinTankıEkle();
		tekerlekEkle();
		motorEkle();
	}

	@Override
	public void banzinTankıEkle() {
		System.out.println("50 litre benzin tankı eklendi");
		
	}

	@Override
	public void tekerlekEkle() {
		System.out.println("15\" Bridgestone 4 adet lastik eklendi");
	}

	@Override
	public void motorEkle() {
		System.out.println("1.5 benzin motor eklendi");
		
	}

}
