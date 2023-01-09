package com.dilmen.soru3;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisherYangin implements Subject {
	List<Observer> observers = new ArrayList<>();
	@Override
	public void attach(Observer o) {
		if (!observers.contains(o))
			observers.add(o);
	}

	@Override
	public void detach(Observer o) {

	}

	@Override
	public void notifyUpdate(Message m) {
		for(Observer o: observers) {
			o.update(m);
			System.out.println("!!!!!!!!!!!!");
		}
	}





}
