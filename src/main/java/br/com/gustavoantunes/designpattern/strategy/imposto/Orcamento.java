package br.com.gustavoantunes.designpattern.strategy.imposto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.gustavoantunes.designpattern.chainofresponsability.Item;
import br.com.gustavoantunes.designpattern.state.EmAprovacao;
import br.com.gustavoantunes.designpattern.state.EstadoDeUmOrcamento;

public class Orcamento {

	protected double valor;

	private final List<Item> itens = new ArrayList<>();;

	private EstadoDeUmOrcamento estadoAtual;

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Orcamento(double valor) {
		this();
		this.valor = valor;
	}

	public Orcamento() {
		this.estadoAtual = new EmAprovacao();
	}

	public double getValor() {
		return valor;
	}

	public void adicionaItem(Item item) {
		itens.add(item);
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}

	public boolean contemItemDeNome(String nomeDoItem) {
		for (Item item : itens) {
			if (item.getNome().equals(nomeDoItem))
				return true;
		}
		return false;
	}

	public EstadoDeUmOrcamento getEstadoAtual() {
		return estadoAtual;
	}

	public void setEstadoAtual(EstadoDeUmOrcamento estadoAtual) {
		this.estadoAtual = estadoAtual;

	}

	public void aplicaDescontoExtra() {
		estadoAtual.aplicaDescontoExtra(this);
	}

	public void aprova() {
		estadoAtual.aprova(this);
	}

	public void reprova() {
		estadoAtual.reprova(this);
	}

	public void finaliza() {
		estadoAtual.finaliza(this);
	}

}
