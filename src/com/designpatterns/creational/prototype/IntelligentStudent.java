package com.designpatterns.creational.prototype;

public class IntelligentStudent extends Student {
	
	private int iq;
	
	public IntelligentStudent() {
	}

	public IntelligentStudent(IntelligentStudent intelligentStudent) {
		super(intelligentStudent);
		this.iq=intelligentStudent.iq;
	}
	
	public IntelligentStudent clone(IntelligentStudent intelligentStudent) {
		return new IntelligentStudent(this);
	}

	public int getIq() {
		return iq;
	}

	public void setIq(int iq) {
		this.iq = iq;
	}

}
