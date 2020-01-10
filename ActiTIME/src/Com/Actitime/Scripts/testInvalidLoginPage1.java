package Com.Actitime.Scripts;

import org.testng.annotations.Test;

import Com.Actitime.Generics.BaseClass;
import Com.Actitime.Generics.FWUtills;
import Com.Actitime.ObjectRepository.LoginPage;

public class testInvalidLoginPage1 extends BaseClass
{
	@Test
	public void InvalidLogin() throws InterruptedException
	{
		int totalRows = FWUtills.read_XL_RowCount(XL_DATA_PATH, "InvalidLogin");
		System.out.println("Number of Invalid data Rows are===="+totalRows);
		for(int i=1;i<=totalRows;i++)
		{
			String un = FWUtills.read_XL_Data(XL_DATA_PATH, "InvalidLogin",i, 0);
			String pw = FWUtills.read_XL_Data(XL_DATA_PATH, "InvalidLogin",i,1);
			LoginPage lp = new LoginPage(driver);
		    lp.setUserName(un);
		    lp.setPassWord(pw);
		    lp.clickLoginBtn();
		    Thread.sleep(2000);
		    lp.verifieError();
		
		
		}
	}

}
