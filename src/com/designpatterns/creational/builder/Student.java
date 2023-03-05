package com.designpatterns.creational.builder;

import com.designpatterns.creational.builder.exception.InvalidGradException;
import com.designpatterns.creational.builder.exception.InvalidPspException;
import com.designpatterns.creational.builder.exception.InvalidYoeException;

public class Student {
	
	private int id;
	private String name;
	private int yoe;
	private int gradYear;
	private double psp;
	private String batchName;
	
	private Student(Builder b) throws Exception{
		this.id=b.id;
		this.name=b.name;
		this.yoe=b.yoe;
		this.gradYear=b.gradYear;
		this.psp=b.psp;
		this.batchName=b.batchName;
	}
		
	public static Builder builder() {
		Builder b = new Builder();
		return b;
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

	public int getYoe() {
		return yoe;
	}

	public void setYoe(int yoe) {
		this.yoe = yoe;
	}

	public int getGradYear() {
		return gradYear;
	}

	public void setGradYear(int gradYear) {
		this.gradYear = gradYear;
	}

	public double getPsp() {
		return psp;
	}

	public void setPsp(double psp) {
		this.psp = psp;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", yoe=" + yoe + ", gradYear=" + gradYear + ", psp=" + psp
				+ ", batchName=" + batchName + "]";
	}

	//Static Inner Class(A helper class to Build Student Object
	static class Builder {
		
		int id;
		String name;
		int yoe;
		int gradYear;
		double psp;
		String batchName;
		
		public Builder setId(int id) {
			this.id = id;
			return this;
		}
		public Builder setName(String name) {
			this.name = name;
			return this;
		}
		public Builder setYoe(int yoe) {
			this.yoe = yoe;
			return this;
		}
		public Builder setGradYear(int gradYear) {
			this.gradYear = gradYear;
			return this;
		}
		public Builder setPsp(double psp) {
			this.psp = psp;
			return this;
		}
		public Builder setBatchName(String batchName) {
			this.batchName = batchName;
			return this;
		}
		
		public Student build() throws Exception {
			if(yoe < 1) {
				throw new InvalidYoeException("Invalid Years of Experience Exception");
			}
			if(gradYear > 2022) {
				throw new InvalidGradException("Invalid Graduation Year Exception");
			}
			if(psp < 75) {
				throw new InvalidPspException("Invalid Psp Exception");
			}
			Student s = new Student(this);
			return s;
		}
	}		
}
