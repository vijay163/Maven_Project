package com.scripts;

import org.testng.annotations.Test;

import com.generics.BaseClass;
import com.generics.FWUtills;
import com.objectRepository.LoginPage;

public class TestLoginPage extends BaseClass
{
	@Test
	public void testValidLogin()
	{
		String user = FWUtills.read_XL_Data(XL_DATA, "ValidLogin",1,0);
		String pass = FWUtills.read_XL_Data(XL_DATA,"ValidLogin",1,1);
		String expectedTitleH = FWUtills.read_XL_Data(XL_DATA,"HomePage" ,1, 2);
	    
		LoginPage lp = new LoginPage(driver);
		lp.setUser(user);
		lp.setPass(pass);
		lp.clickOncheckB();
		lp.clickOnLogin();
		FWUtills.verifiePage(driver, expectedTitleH);
	
	
	}

}
