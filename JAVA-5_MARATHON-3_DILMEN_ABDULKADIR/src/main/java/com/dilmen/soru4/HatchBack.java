package com.dilmen.soru4;

public class HatchBack implements IOtomobil{

	public HatchBack() {
		super();
		banzinTankıEkle();
		tekerlekEkle();
		motorEkle();
	}

	@Override
	public void banzinTankıEkle() {
		System.out.println("47 litre dizel tankı eklendi");
		
	}

	@Override
	public void tekerlekEkle() {
		System.out.println("15\" Continental 4 adet lastik eklendi");
		
	}

	@Override
	public void motorEkle() {
		System.out.println("0.9 TDI motor eklendi");
		
	}

}
