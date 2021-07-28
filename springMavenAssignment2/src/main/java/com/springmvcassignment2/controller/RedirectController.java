package com.springmvcassignment2.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {
	
	@RequestMapping("/one")
	public String one() {
		System.out.println("this is One");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("enjoy");
		return "redirectView";
	}
	
	@RequestMapping("/two")
	public String  two() {
		System.out.println("this is two");
		return "login";
	}

}
