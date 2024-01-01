package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.web.binding.User;

import jakarta.validation.Valid;

@Controller
public class UserController {

	@GetMapping("/")
	public String getForm(Model model) {
		User userObj=new User();
		model.addAttribute("user", userObj);
		return "index";
	}
	@PostMapping("/register")
	public String handleRegisterButton(@Valid  User userForm,BindingResult result, Model model) {
		/*Valid- @Valid is used to valid form data aganest form rules in binding class 
		 * BindingResult - It is used to check errors*/
		//This user obj is used to capture the user data, This form data cature in userForm obj and I want 
		//that obj as a parameter 
		
		if(result.hasErrors()) {	//if validation fails return index page directly
			return "index";
		}
		System.out.println(userForm);
		model.addAttribute("msg", "Your Registration Successful!...");
		return "success";
	}
}
