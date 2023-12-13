package com.example;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TestController {
	
	private static final Logger logger  = LoggerFactory.getLogger(TestController.class);
	@GetMapping("/test")
	public ModelAndView getData() {
		return new ModelAndView("index.html");
	}
	
	@GetMapping("/product")
	public ModelAndView getProduct() {
		ModelAndView modelAndView = new ModelAndView("product.html");
		 modelAndView.getModelMap().addAttribute("name","Shoes");
		 logger.info("i am at product service {}", new Date());
		 return modelAndView;
	}

}
