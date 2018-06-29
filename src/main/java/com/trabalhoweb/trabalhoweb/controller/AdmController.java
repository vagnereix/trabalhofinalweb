package com.trabalhoweb.trabalhoweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.trabalhoweb.trabalhoweb.models.Adm;
import com.trabalhoweb.trabalhoweb.repository.AdmRepository;

@Controller
public class AdmController {
	
	@Autowired
	private AdmRepository ar;
	
	@RequestMapping(value="/cadastrarAdm", method=RequestMethod.GET)
	public String form() {
		return "adm/formAdm";
	}
	
	@RequestMapping(value="/cadastrarAdm", method=RequestMethod.POST)
	public String form(Adm adm) {
		
		ar.save(adm);
		
		return "redirect:/cadastrarAdm";
	}
	
	@RequestMapping("/adms")
	public ModelAndView listaClientes() {
		ModelAndView mv = new ModelAndView("adm/listarAdms");
		
		Iterable<Adm> adms = ar.findAll();
		
		mv.addObject("adms", adms);
		
		return mv;
	}

}
