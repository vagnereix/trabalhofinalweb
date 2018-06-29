package com.trabalhoweb.trabalhoweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.trabalhoweb.trabalhoweb.models.Cliente;
import com.trabalhoweb.trabalhoweb.repository.ClienteRepository;

@Controller
public class ClienteController {
	
	@Autowired
	private ClienteRepository cr;
	
	@RequestMapping("/loginCliente")
	public String login() {
		return "cliente/loginCliente";
	}
	
	@RequestMapping(value="/cadastrarCliente", method=RequestMethod.GET)
	public String form() {
		return "cliente/formCliente";
	}
	
	@RequestMapping(value="/cadastrarCliente", method=RequestMethod.POST)
	public String form(Cliente cliente) {
		
		cr.save(cliente);
		
		return "redirect:/cadastrarCliente";
	}
	
	@RequestMapping("/clientes")
	public ModelAndView listaClientes() {
		ModelAndView mv = new ModelAndView("cliente/listarClientes");
		
		Iterable<Cliente> clientes = cr.findAll();
		
		mv.addObject("clientes", clientes);
		
		return mv;
	}
	
}
