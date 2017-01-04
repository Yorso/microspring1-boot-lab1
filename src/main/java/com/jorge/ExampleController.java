package com.jorge;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExampleController {

	@RequestMapping("/") //Thymeleaf
	public String hello(){
		return "hello";
	}
}
