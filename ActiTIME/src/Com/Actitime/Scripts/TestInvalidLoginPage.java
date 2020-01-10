package Com.Actitime.Scripts;

import org.testng.annotations.Test;

import Com.Actitime.Generics.BaseClass;
import Com.Actitime.ObjectRepository.LoginPage;

public class TestInvalidLoginPage extends BaseClass
{
	@Test
	public void invalidLogin() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName("mahesh");
		lp.clickLoginBtn();
		lp.verifieError();
		Thread.sleep(2000);
		lp.setPassWord("manger");
		lp.clickLoginBtn();
		lp.verifieError();
	}

}
