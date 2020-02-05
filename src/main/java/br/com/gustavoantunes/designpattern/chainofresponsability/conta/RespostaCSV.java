package br.com.gustavoantunes.designpattern.chainofresponsability.conta;

public class RespostaCSV implements Resposta{
	private Resposta proxima;

	@Override
	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato().equals(Formato.CSV)) {
			StringBuilder sb = new StringBuilder();
			sb.append(conta.getTitular());
			sb.append(conta.getSaldo());
			System.out.println(sb);
		}else {
			proxima.responde(req, conta);
		}

	}

	@Override
	public void setProxima(Resposta resposta) {
		this.proxima = resposta;
	}
}
