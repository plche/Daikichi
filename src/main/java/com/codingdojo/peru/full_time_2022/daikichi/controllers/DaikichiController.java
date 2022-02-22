package com.codingdojo.peru.full_time_2022.daikichi.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String handleDaikichi() {
		return "Welcome!";
	}
	
	@RequestMapping(value = "/today", method = RequestMethod.GET)
	public String handleDaikichiToday() {
		return "Today you will find luck in all your endeavors!";
	}
	
	@RequestMapping(value = "/tomorrow", method = RequestMethod.GET)
	public String handleDaikichiTomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
}
