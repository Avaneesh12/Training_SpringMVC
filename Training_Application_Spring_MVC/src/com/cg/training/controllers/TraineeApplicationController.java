package com.cg.training.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.training.beans.Trainee;
import com.cg.training.service.TraineeService;

@Controller
public class TraineeApplicationController {
	
	@Autowired
	TraineeService traineeService;
/*	
	public int generateEmployeeID()
	{
		double rndDouble = Math.random();
		return (int) (rndDouble * 1000);
	}
*/	
	@RequestMapping(value="/returnTrainee")
	public ModelAndView registeremployee(@RequestParam("username") String username, @RequestParam("password") String password) {
		
		if(username.equals("admin") && password.equals("admin"))
			return new ModelAndView("loginSuccessPage");
		
		return new ModelAndView("errorPage");
		

	}

}
