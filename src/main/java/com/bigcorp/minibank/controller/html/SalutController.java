package com.bigcorp.minibank.controller.html;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SalutController {

	@RequestMapping("/html/salut")
	public String afficheSalut() {
		return "vue-salut";
	}
	
	@ModelAttribute("maVariable")
	public String getMaVariable() {
		return "Nous sommes le " + LocalDateTime.now().toString();
	}
	
}
