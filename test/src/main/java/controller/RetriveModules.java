package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import models.Students;

@RestController

public class RetriveModules {
	@RequestMapping(value = "/students/{id}", method = RequestMethod.GET)
	public static String retrive(){
		//retrive students according to id
		Students student =new Students();
		student.getAge();
		
		return null;
	}
}
