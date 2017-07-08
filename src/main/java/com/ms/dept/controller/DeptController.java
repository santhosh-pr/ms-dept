package com.ms.dept.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/dept")
public class DeptController {

	@RequestMapping(path="/name",method=RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getDeptName(){
		System.out.println("Called ---->");
		return new ResponseEntity<String>("IT",HttpStatus.OK);
	}
}
