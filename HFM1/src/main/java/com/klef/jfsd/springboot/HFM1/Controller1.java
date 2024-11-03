package com.klef.jfsd.springboot.HFM1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class Controller1 {

	@GetMapping("/home")
	public String method1() {
		return "home";
	}
	@GetMapping("/login")
	public String method2() {
		return "login";
	}
	@GetMapping("/contactus")
	public String method3() {
		return "contactus";
	}

}
