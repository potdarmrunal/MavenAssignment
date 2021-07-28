package com.springmvcassignment2.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springmvcassignment2.model.User;
import com.springmvcassignment2.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	private List<User> userList = null;
	
	public UserController() {
		System.out.println("Hr Controller object created..........");
		userList = Arrays.asList(new User("Mrunali", "mrunali@gmail.com", "1234", 1234, "Latur"),
				new User("Darshan", "darshan@gmail.com", "1234", 123654, "Latur"),
				new User("Shruti", "shruti@gmail.com", "1234", 123654, "Latur"),
				new User("Sankskruti", "sanku@gmail.com", "1234", 123654, "Latur"),
				new User("Samrudhi", "samu@gmail.com", "1234", 123654, "Latur"));
	}

	@RequestMapping("/")
	public String appHome() {
		return "index";
	}

	@RequestMapping("/register")
	public String registerUser(@ModelAttribute("userss") User user) {
		return "register";
	}

//	@RequestMapping("/validateuser")
//	public String validateUser(HttpSession session,@Valid @ModelAttribute("userss") User user, BindingResult result) {
//		//System.out.println(errors.getErrorCount());
////		if (errors.hasErrors()) {
////			System.out.println("error");
////			return "register";
////		} 
//		if(result.hasErrors()) {
//			System.out.println("error");
//			return "register";
//		}
//		else {
//			System.out.println("No error");
//			for (User u : userList) {
//				if (u.getUsername().equals(user.getUsername()) && u.getPassword().equals(user.getPassword())) {
//					session.setAttribute("username", user.getUsername());
//					session.setAttribute("password", user.getUsername());
//					this.userService.createUser(user);
//					return "userhome";
//				}
//			}
//		}
//		return "register";
//
//	}
	
	@RequestMapping("/validateuser")
	public String aa( @ModelAttribute("userss") User user,Model model) {
		System.out.println("User : " + user);
		this.userService.createUser(user);
		model.addAttribute("msg" , "Data added succesfully .. ");
		return "userhome";
	}

//	@RequestMapping(path = "/profile/{ename}")
//	public String empProfile(@PathVariable("ename") String userName, Model model) {
//		for (User u : userList)
//			if (u.getUsername().equals(userName)) {
//				model.addAttribute("userName", u);
//				model.addAttribute("msg", "Looged user details!!!");
//			}
//
//		return "login";
//	}

	@RequestMapping(path = "/getalluser")
	public String getAllEmployee(Model model) {
		List<User> a = this.userService.fetchUser();
		model.addAttribute("user", a);
		return "userhome";
	}
	
	

}
