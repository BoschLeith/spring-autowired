package com.example.springautowired;

import org.springframework.beans.factory.annotation.Value;

public class Student {

	@Value("${student.name}")
	private String name;

	@Value("${student.course}")
	private String course;

	@Value("${student.hobby}")
	private String hobby;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public void displayStudentInfo(){
		System.out.println(name);
		System.out.println(course);
		System.out.println(hobby);
	}
}
