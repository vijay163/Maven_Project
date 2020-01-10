package Com.Actitime.Scripts;

import org.testng.annotations.Test;

import Com.Actitime.Generics.BaseClass;
import Com.Actitime.Generics.FWUtills;
import Com.Actitime.ObjectRepository.CreateProjectUnderCust;
import Com.Actitime.ObjectRepository.HomePage;
import Com.Actitime.ObjectRepository.LoginPage;
import Com.Actitime.ObjectRepository.ProjectAndCutometPage;
import Com.Actitime.ObjectRepository.TasksPage;

public class TestCreateNewProjectPage extends BaseClass
{
	@Test
	public void createNewProject()
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
	pap.clickOnProjects();
	
	CreateProjectUnderCust cpc = new CreateProjectUnderCust(driver);
	FWUtills.verifyTitleOfHomePage(driver, expTitlePro);
	System.out.println("Number Rows had inserted data is==="+rowsCount);
	for(int i=1;i<=rowsCount;i++)
	{
		String cust = FWUtills.read_XL_Data(XL_DATA_PATH,"Customers",i,0);
		cpc.selectCust(cust);
		String pname = FWUtills.read_XL_Data(XL_DATA_PATH,"ProjectPage",i,0);
		cpc.clickOnProjectNameTextBox(pname);
		cpc.clickAddMoreProCHBox();
		cpc.clickOnSubmitBtn();
	}
    }
}