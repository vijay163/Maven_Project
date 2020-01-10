package Com.Actitime.Scripts;

import org.testng.annotations.Test;

import Com.Actitime.Generics.BaseClass;
import Com.Actitime.Generics.FWUtills;
import Com.Actitime.ObjectRepository.HomePage;
import Com.Actitime.ObjectRepository.LoginPage;

public class TestLoginPage1 extends BaseClass
{
	@Test
	public void validLogin()
	{
		String un = FWUtills.read_XL_Data(XL_DATA_PATH, "ValidLogin",1, 0);
		String pw = FWUtills.read_XL_Data(XL_DATA_PATH, "ValidLogin",1,1);
		String expTitle = FWUtills.read_XL_Data(XL_DATA_PATH, "HomePage", 1, 2);
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(un);
		lp.setPassWord(pw);
		lp.clickCheckBox();
		lp.clickLoginBtn();
		HomePage hp=new HomePage(driver);
		FWUtills.verifyTitleOfHomePage(driver, expTitle);
	}

}
