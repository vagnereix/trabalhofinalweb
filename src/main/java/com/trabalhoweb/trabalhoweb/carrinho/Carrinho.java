package com.trabalhoweb.trabalhoweb.carrinho;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class Carrinho {
	
	private List<Item> itens = new ArrayList<Item>();
	private double total = 0;

	public List<Item> getItens() {
		return itens;
	}
	public void setItens(List<Item> itens) {
		this.itens = itens;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	public void adiciona(Item item) {
		itens.add(item);
		total += item.getProduto().getValor() * item.getQuantidade();
	}

}
