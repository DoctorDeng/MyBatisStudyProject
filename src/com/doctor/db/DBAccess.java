package com.doctor.db;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * 访问数据库类
 * @author Doctor邓
 *
 */
public class DBAccess {
	/**
	 * 获取SqlSession
	 * @return
	 * @throws IOException 
	 */
	public SqlSession getSqlSession() throws IOException {
		//通过配置文件获取数据库连接信息
		//路径从src的根路径下开始算起
		InputStream inputStream = Resources.getResourceAsStream("com/doctor/config/mybatis-config.xml");
		//通过配置信息构建SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		//通过SqlSessionFactory打开一个数据库会话
		SqlSession sqlSession = sqlSessionFactory.openSession();
		return sqlSession;
	}
}
