package br.com.gustavoantunes.designpattern.chainofresponsability.conta;

public class SemResposta implements Resposta {

	@Override
	public void responde(Requisicao req, Conta conta) {

	}

	@Override
	public void setProxima(Resposta resposta) {

	}

}
