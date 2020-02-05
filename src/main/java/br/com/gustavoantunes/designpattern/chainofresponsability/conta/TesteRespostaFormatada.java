package br.com.gustavoantunes.designpattern.chainofresponsability.conta;

public class TesteRespostaFormatada {

	public static void main(String[] args) {
	
		Conta conta = new Conta();
		conta.setTitular("Gustavo Antunes");
		conta.setSaldo(5000.0);
		
		Requisicao req = new Requisicao(Formato.PORCENTO);
		
		ImprimirResposta impr  = new ImprimirResposta();
		
		impr.imprime(req, conta);
	}

}
