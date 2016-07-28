package com.doctor.entity;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;

public interface StudentMapper {
	public  Student selectStu(int stuId);
	public int addStu(Student stu);
/*	@Delete("DELETE FROM student WHERE stuId = #{stuId}")*/
	public int delStu(int stuId);
	/*@Update("UPDATE student SET stuName= #{stuName}, stuAge= #{stuAge} WHERE stuId = #{stuId}")*/
	public int updateStu(Student stu);
}
