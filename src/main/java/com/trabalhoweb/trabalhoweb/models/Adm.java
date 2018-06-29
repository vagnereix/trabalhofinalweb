package com.trabalhoweb.trabalhoweb.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Adm implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idadm;
	
	private String login_adm;
	private String senha_adm;
	
	
	public long getIdadm() {
		return idadm;
	}
	public void setIdadm(long idadm) {
		this.idadm = idadm;
	}
	public String getLogin_adm() {
		return login_adm;
	}
	public void setLogin_adm(String login_adm) {
		this.login_adm = login_adm;
	}
	public String getSenha_adm() {
		return senha_adm;
	}
	public void setSenha_adm(String senha_adm) {
		this.senha_adm = senha_adm;
	}
	

}
