package com.services;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.domain.PagamentoComBoleto;

@Service
public class BoletoService {

	public void preencherPagamentoComBoleto(PagamentoComBoleto pagto, Date instantePagamento) {

		Calendar cal = Calendar.getInstance();
		cal.setTime(instantePagamento);
		cal.add(Calendar.DAY_OF_MONTH, 7);
		pagto.setDataPagamento(cal.getTime());
	}
}
