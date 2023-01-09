package com.dilmen.soru4;

public class Main {
	public static void main(String[] args) {

		// Singleton design pattern OtomobilFactory implementation only 1
		// otomobilFactory object can be created
		OtomobilFactory otomobilFactory = Singleton.getOtomobilFactory();

		// Factory design pattern is implemented for automobile objects that implements
		// IOtomobil interface otomobil factory is used create otomobil objects
		otomobilFactory.createOtomobil(EOtomobil.JEEP);
		otomobilFactory.createOtomobil(EOtomobil.HATCHBACK);
		otomobilFactory.createOtomobil(EOtomobil.SEDAN);

	}

}
