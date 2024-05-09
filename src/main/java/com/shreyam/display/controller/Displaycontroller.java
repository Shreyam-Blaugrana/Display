package com.shreyam.display.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class Displaycontroller {

	 @GetMapping("/")
	    public String index(Model model) {
	        model.addAttribute("name", "Shreyam"); 
	        return "display";
	    }
}
