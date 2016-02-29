package com.sofasurfers.springbatchcloud.server.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProcessController {
	
	@RequestMapping("/run")
	public String run() {
		return "YES!!!";
	}
	
}
