package Com.Actitime.Scripts;

import org.testng.annotations.Test;

import Com.Actitime.Generics.BaseClass;
import Com.Actitime.Generics.FWUtills;
import Com.Actitime.ObjectRepository.CreateNewCustomerPage;
import Com.Actitime.ObjectRepository.HomePage;
import Com.Actitime.ObjectRepository.LoginPage;
import Com.Actitime.ObjectRepository.ProjectAndCutometPage;
import Com.Actitime.ObjectRepository.TasksPage;

public class TestCreasteNewCustPage extends BaseClass
{
	@Test
	public void createNewCustomer()
	{
		String un = FWUtills.read_XL_Data(XL_DATA_PATH,"ValidLogin",1,0);
		String pw = FWUtills.read_XL_Data(XL_DATA_PATH, "ValidLogin",1, 1);
		String expTitleHome = FWUtills.read_XL_Data(XL_DATA_PATH,"HomePage",1,2);
		String expTitleTasks = FWUtills.read_XL_Data(XL_DATA_PATH, "OpenTasks",1,0);
        String expTitlePA = FWUtills.read_XL_Data(XL_DATA_PATH,"ProjectAndCust",1,0);
        int custdata = FWUtills.read_XL_RowCount(XL_DATA_PATH, "Customers");
        String expTitleCust = FWUtills.read_XL_Data(XL_DATA_PATH, "Customers",1, 1);
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(un);
		lp.setPassWord(pw);
		lp.clickCheckBox();
		lp.clickLoginBtn();
		
		HomePage hp = new HomePage(driver);
		FWUtills.verifyTitleOfHomePage(driver, expTitleHome);
		hp.clickOnTasks();
		
		TasksPage tp = new TasksPage(driver);
		FWUtills.verifyTitleOfHomePage(driver, expTitleTasks);
		tp.clickOnProjectandCust();
		
	     ProjectAndCutometPage pap = new ProjectAndCutometPage(driver);
		FWUtills.verifyTitleOfHomePage(driver, expTitlePA);
		pap.clickOnCustBtn();
		
		CreateNewCustomerPage cncp = new CreateNewCustomerPage(driver);
		FWUtills.verifyTitleOfHomePage(driver, expTitleCust);
		System.out.println("Number of Rows in the Data are===>"+custdata );
		for(int i=1;i<=custdata;i++)
		{
			String user = FWUtills.read_XL_Data(XL_DATA_PATH,"Customers",i, 0);
			cncp.setUserName(user);
			cncp.clickAddMoreCustCHB();
			cncp.clickOnSubBtn();
		}
		
		
	}

}
