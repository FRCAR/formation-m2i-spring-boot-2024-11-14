package com.bigcorp.minibank.controller.html;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SalutController {

	@RequestMapping("/html/page-protegee")
	public String affichePage() {
		return "vue-protegee";
	}
	
	
}
