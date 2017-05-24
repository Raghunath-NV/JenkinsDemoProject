package com.demo.helloController;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class SubjectValidator implements ConstraintValidator<isValidSubject,String> {

	
	private String listOfValidSubjects;
	@Override
	public void initialize(isValidSubject arg0) {
		
		this.listOfValidSubjects = arg0.listOfValidSubjects();          //This will intialize the list to compare
		
	}

	@Override
	public boolean isValid(String subject, ConstraintValidatorContext arg1) {
		
		if(subject == null)
			return false;
		else if(subject.matches(listOfValidSubjects))
			return true;
		else 
			return false;
	}

}
