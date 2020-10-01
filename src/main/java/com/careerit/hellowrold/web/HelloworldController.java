package com.careerit.hellowrold.web;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloworldController {

			@GetMapping(value = {"/","/index"})
			public ModelAndView index() {
				ModelAndView obj = new ModelAndView("index","message","Welcome to MVC world : "+LocalDateTime.now());
				return obj;
			}
}
