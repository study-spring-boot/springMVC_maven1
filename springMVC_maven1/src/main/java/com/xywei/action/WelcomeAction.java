package com.xywei.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeAction {
	@RequestMapping("wel")
	public String welcome() {
		return "index";
	}
}
