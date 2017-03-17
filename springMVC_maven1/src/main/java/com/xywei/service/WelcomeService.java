package com.xywei.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {
	public String welcome() {
		return "hello";
	}
}
