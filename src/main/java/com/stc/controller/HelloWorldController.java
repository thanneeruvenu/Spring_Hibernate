package com.stc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/hello")
@Transactional
public class HelloWorldController {

	static final Logger LOG = LoggerFactory.getLogger(HelloWorldController.class);

	@RequestMapping
	@Transactional(readOnly = true)
	public String getMessage() {
		System.out.println("HelloWorld controller");
		// LOG.trace("Hello World!");
		// LOG.debug("How are you today?");
		LOG.info("HelloWorld controller == > getMessage()");
		// LOG.warn("I love programming.");
		// LOG.error("I am programming.");
		return "index";
	}

}
