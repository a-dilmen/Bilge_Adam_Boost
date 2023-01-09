package com.dilmen.soru3;

public class MessageSubscriberKaptan implements Observer{

	@Override
	public void update(Message m) {
		System.out.println("Kaptan'a mesaj : "+m.toString());
	}

}
