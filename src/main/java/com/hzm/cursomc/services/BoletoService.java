package com.hzm.cursomc.services;

import java.util.Calendar;
import java.util.Date;

import com.hzm.cursomc.domain.PagamentoComBoleto;

public class BoletoService {

	//em e-commerce, esse metodo seria substituido pela utilizacao de um WS de geracao de boleto, que traria a data de vencimento do boleto 
	
	
	public void preencherPagamentoComBoleto(PagamentoComBoleto pagto, Date instanteDoPedido) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(instanteDoPedido);
		cal.add(Calendar.DAY_OF_MONTH,7);
		pagto.setDataVencimento(cal.getTime());
	
	}
}
