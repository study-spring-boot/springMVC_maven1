package com.xywei.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.xywei.service.WelcomeService;

@Controller
public class WelcomeAction {
	@Autowired
	private WelcomeService service;

	@RequestMapping("wel")
	@ResponseBody
	public String welcome(Model model, String message) {
		String msg = service.welcome();
		System.out.println(message);
		System.out.println("message" + msg);
		model.addAttribute("message1", msg);
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("message1", message);
//		return modelAndView;
		 return message;
	}
}
