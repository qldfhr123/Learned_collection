package com.care.dbQuiz.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class MailConfig {
	@Bean
	public JavaMailSender mailSender() {
		JavaMailSenderImpl jms = new JavaMailSenderImpl(); //상속받은 class
		jms.setHost("smtp.gmail.com");
		jms.setPort(587);
		jms.setUsername("alfowko3258@gmail.com");//인증번호를 클라이언트에게 보낼 이메일 주소
		jms.setPassword("ujqldhrribazdqob"); //앱 비번
		
		Properties pro =new Properties();
		pro.setProperty("mail.transport,protocol", "smtp");
		pro.setProperty("mail.smtp.auth", "true");
		pro.setProperty("mail.smtp.starttls.enable", "true");
		jms.setJavaMailProperties(pro);
		
		return jms;
		
	}

}
