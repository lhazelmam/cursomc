package com.hzm.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.hzm.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
