package com.loadbalancer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LBController {
	
	 @GetMapping("/sayhi/")
	    public String sayGreeting(){
	    	return "Say a Long Hi..";
	    }

}
