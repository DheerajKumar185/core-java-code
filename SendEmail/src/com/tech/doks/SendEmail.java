package com.tech.doks;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class SendEmail {

	public static void main(String[] args) {

		final String username = "dheerajkumar147";
		final String password = "";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("dheerajkumar147@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse("dheeraj_bina@yahoo.com"));
			message.setSubject("Test Mail");
			message.setText("Dear Dheeraj,"
				+ "\n\n This is a test mail. Please Ignore it !!!");

			Transport.send(message);

			System.out.println("Done");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
}
