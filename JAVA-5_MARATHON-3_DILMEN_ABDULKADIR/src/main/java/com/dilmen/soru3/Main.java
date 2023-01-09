package com.dilmen.soru3;

public class Main {
	public static void main(String[] args) {
		
		// observing subscribers instantiation 
		Observer kaptan = new MessageSubscriberKaptan();
		Observer haberlesmeci = new MessageSubscriberHaberlesmeci();
		Observer torpidoMerkezi = new MessageSubscriberTorpidoMerkezi();
		
		// subject publisher instantiation
		Subject sonar = new MessagePublisherSonar();
		Subject yanginSensoru = new MessagePublisherYangin();
		Subject oksijenSensoru = new MessagePublisherOksijen();
		
		// adding observers
		sonar.attach(kaptan);
		sonar.attach(haberlesmeci);
		sonar.attach(torpidoMerkezi);

		yanginSensoru.attach(kaptan);
		yanginSensoru.attach(haberlesmeci);
		
		oksijenSensoru.attach(kaptan);
		
		// notifying updates automatically with respect to subjects and observers; thanks to observer design pattern 
		sonar.notifyUpdate(new MessageSonar("Düşman deniz altısı saptandı: ","SF1500",30,23,70));
		System.out.println("\n");
		oksijenSensoru.notifyUpdate(new MessageOksijenSensor("Oksijen seviyesi kritik : ","torpido kontrol merkezi",23));
		System.out.println("\n");
		yanginSensoru.notifyUpdate(new MessageYanginSensoru("Yangın tehlikesi acil müdahale gerekebilir : ", "yemekhane", 300));
		
	}

}
