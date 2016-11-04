package br.com.casadocodigo.loja.service;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;

import br.com.casadocodigo.loja.models.Pagamento;

public class PagamentoGateway implements Serializable {

	private static final long serialVersionUID = 1L;

	public String pagar(BigDecimal total) {
		Pagamento pagamento = new Pagamento(total);
		String target = "http://book-payment.herokuapp.com/payment";
		Client client = ClientBuilder.newClient();
		return client.target(target).request()
			.post(Entity.json(pagamento), String.class);
	}
	
}






