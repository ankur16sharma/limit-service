package com.rest.webservice.limitservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.webservice.limitservice.bean.Limits;
import com.rest.webservice.limitservice.configuration.LimitsConfiguration;

@RestController
public class LimitController {
	
	@Autowired
	LimitsConfiguration limitsConfiguration;
	
	@GetMapping(path="/limits")
	public LimitsConfiguration getLimits() {
		
		return limitsConfiguration;
	}

}
