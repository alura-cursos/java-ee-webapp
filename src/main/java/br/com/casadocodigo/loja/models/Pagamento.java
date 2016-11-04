package br.com.casadocodigo.loja.models;

import java.math.BigDecimal;

public class Pagamento {

	private BigDecimal value;
	
	public Pagamento(BigDecimal value) {
		this.value = value;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}
	
}
