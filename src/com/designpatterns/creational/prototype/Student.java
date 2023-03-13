package com.designpatterns.creational.prototype;

public class Student implements Prototype<Student> {
	
	private int id;
	private String name;
	private int age;
	
	//Common attributes
	private double averagePercentage;
	private String batchName;
	private int yearOfEnrolment;
	
	public Student() {
		
	}
	
	/**
	 * 
	 * Copy Constructor
	 * Take a template object and create the new object
	 * 
	 * */
	public Student(Student student) {
		this.averagePercentage=student.averagePercentage;
		this.batchName=student.batchName;
		this.yearOfEnrolment=student.yearOfEnrolment;
	}
	
	@Override
    public Student clone() {
    	return new Student(this);
    } 
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getAveragePercentage() {
		return averagePercentage;
	}

	public void setAveragePercentage(double averagePercentage) {
		this.averagePercentage = averagePercentage;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public int getYearOfEnrolment() {
		return yearOfEnrolment;
	}

	public void setYearOfEnrolment(int yearOfEnrolment) {
		this.yearOfEnrolment = yearOfEnrolment;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", averagePercentage=" + averagePercentage
				+ ", batchName=" + batchName + ", yearOfEnrolment=" + yearOfEnrolment + "]";
	}

}
