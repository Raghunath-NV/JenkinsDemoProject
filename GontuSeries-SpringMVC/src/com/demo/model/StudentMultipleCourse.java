package com.demo.model;

import java.util.ArrayList;

public class StudentMultipleCourse {
	
	private String studentName,studentHobby;
	private ArrayList<String> studentCourses;
	
	
	public ArrayList<String> getStudentCourses() {
		return studentCourses;
	}

	public void setStudentCourses(ArrayList<String> studentCourses) {
		this.studentCourses = studentCourses;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentHobby() {
		return studentHobby;
	}

	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}
	
	

}
