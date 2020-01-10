package com.scripts;

import org.testng.annotations.Test;

import com.generics.BaseClass;
import com.generics.FWUtills;
import com.objectRepository.CreateProjectPage;
import com.objectRepository.HomePage;
import com.objectRepository.LoginPage;
import com.objectRepository.ProjectAndCustPage;
import com.objectRepository.TasksPage;

public class TestCreateProject extends BaseClass
{
	@Test
	public void createProject()
	{
		String user = FWUtills.read_XL_Data(XL_DATA,"validLogin" ,1,0);
		String pass = FWUtills.read_XL_Data(XL_DATA,"validLogin" ,1,1);
		
		String expectedTitleH = FWUtills.read_XL_Data(XL_DATA,"HomePage" ,1,2);
		String expectedTitleTS = FWUtills.read_XL_Data(XL_DATA,"TasksPage" ,1,0);
		String expectedTitlePCP = FWUtills.read_XL_Data(XL_DATA,"Project&CustPage" ,1,0);
		String expectedTitlePP = FWUtills.read_XL_Data(XL_DATA,"ProjectPage" ,1,3);
		int projectCount = FWUtills.count_XL_DataRows(XL_DATA,"ProjectPage");
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
		pcp.clickOnProjects();
		FWUtills.verifiePage(driver, expectedTitlePP);
		
		CreateProjectPage cp = new CreateProjectPage(driver);
		for(int i=1;i<=projectCount;i++)
		{
			String cn = FWUtills.read_XL_Data(XL_DATA, "ProjectPage",i,0);
			String pn = FWUtills.read_XL_Data(XL_DATA, "ProjectPage",i,1);
			String Pdes = FWUtills.read_XL_Data(XL_DATA, "ProjectPage",i,2);
			cp.selectCust(cn);
			cp.clickOnProjectNameTextBox(pn);
			cp.clickOnProDesTextBox(Pdes);
			cp.clickAddMoreProCHBox();
			cp.clickOnSubmitBtn();
		
		}
		
		
	}

}
