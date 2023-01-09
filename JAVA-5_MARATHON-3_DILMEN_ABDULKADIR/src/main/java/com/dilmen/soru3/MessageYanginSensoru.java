package com.dilmen.soru3;

public class MessageYanginSensoru extends Message{
	final String messageContent;
	final String yanginSensorLokasyonu;
	final int sicaklik;
	
	public MessageYanginSensoru(String messageContent,String yanginSensorLokasyonu, int sicaklik) {
		this.messageContent = messageContent;
		this.yanginSensorLokasyonu = yanginSensorLokasyonu;
		this.sicaklik = sicaklik;
	}
	

	
	@Override
	public String toString() {
		return "Message yangın sensörü : " + messageContent + ", yangin sensor lokasyonu : "
				+ yanginSensorLokasyonu + ", sicaklik :" + sicaklik;
	}



	public String getYanginSensorLokasyonu() {
		return yanginSensorLokasyonu;
	}
	
	public int getSicaklik() {
		return sicaklik;
	}

	@Override
	String getMessageContent() {
		return messageContent;
	}
	
	
	
}
