package br.com.gustavoantunes.designpattern.chainofresponsability.conta;

public interface Resposta {
	void responde(Requisicao req, Conta conta);

	void setProxima(Resposta resposta);
}
