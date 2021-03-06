package com.niit.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.model.Customer;
import com.niit.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired
  private CustomerService customerService;
	
	@RequestMapping(value="/all/getregistrationform")
	public String getRegistrationForm(Model model){
	Customer customer	=new Customer();
	model.addAttribute("customer",customer);	
	return "RegistrationForm";	
	}
	@RequestMapping(value="/all/registercustomer")
	public String registerCustomer(@ModelAttribute Customer customer,Model model){
		String email=customer.getUser().getEmail();
		if(!customerService.isEmailUnique(email)){//Email is duplicate, Not Unique
			model.addAttribute("errorMessage","Email already exists.. please choose different email id");
			return "RegistrationForm";
		}
		customerService.registerCustomer(customer);
		
		return "login";
	}
}

