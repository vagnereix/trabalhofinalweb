package com.trabalhoweb.trabalhoweb.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;

import com.trabalhoweb.trabalhoweb.carrinho.Carrinho;
import com.trabalhoweb.trabalhoweb.carrinho.Item;

@Resource
public class CarrinhoController {
	
	private final Carrinho carrinho;
	
	public CarrinhoController(Carrinho carrinho) {
		this.carrinho = carrinho;
	}
	
	@RequestMapping("/carrinho")
	public void adiciona(Item item) {
		carrinho.adiciona(item);
	}

}
