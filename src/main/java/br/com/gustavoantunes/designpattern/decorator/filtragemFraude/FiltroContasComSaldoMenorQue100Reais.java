package br.com.gustavoantunes.designpattern.decorator.filtragemFraude;

import java.util.ArrayList;
import java.util.List;

import br.com.gustavoantunes.designpattern.chainofresponsability.conta.Conta;

public class FiltroContasComSaldoMenorQue100Reais extends Filtro {

	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> filtrada = new ArrayList<Conta>();
		for (Conta c : contas) {
			if (c.getSaldo()< 100)
				filtrada.add(c);
		}

		filtrada.addAll(proximo(contas));
		return filtrada;
	}

}
