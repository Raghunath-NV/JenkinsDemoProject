package com.demo.model;

public class StudentAddress {
	
	private String studentName,studentHobby;
	private Address myAddress;

	public Address getAddress() {
		return myAddress;
	}

	public void setAddress(Address myAddress) {
		this.myAddress = myAddress;
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
