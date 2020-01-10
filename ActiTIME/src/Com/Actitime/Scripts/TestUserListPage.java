package Com.Actitime.Scripts;

import org.testng.annotations.Test;

import Com.Actitime.Generics.BaseClass;
import Com.Actitime.Generics.FWUtills;
import Com.Actitime.ObjectRepository.HomePage;
import Com.Actitime.ObjectRepository.LoginPage;
import Com.Actitime.ObjectRepository.UsersPage;

public class TestUserListPage extends BaseClass
{
	@Test
	public void createManager()
	{
		String un = FWUtills.read_XL_Data(XL_DATA_PATH,"ValidLogin",1,0);
		String pw = FWUtills.read_XL_Data(XL_DATA_PATH, "ValidLogin",1, 1);
		String expTitleHome = FWUtills.read_XL_Data(XL_DATA_PATH,"HomePage",1,2);
		String expTitleUL = FWUtills.read_XL_Data(XL_DATA_PATH,"UserList",1, 0);
		String expTitleCU = FWUtills.read_XL_Data(XL_DATA_PATH,"CreateUser",1, 4);
		int usersData = FWUtills.read_XL_RowCount(XL_DATA_PATH, "CreateUser");
		LoginPage lp = new LoginPage(driver);
	    lp.setUserName(un);
	    lp.setPassWord(pw);
	    lp.clickCheckBox();
	    lp.clickLoginBtn();
	    
	    HomePage hp = new HomePage(driver);
	    FWUtills.verifyTitleOfHomePage(driver, expTitleHome);
	    hp.clickOnUsers();
	    
	    UsersPage up = new UsersPage(driver);
	    FWUtills.verifyTitleOfHomePage(driver, expTitleUL);
	 
	    for(int i=1;i<=usersData;i++)
	    {
	        up.clickOnNewUserBtn();
	   	    FWUtills.verifyTitleOfHomePage(driver, expTitleCU);
	    	 String user=FWUtills.read_XL_Data(XL_DATA_PATH,"CreateUser",i,0);
	    	 String pass = FWUtills.read_XL_Data(XL_DATA_PATH,"CreateUser",i,1);
	    	 String Fname = FWUtills.read_XL_Data(XL_DATA_PATH,"CreateUser",i,2);
	       	String Lname = FWUtills.read_XL_Data(XL_DATA_PATH,"CreateUser",i,3);
	    	up.enterUserName(user);
	    	up.enterPass(pass);
	    	up.enterRetypePass(pass);
	    	up.enterFnam(Fname);
	    	up.enterLastName(Lname);
	    	up.selectCustandManageCh();
	    	up.selectManageCustProCheckBox();
	    	up.selectManageGenCh();
	    	up.selectManageTaskChBox();
	    	up.selectTimetrackChBox();
	    	up.selectTimeTraOtherChBox();
	    	up.clickOnSubBtn();
	    }
	
	}

}
