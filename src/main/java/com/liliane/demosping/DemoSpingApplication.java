package com.liliane.demosping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@SpringBootApplication
public class DemoSpingApplication {

		@RequestMapping(value="/")
    	public String index() {
        	return "<h1> Hello, World Liliane!</h1>";
    	}

	public static void main(String[] args) {
		SpringApplication.run(DemoSpingApplication.class, args);
	}

}
