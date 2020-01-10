package com.scripts;

import org.testng.annotations.Test;

import com.generics.BaseClass;
import com.generics.FWUtills;
import com.objectRepository.LoginPage;

public class TestInvalidLoginPage extends BaseClass
{
	@Test
	public void invalidLogin()
	{
		 int dataR = FWUtills.count_XL_DataRows(XL_DATA,"InvalidLogin");
		 LoginPage lp = new LoginPage(driver);
		 for(int i=1;i<dataR;i++)
		 {
			 String user = FWUtills.read_XL_Data(XL_DATA,"InvalidLogin" ,i,0);
		     String pass = FWUtills.read_XL_Data(XL_DATA, "InvalidLogin",i,1);
		     lp.setUser(user);
		     lp.setPass(pass);
		     lp.clickOnLogin();
		     lp.getErrMsg();
		 }
	}

}
