package com.scripts;

import org.testng.annotations.Test;

import com.generics.BaseClass;
import com.generics.FWUtills;
import com.objectRepository.HomePage;
import com.objectRepository.LoginPage;
import com.objectRepository.OpenTasksPage;
import com.objectRepository.TasksPage;

public class TestCreateTask extends BaseClass
{
	@Test
	public void createTask()
	{
		String user = FWUtills.read_XL_Data(XL_DATA,"validLogin" ,1,0);
		String pass = FWUtills.read_XL_Data(XL_DATA,"validLogin" ,1,1);
		
		String expectedTitleH = FWUtills.read_XL_Data(XL_DATA,"HomePage" ,1,2);
		String expectedTitleTS = FWUtills.read_XL_Data(XL_DATA,"TasksPage" ,1,0);
		int projectCount = FWUtills.count_XL_DataRows(XL_DATA,"ProjectPage");
		String expTitleTask = FWUtills.read_XL_Data(XL_DATA, "TaskPage",1,3);
		 int tpCount = FWUtills.count_XL_DataRows(XL_DATA,"TaskPage");
		LoginPage lp = new LoginPage(driver);
		lp.setUser(user);
		lp.setPass(pass);
		lp.clickOnLogin();
		FWUtills.verifiePage(driver, expectedTitleH);
		
		HomePage hp = new HomePage(driver);
		hp.clickOnTasks();
		FWUtills.verifiePage(driver, expectedTitleTS);
		
		TasksPage tp = new TasksPage(driver);
		tp.clickOnOpenTasks();
		
		 OpenTasksPage otp = new OpenTasksPage(driver);
		 
		 for(int i=1;i<=tpCount;i++)
		 {
			 otp.clickOnCreateTasks();
			String cn = FWUtills.read_XL_Data(XL_DATA,"ProjectPage",i,0);
			String pn = FWUtills.read_XL_Data(XL_DATA,"ProjectPage",i,1);
			String tn = FWUtills.read_XL_Data(XL_DATA,"TaskPage",i,0);
			String td = FWUtills.read_XL_Data(XL_DATA,"TaskPage",i,1);
			otp.selectCustomerName(cn);
			otp.selectProjectName(pn);
			otp.enterTaskData(tn);
			otp.enterTskDes(td);
			//otp.selectPayment(pay);
			otp.selectTimeTrackCBox();
			otp.ClickOnSubmitBtn();
			
			
		 }
		
	}

}
