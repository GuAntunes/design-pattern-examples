package br.com.gustavoantunes.designpattern.chainofresponsability.conta;

public class ImprimirResposta {

	public void imprime(Requisicao req, Conta conta) {
		RespostaXML xml = new RespostaXML();
		RespostaCSV csv = new RespostaCSV();
		RespostaPorcento porcento = new RespostaPorcento();
		SemResposta semResposta = new SemResposta();
		
		xml.setProxima(csv);
		csv.setProxima(porcento);
		porcento.setProxima(semResposta);
		
		xml.responde(req, conta);
	}
	
}
