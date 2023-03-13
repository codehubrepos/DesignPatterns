package com.designpatterns.creational.prototype;

public class StudentPrototypeDemo {

	public static void main(String[] args) {
		
		StudentRegistry registry  = new StudentRegistry();
		//One template object/prototype to create copies
		Student aprBatch = new Student();
		aprBatch.setBatchName("April-Batch");
		aprBatch.setAveragePercentage(80);
		aprBatch.setYearOfEnrolment(2022);
		
		registry.add(aprBatch);
		
		//Creating copies from template or prototype
		Student aprBatchStudent1 = aprBatch.clone();
		Student aprBatchStudent2 = aprBatch.clone();
		Student aprBatchStudent3 = aprBatch.clone();
		
		//Creating copies by getting template from registry
		Student aprBatchStudent1fromRegistry=registry.get("April-Batch").clone();
		System.out.println(aprBatchStudent1fromRegistry.toString());
		
		
		Student mayBatch = new Student();
		mayBatch.setBatchName("May-Batch");
		mayBatch.setAveragePercentage(75);
		mayBatch.setYearOfEnrolment(2022);
		
		registry.add(mayBatch);
		
		Student mayBatchStudent1 = aprBatch.clone();
		Student mayBatchStudent2 = aprBatch.clone();
		Student mayBatchStudent3 = aprBatch.clone();
		
		Student mayBatchStudent1fromRegistry=registry.get("May-Batch").clone();
		System.out.println(mayBatchStudent1fromRegistry.toString());
		
		Student janBatch = new Student();
		janBatch.setBatchName("Jan-Batch");
		janBatch.setAveragePercentage(85);
		janBatch.setYearOfEnrolment(2023);
		
		registry.add(janBatch);
		
		//Creating copies from template or prototype
		Student janBatchStudent1 = aprBatch.clone();
		Student janBatchStudent2 = aprBatch.clone();
		Student janBatchStudent3 = aprBatch.clone();

		Student janBatchStudent1fromRegistry=registry.get("Jan-Batch").clone();
		System.out.println(janBatchStudent1fromRegistry.toString());
		
	}

}
