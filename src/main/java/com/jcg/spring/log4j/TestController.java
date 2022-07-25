package com.jcg.spring.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	private Logger logger = LogManager.getLogger(TestController.class);

	@RequestMapping(value = {"/", "hello"}, method = RequestMethod.GET)
	public ModelAndView helloWorld() {

		ModelAndView model = new ModelAndView("helloWorld");
		logger.info("This Is An Info Log Entry ......!");
		logger.error("This Is An Error Log Entry ......!");
		logger.debug("This Is An DEBUG Log Entry ......!");
		logger.trace("This Is An TRACE Log Entry ......!");
		return model;
	}
}