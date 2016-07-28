package com.doctor.entity;

public class Student {
	private int stuId;
	private String stuName;
	private int stuAge;
	
	@Override
	public String toString() {
		return "Student: [stuId=" + stuId + ", stuName=" + stuName + ", stuAge=" + stuAge + "]";
	}

	public Student(){}
	
	public Student(int stuId, String stuName, int stuAge) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuAge = stuAge;
	}

	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getStuAge() {
		return stuAge;
	}
	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}
	
	
}
