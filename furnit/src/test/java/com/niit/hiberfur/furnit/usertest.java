package com.niit.hiberfur.furnit;

import org.junit.Test;
import junit.framework.TestCase;
import codes.DAO.CustDAO;


public class usertest{

	
	@Test
	public void insdata()
	{
		CustDAO b = new CustDAO();
	    b.addUserDetails("userName","aka619@gmail.com","9790451896","v bad service");
	}
	 
     
	
	
}
