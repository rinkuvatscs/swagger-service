package com.swagger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/swaggerservice/")
public class SwaggerTestController {

	@RequestMapping("/") 
	public String swaggerTest() {
		
		return "Swagger Tested" ;
	}
}
