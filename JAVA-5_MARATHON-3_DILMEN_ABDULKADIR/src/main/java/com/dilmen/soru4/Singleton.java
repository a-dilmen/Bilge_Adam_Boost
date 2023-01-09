package com.dilmen.soru4;

// Singleton OtomobilFactory implementation only 1 otomobilFactory object can be created 
public class Singleton {
	
	private static OtomobilFactory otomobilFactory;
	
	public static OtomobilFactory getOtomobilFactory() {
		if (otomobilFactory == null) {
			otomobilFactory = new  OtomobilFactory();
			return otomobilFactory;
		} else {
			return otomobilFactory;
		}
	}
}
