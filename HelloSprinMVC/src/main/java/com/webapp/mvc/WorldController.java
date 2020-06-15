package com.webapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/*
 * author : mustafa samancioglu
 */
@Controller
public class WorldController {
	@RequestMapping(value = "/world")
	@ResponseBody
	public String sayWorld() {
		return "Hello World from WorldController";
	}

}
