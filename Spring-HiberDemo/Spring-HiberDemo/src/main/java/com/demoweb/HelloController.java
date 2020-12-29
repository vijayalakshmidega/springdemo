package com.demoweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@GetMapping("helo")
	public ModelAndView Hello() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("hello");
		mv.addObject("data", "Spring-hiber with jenkins was executed");
		return mv;
	}
}
