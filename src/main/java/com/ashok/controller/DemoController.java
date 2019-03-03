package com.ashok.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashok.constants.AppConstants;
import com.ashok.properties.AppProperties;

@RestController
public class DemoController {

	@Autowired
	private AppProperties appProperties;

	@GetMapping("/wish")
	public String wish() {
		System.out.println(appProperties);

		String msg = appProperties.getProperties().get(AppConstants.MESSAGE);

		return msg;
	}
}
