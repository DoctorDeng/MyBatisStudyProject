package com.doctor.entity;

public interface StudentMapper {
	public  Student selectStu(int stuId);
	public int addStu(Student stu);
}
