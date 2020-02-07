package br.com.gustavoantunes.designpattern.chainofresponsability.conta;

public class RespostaPorcento implements Resposta {

	private Resposta proxima;

	public RespostaPorcento(Resposta proxima) {
		super();
		this.proxima = proxima;
	}

	@Override
	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato().equals(Formato.PORCENTO)) {
			StringBuilder sb = new StringBuilder();
			sb.append(conta.getTitular());
			sb.append("%");
			sb.append(conta.getSaldo());
			System.out.println(sb);
		} else {
			proxima.responde(req, conta);
		}

	}

	@Override
	public void setProxima(Resposta resposta) {
		this.proxima = resposta;
	}

}
