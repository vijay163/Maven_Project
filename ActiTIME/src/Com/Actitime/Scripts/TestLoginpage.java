package Com.Actitime.Scripts;


import org.testng.annotations.Test;

import Com.Actitime.Generics.BaseClass;
import Com.Actitime.ObjectRepository.HomePage;
import Com.Actitime.ObjectRepository.LoginPage;
import Com.Actitime.ObjectRepository.UsersPage;

public class TestLoginpage extends BaseClass
{
	@Test
	public void validLogin() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName("admin");
		lp.setPassWord("manager");
		lp.clickCheckBox();
		lp.clickLoginBtn();
		HomePage hp=new HomePage(driver);
		Thread.sleep(2000);
		//hp.clickOnTasks();
		hp.clickOnUsers();
	/*	TasksPage tp=new TasksPage(driver);
		tp.clickOnProjectandCust();
		ProjectandCustomersPage pc=new ProjectandCustomersPage(driver);
		pc.clickOnCustBtn();
		pc.setUserName("harish sanker");
		Thread.sleep(3000);
		pc.setUserDes("he is telugu popular singer");
		Thread.sleep(3000);
		pc.clickOnSubBtn();
		CreateProjectUnderCust cp = new CreateProjectUnderCust(driver);
		cp.clickOnProjects();
		Thread.sleep(2000);
		cp.selectCust("2");
		cp.clickOnProjectNameTextBox("RRR");
		Thread.sleep(2000);
		cp.clickOnProDesTextBox("its a prestagious project");
		cp.clickOnSubmitBtn();
	OpenTasksPage tp=new OpenTasksPage(driver);
	tp.clickOnCreateTasks();
	Thread.sleep(2000);
	tp.selectCustomerName("harish sanker");
	Thread.sleep(1000);
	tp.selectProjectName("RRR");	
	Thread.sleep(1000);
	tp.enterTaskData("2021 bigest hit movie");
	Thread.sleep(2000);
	tp.enterTskDes("its a rajamouli directed movie");
	Thread.sleep(3000);
	tp.selectEndDate("Jan 21,2020");
 Thread.sleep(2000);
	tp.selectPayment("1");
	Thread.sleep(1000);
	tp.selectTimeTrackCBox();
	Thread.sleep(2000);
	tp.ClickOnSubmitBtn();
	*/UsersPage up = new UsersPage(driver);
	up.clickOnNewUserBtn();
	Thread.sleep(1000);
	up.enterUserName("rakesh");
	Thread.sleep(1000);
	up.enterPass("reddy");
	Thread.sleep(1000);
	up.enterRetypePass("reddy");
	Thread.sleep(1000);
	Thread.sleep(1000);
	up.enterFnam("chari");
	Thread.sleep(1000);
	up.enterLastName("rakesh");
	up.selectManageCustProCheckBox();
	Thread.sleep(1000);
	up.selectManageGenCh();
	Thread.sleep(1000);
	up.selectCustandManageCh();
	Thread.sleep(1000);
	up.selectManageTaskChBox();
	Thread.sleep(1000);
	up.selectTimetrackChBox();
	up.selectTimeTraOtherChBox();
	Thread.sleep(2000);
	up.clickOnSubBtn();
	
	}

}
