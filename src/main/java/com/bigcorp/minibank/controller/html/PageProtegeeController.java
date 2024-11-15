package com.bigcorp.minibank.controller.html;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bigcorp.minibank.model.Bank;

@Controller
public class PageProtegeeController {

	@RequestMapping("/html/salut")
	public ModelAndView afficheSalut() {
		ModelAndView modelAndView = new ModelAndView("vue-salut", "cle1", "valeur1");
		Bank bank = new Bank();
		bank.setName("Caisse d'Epargne");
		modelAndView.addObject("banque", bank);
		return modelAndView;
	}
	
	@ModelAttribute("maVariable")
	public String getMaVariable() {
		return "Nous sommes le " + LocalDateTime.now().toString();
	}
	
}
