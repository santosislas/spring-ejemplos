package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {

	@RequestMapping(value = "/greeting", method = RequestMethod.GET)
	public String greeting(@RequestParam(name = "name", defaultValue = "Alberto") String name, Model m) {
		System.out.println("entro");
		m.addAttribute("name", name);
		
		return "greeting";
	}
}
