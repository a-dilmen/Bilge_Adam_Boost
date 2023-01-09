package com.dilmen.soru4;

// Factory design pattern is implemented for automobile objects that implements IOtomobil interface
public class OtomobilFactory {
	public IOtomobil createOtomobil(EOtomobil otomobilType) {
		switch (otomobilType) {
		case HATCHBACK:
			return new HatchBack();
		case SEDAN:
			return new Sedan();
		case JEEP:
			return new Jeep();
		default:
			break;
		}
		return null;
	}
}
