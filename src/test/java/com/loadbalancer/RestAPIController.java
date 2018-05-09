package com.loadbalancer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPIController {
	
	@GetMapping("/greeting/")
    public String getAllEmployees(){				 
		return "Tomcat 1";
    }

}
