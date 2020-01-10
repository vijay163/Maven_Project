package Com.Actitime.Scripts;

import org.testng.annotations.Test;

import Com.Actitime.Generics.BaseClass;
import Com.Actitime.Generics.FWUtills;
import Com.Actitime.ObjectRepository.HomePage;
import Com.Actitime.ObjectRepository.LoginPage;
import Com.Actitime.ObjectRepository.OpenTasksPage;
import Com.Actitime.ObjectRepository.TasksPage;

public class TestAddTasksPage extends BaseClass
{
	@Test
	public void addTaskToCust()
	{
		String un = FWUtills.read_XL_Data(XL_DATA_PATH,"ValidLogin",1,0);
		String pw = FWUtills.read_XL_Data(XL_DATA_PATH, "ValidLogin",1, 1);
		String expTitleHome = FWUtills.read_XL_Data(XL_DATA_PATH,"HomePage",1,2);
		String expTitleTasks = FWUtills.read_XL_Data(XL_DATA_PATH, "OpenTasks",1,0);
	    String expTitlePA = FWUtills.read_XL_Data(XL_DATA_PATH,"ProjectAndCust",1,0);
	    int custdata = FWUtills.read_XL_RowCount(XL_DATA_PATH, "Customers");
	    String expTitleCust = FWUtills.read_XL_Data(XL_DATA_PATH, "Customers",1, 1);
	   String expTitlePro = FWUtills.read_XL_Data(XL_DATA_PATH,"ProjectPage",1,1);
	   int rowsCount = FWUtills.read_XL_RowCount(XL_DATA_PATH, "ProjectPage");
	  String expTitleOt = FWUtills.read_XL_Data(XL_DATA_PATH,"CreateTasks",1,3);
	 int taskRowCount = FWUtills.read_XL_RowCount(XL_DATA_PATH, "CreateTasks");
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
		tp.clickOnOpenTasks();
		
		OpenTasksPage otp = new OpenTasksPage(driver);
		for(int i=1;i<=taskRowCount;i++)
		{
			otp.clickOnCreateTasks();
			FWUtills.verifyTitleOfHomePage(driver, expTitleOt);
			String cust = FWUtills.read_XL_Data(XL_DATA_PATH,"Customers",i,0);
			otp.selectCustomerName(cust);
			String pr = FWUtills.read_XL_Data(XL_DATA_PATH,"ProjectPage",i,0);
			otp.selectProjectName(pr);
			String pn = FWUtills.read_XL_Data(XL_DATA_PATH,"CreateTasks",i,0);
			otp.enterTaskData(pn);
			String pd = FWUtills.read_XL_Data(XL_DATA_PATH,"CreateTasks",i,1);
			otp.enterTskDes(pd);
			String date = FWUtills.read_XL_Data(XL_DATA_PATH,"CreateTasks",i,2);
			otp.selectEndDate(date);
			/*String pay = FWUtills.read_XL_Data(XL_DATA_PATH,"CreateTasks",i,4);
		    otp.selectPayment(pay);
		    */otp.selectTimeTrackCBox();
		    otp.ClickOnSubmitBtn();
		
		}
		

	}

}
