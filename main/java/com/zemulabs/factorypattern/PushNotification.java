package com.zemulabs.factorypattern;

public class PushNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("Sending Push Notification");
	}

}
