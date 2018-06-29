package com.trabalhoweb.trabalhoweb.repository;

import org.springframework.data.repository.CrudRepository;

import com.trabalhoweb.trabalhoweb.models.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, String>{
	
	Cliente findByIdcliente(Long idcliente);

	Cliente findByLogin(String login);
	
}
