package com.dilmen.soru3;

public class MessageOksijenSensor extends Message{
	final String messageContent;
	final String oksijenSensorLokasyonu;
	final int oksijenYüzdesi;

	public MessageOksijenSensor(String messageContent,String oksijenSensorLokasyonu, int oksijenYüzdesi) {
		this.messageContent = messageContent;
		this.oksijenSensorLokasyonu = oksijenSensorLokasyonu;
		this.oksijenYüzdesi = oksijenYüzdesi;
	}

	public String getOksijenSensorLokasyonu() {
		return oksijenSensorLokasyonu;
	}

	public int getOksijenYüzdesi() {
		return oksijenYüzdesi;
	}

	

	@Override
	public String toString() {
		return "Message oksijen sensörü: " + messageContent + ", oksijen sensor lokasyonu : "
				+ oksijenSensorLokasyonu + ", oksijenYüzdesi : " + oksijenYüzdesi;
	}

	@Override
	String getMessageContent() {
		return messageContent;
	}

}
