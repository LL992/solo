package com.solo.project.mainController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class MyController {

	@RequestMapping("home")
	public String main() {
		return "home";
	}
}
