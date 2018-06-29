package com.trabalhoweb.trabalhoweb.repository;

import org.springframework.data.repository.CrudRepository;

import com.trabalhoweb.trabalhoweb.models.Adm;

public interface AdmRepository extends CrudRepository<Adm, String>{
	
	Adm findByIdadm(Long idadm);

}
