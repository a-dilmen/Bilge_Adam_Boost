package com.dilmen.soru4;



public class Jeep implements IOtomobil {

	public Jeep() {
		super();
		banzinTankıEkle();
		tekerlekEkle();
		motorEkle();
	}

	@Override
	public void banzinTankıEkle() {
		System.out.println("60 litre dizel tankı eklendi");
		
	}

	@Override
	public void tekerlekEkle() {
		System.out.println("19\" Lassa 4 adet lastik eklendi");
		
	}

	@Override
	public void motorEkle() {
		System.out.println("2.0 TDS motor eklendi");
		
	}

}
