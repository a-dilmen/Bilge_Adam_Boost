package com.dilmen.soru3;

public class MessageSonar extends Message {

	final String messageContent;
	final String denizAltiTipi;
	final int denizAltiMesafe;
	final int denizAltiHizi;
	final int denizAltiYonu;

	public MessageSonar(String messageContent, String denizAltiTipi, int denizAltiMesafe, int denizAltiHizi,
			int denizAltiYonu) {
		this.messageContent = messageContent;
		this.denizAltiTipi = denizAltiTipi;
		this.denizAltiHizi = denizAltiHizi;
		this.denizAltiYonu = denizAltiYonu;
		this.denizAltiMesafe = denizAltiMesafe;
	}

	@Override
	public String toString() {
		return "MessageSonar :" + messageContent + ", denizAltiTipi : " + denizAltiTipi
				+ ", denizAltiMesafe : " + denizAltiMesafe + ", denizAltiHizi : " + denizAltiHizi + ", denizAltiYonu="
				+ denizAltiYonu ;
	}

	@Override
	String getMessageContent() {
		return messageContent;
	}

	public String getDenizAltiTipi() {
		return denizAltiTipi;
	}

	public int getDenizAltiMesafe() {
		return denizAltiMesafe;
	}

	public int getDenizAltiHizi() {
		return denizAltiHizi;
	}

	public int getDenizAltiYonu() {
		return denizAltiYonu;
	}

}
