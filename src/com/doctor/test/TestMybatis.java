package com.doctor.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.doctor.entity.Student;
import com.doctor.entity.StudentMapper;
import com.doctor.util.DBAccess;

public class TestMybatis {
	private SqlSession sqlSession;
	private StudentMapper stuMapper;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}

	@Before
	public void setUp() throws Exception {
		sqlSession = DBAccess.getDBAccess().getSqlSession();
		stuMapper = sqlSession.getMapper(StudentMapper.class);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void selectAllStu() {
		System.out.println(stuMapper.selectAllStu().size());
		sqlSession.close();
	}
	
	@Test
	public void selectStuById() {
		System.out.println(stuMapper.selectStu(1));
		sqlSession.close();
	}
	@Test
	public void updateStu() {
		int i = stuMapper.updateStu(new Student(1,"aaa",20));
		sqlSession.commit();
		
		if (i==1) {
			System.out.println("更新成功");
		} else {
			System.out.println("更新失败");
		}
		sqlSession.close();
	}
	@Test
	public void addStu() {
		int i = stuMapper.addStu(new Student(5,"bbb",30));
		sqlSession.commit();
		
		if (i==1) {
			System.out.println("添加成功");
		} else {
			System.out.println("添加失败");
		}
		sqlSession.close();
	}
	@Test
	public void delelteStuById() {
		int i = stuMapper.delStu(2);
		sqlSession.commit();
		
		if (i==1) {
			System.out.println("删除成功");
		} else {
			System.out.println("删除失败");
		}
		sqlSession.close();
	}
	
	@Test
	public void testselectAllStuWithGrade() {
		List<Student> studentList = stuMapper.selectAllStuWithGrade();
		for (Student stu: studentList) {
			System.out.println(stu.toString());
		}
		sqlSession.close();
	}
	
	@Test
	public void testselectAllStuWithTest() {
		List<Student> studentList = stuMapper.selectAllStuWithTest();
		for (Student stu: studentList) {
			System.out.println(stu.toString());
		}
		sqlSession.close();
	}
	
	
}
