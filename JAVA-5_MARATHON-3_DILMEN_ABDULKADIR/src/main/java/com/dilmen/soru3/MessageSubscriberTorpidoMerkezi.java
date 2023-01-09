package com.dilmen.soru3;

public class MessageSubscriberTorpidoMerkezi implements Observer{

	@Override
	public void update(Message m) {
		System.out.println("Haberleşmeciye mesaj : "+m.toString());
	}

}
