package com.spring.boot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {
	
	@RequestMapping("/")
	@ResponseBody
//	 the response body annotation is used for rendering the json object in the view
	String initialPage() {
		return "hello boot";
	}
}
