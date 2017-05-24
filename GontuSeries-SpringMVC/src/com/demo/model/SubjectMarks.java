package com.demo.model;

import javax.validation.constraints.Size;

import com.demo.helloController.isValidSubject;

public class SubjectMarks {

	private int marks;
	
	@Size(min=2,max=10) @isValidSubject(listOfValidSubjects = "physics|maths|chemistry")    //This will be caught in isValidSubject
	private String subject;
	
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	
}
