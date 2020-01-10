package Com.Actitime.Scripts;


import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Com.Actitime.Generics.BaseClass;
import Com.Actitime.Generics.FWUtills;
import Com.Actitime.ObjectRepository.CreateLinkPage;
import Com.Actitime.ObjectRepository.LoginPage;

public class TestActiLinkTextPage extends BaseClass
{
	@Test
	public void testActiLink() throws InterruptedException 
	{
		String expTitleLink = FWUtills.read_XL_Data(XL_DATA_PATH, "ActiMind",1,0);
		LoginPage lp = new LoginPage(driver);
	    lp.clickOnActiLinkText(driver);
        Set<String> pwh = driver.getWindowHandles();
        int count = pwh.size();
        Thread.sleep(3000);
        System.out.println("*Number of The Browsers are*"+count);
        for(String w:pwh)
        {
        	driver.switchTo().window(w);
        	String title = driver.getTitle();
        	if(title.contains("Actimind – Custom Software Development"))
        	{
        		FWUtills.verifyTitleOfHomePage(driver, expTitleLink);
        		CreateLinkPage cl = new CreateLinkPage(driver);
        		   cl.clickOnAreaLink(driver);
        		   cl.clickOnWebLink();
        		   cl.scrollTo(driver);

        	}
        }	 
	   	
	}

}
