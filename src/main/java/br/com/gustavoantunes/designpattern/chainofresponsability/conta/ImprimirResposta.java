package br.com.gustavoantunes.designpattern.chainofresponsability.conta;

public class ImprimirResposta {

	public void imprime(Requisicao req, Conta conta) {
		SemResposta semResposta = new SemResposta();
		RespostaPorcento porcento = new RespostaPorcento(semResposta);
		RespostaCSV csv = new RespostaCSV(porcento);
		RespostaXML xml = new RespostaXML(csv);
		
		xml.responde(req, conta);
	}
	
}
