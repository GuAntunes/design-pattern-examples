package br.com.gustavoantunes.designpattern.strategy.imposto;

public class CalculadorDeImposto {

	public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
		
		double resultado = imposto.calcula(orcamento);
		System.out.println(resultado);
	}

}
