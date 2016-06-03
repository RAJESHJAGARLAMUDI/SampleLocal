package com.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service("emailService")
public class EmailService {
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	@Value("${email.from}")
	String from;

	public void sendEmail(String[] to, String sub, String msgBody){
        
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from);
        message.setTo(to);
        message.setSubject(sub);
        message.setText(msgBody);
        javaMailSender.send(message);
    }
}