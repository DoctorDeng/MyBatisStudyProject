package com.doctor.entity;

public class Grade {
	/**
	 * 年级ID
	 */
	private int gradeId;
	/**
	 * 年级名称
	 */
	private String gradeName;
	
	public Grade(){}
	
	public Grade(int gradeId, String gradeName) {
		super();
		this.gradeId = gradeId;
		this.gradeName = gradeName;
	}
	
	public int getGradeId() {
		return gradeId;
	}
	public void setGradeId(int gradeId) {
		this.gradeId = gradeId;
	}
	public String getGradeName() {
		return gradeName;
	}
	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}
}
