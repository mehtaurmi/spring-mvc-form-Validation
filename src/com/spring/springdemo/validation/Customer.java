package com.spring.springdemo.validation;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.spring.springdemo.validation.customAnnotation.CourseCode;

public class Customer {

	//create properties
	private String firstName;
	
	@NotNull(message="Required!")
	@Size(min=3,message="Required!")
	private String lastName;
	
	@NotNull(message="Required!")	
	@Min(value=0,message="must be greater than 0")
	@Max(value=10,message="must be less than 10")
	private Integer freePasses;
	
	@Pattern(regexp="^[a-zA-Z0-9]{6}",message="6 chars/digits only")
	private String postalCode;
	
	@CourseCode
	private String courseCode;
	
	//generate getters and setters for properties
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	
}
