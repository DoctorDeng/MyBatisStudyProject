package com.doctor.test;

import static org.junit.Assert.*;
import java.io.IOException;

import org.junit.Test;

import com.doctor.db.DBAccess;

public class TestDBAccess {

	@Test
	public void test() {
		DBAccess dbAccess = new DBAccess();
		try {
			System.out.println(dbAccess.getSqlSession());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
