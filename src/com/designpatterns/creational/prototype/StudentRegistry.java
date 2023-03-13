package com.designpatterns.creational.prototype;

import java.util.HashMap;

/**
 * 
 * If you have many template objects a Registry can be maintained for them
 * 
 * */
public class StudentRegistry {

	private HashMap<String, Student> studentREgistry;
	
	public StudentRegistry() {
		this.studentREgistry=new HashMap<>();
	}
	
	public Student get(String batchName) {
		return studentREgistry.get(batchName);
	}
	
	public void add(Student student) {
		studentREgistry.put(student.getBatchName(), student);
	}

}
