package com.niit.hiberfur.furnit;

import static org.junit.Assert.*;

import org.junit.Test;

import codes.DAO.CustDAO;

public class CheckTest {

	@Test
	public void test() {
		CustDAO b = new CustDAO();
	    b.addUserDetails("userName","aka619@gmail.com","9790451896","v bad service");
	}

}
