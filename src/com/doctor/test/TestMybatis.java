package com.doctor.test;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.doctor.entity.Student;
import com.doctor.entity.StudentMapper;

public class TestMybatis {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("mybatis-config.xml");
		
		SqlSessionFactory stuMapper =  new SqlSessionFactoryBuilder().build(inputStream);
		
		SqlSession session = stuMapper.openSession();
		StudentMapper stu1Mapper = session.getMapper(StudentMapper.class);
		stu1Mapper.addStu(new Student(3,"sdf",11));
		session.commit();
		try {
			Student blog = (Student) session.selectOne(
					"com.doctor.entity.StudentMapper.selectStu", 1);
			System.out.println(blog.getStuName());
		} finally {
			session.close();
		}
	}

}
