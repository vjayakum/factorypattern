package com.zemulabs.factorypattern;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class NotificationFactoryTest {
	
	private NotificationFactory notificationFactory = new NotificationFactory();

	@Test
	public void shouldReturnSMSObject() {
		Notification notification = notificationFactory.createNotification("SMS");
		System.out.println(notification.getClass());
		assertTrue( notification.getClass() == SMSNotification.class );
	}
	
	@Test
	public void shouldReturnEmailObject() {
		Notification notification = notificationFactory.createNotification("EMAIL");
		System.out.println(notification.getClass());
		assertTrue( notification.getClass() == EmailNotification.class );
	}
	
	@Test
	public void shouldReturnPushObject() {
		Notification notification = notificationFactory.createNotification("PUSH");
		System.out.println(notification.getClass());
		assertTrue( notification.getClass() == PushNotification.class );
	}
		
}