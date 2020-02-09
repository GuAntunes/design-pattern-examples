package br.com.gustavoantunes.designpattern.decorator.imposto;

import br.com.gustavoantunes.designpattern.strategy.imposto.Orcamento;

public class TesteImposto {

	public static void main(String[] args) {
		Imposto impostoComplexo = new ISS(new ICMS());

		Orcamento orcamento = new Orcamento(500.0);

		double valor = impostoComplexo.calcula(orcamento);

		System.out.println(valor);
	}
}
