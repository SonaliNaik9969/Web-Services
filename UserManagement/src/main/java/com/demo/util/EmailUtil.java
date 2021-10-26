package com.demo.util;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailUtil {

	@Autowired
	private JavaMailSender mailsender;

	public boolean sendEmail(String to, String subject, String body) {
		boolean isSent = false;
		MimeMessage mimeMessage = mailsender.createMimeMessage();
		try {
		
		MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true);
		messageHelper.setTo(to);
		messageHelper.setSubject(subject);
		messageHelper.setText(body);
		mailsender.send(messageHelper.getMimeMessage());
		isSent=true;
		
		} catch (MessagingException e) {

			System.out.println("While sending Email error occured" +e.getMessage());
		}

		return isSent;
	}

}
