package com.doctor.entity;

import java.util.List;

public interface StudentMapper {
	public  Student selectStu(int stuId);
	
	public int addStu(Student stu);
	
/*	@Delete("DELETE FROM student WHERE stuId = #{stuId}")*/
	
	public int delStu(int stuId);
	/*@Update("UPDATE student SET stuName= #{stuName}, stuAge= #{stuAge} WHERE stuId = #{stuId}")*/
	
	public int updateStu(Student stu);
	
	public List<Student> selectAllStu();
	
	public List<Student> selectAllStuWithGrade();
	
	public List<Student> selectAllStuWithTest();
}
