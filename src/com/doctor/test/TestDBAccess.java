package com.doctor.test;

import static org.junit.Assert.*;
import java.io.IOException;

import org.junit.Test;

import com.doctor.util.DBAccess;

public class TestDBAccess {

	@Test
	public void test() {
		DBAccess dbAccess = DBAccess.getDBAccess();
		try {
			System.out.println(dbAccess.getSqlSession());
			System.out.println(dbAccess.getSqlSession());
			System.out.println(dbAccess.getSqlSession());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
