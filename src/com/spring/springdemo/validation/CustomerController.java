package com.spring.springdemo.validation;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	//add initBinder...to convert trim input strings
	//remove leading and trailing whitespace.
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor=new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class,stringTrimmerEditor);
		
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model model)
	{
		//create a customer object and add it into model
		model.addAttribute("Customer", new Customer());
		
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("Customer") Customer customer,
			BindingResult result) {
		//test if there is a whitespace in lastname
		System.out.println("Last Name: |"+customer.getLastName()+"|");
		
		//check the error message if any and find error code to give custom error message
		System.out.println("Binding Result:"+result);
		if(result.hasErrors())
		{
			return "customer-form";
		}
		else
		{
			return "customer-confirmation";
		}
	}
}
