package com.scripts;

import org.testng.annotations.Test;

import com.generics.BaseClass;
import com.generics.FWUtills;
import com.objectRepository.CreateCustPage;
import com.objectRepository.HomePage;
import com.objectRepository.LoginPage;
import com.objectRepository.ProjectAndCustPage;
import com.objectRepository.TasksPage;

public class TestCreateCustPage extends BaseClass 
{
	@Test
	public void createNewCust()
	{
		String user = FWUtills.read_XL_Data(XL_DATA,"validLogin" ,1,0);
		String pass = FWUtills.read_XL_Data(XL_DATA,"validLogin" ,1,1);
		
		String expectedTitleH = FWUtills.read_XL_Data(XL_DATA,"HomePage" ,1,2);
		String expectedTitleTS = FWUtills.read_XL_Data(XL_DATA,"TasksPage" ,1,0);
		String expectedTitlePCP = FWUtills.read_XL_Data(XL_DATA,"Project&CustPage" ,1,0);
		String expectedTitleCP = FWUtills.read_XL_Data(XL_DATA,"CustPage" ,1,2);
          int custRow = FWUtills.count_XL_DataRows(XL_DATA,"CustPage");
		LoginPage lp = new LoginPage(driver);
		lp.setUser(user);
		lp.setPass(pass);
		lp.clickOnLogin();
		FWUtills.verifiePage(driver, expectedTitleH);
		
		HomePage hp = new HomePage(driver);
		hp.clickOnTasks();
		FWUtills.verifiePage(driver, expectedTitleTS);
		
		TasksPage tp = new TasksPage(driver);
		tp.clickOnProjectandCust();
		FWUtills.verifiePage(driver, expectedTitlePCP);
		
		ProjectAndCustPage pcp = new ProjectAndCustPage(driver);
		pcp.clickOnCustBtn();
		FWUtills.verifiePage(driver, expectedTitleCP);
		
		CreateCustPage ccp = new CreateCustPage(driver);
		for(int i=1;i<=custRow;i++)
		{
			String un = FWUtills.read_XL_Data(XL_DATA,"CustPage",i,0);
			String dis = FWUtills.read_XL_Data(XL_DATA,"CustPage",i,1);
			ccp.setUserName(un);
			ccp.setUserDes(dis);
			ccp.clickAddMoreCustCHB();
			ccp.clickOnSubBtn();
		}
	}

}
