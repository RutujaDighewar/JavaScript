package com.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ViewController {
	
	@GetMapping("/")
	public String viewHome(Model model) {
		int id=10;
		model.addAttribute("id" , id);
		return "index";
	}
	
	@GetMapping(value = "delete")
	public String delete(@RequestParam("id") Integer id) {
		System.out.println("Deleted by " + id);
		return "redirect:/";
		
	}

}
