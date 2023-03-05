package com.designpatterns.creational.builder;

public class StudentBuilderDemo {

	public static void main(String[] args) throws Exception {
		Student s = Student.builder()   //Get the builder
					.setId(1)           
					.setBatchName("Jan-23")
					.setName("Abhishek")
					.setGradYear(2005)
					.setYoe(17)
					.setPsp(75)
					.build();
		System.out.println(s.toString());
		
		Student s2 = Student.builder()
					.setId(2)
					//.setBatchName("Feb-23")
					.setName("Dummy")
					.setGradYear(2021)
					.setYoe(2)
					.setPsp(80)
					.build();
		
		System.out.println(s2.toString());
		
		//Since we have setters in Student class client can set teh values hence the object is not immutable
		s2.setBatchName("Some name");
		
		System.out.println(s2.toString());
	}

}
