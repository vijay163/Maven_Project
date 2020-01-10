package Com.Actitime.Generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

abstract public class BaseClass implements IAutoConstant
{
	static
	{
		System.setProperty(CHROME_KEY,CHROME_VALUE);
		System.setProperty(GECKO_KEY,GECKO_VALUE);
		System.setProperty(IE_KEY,IE_VALUE);
		
	}
	 public static int passCount=0,failCount=0;
	public static   WebDriver driver;
	@BeforeClass
    @Parameters("browser")
	public void browser(String browser)
	{
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			driver=new InternetExplorerDriver();
		}
	}
	@BeforeMethod
	public void openApp()
	{
		driver.manage().timeouts().implicitlyWait(ITO,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(PLTO,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(URL);
		
	}
	@AfterMethod
	public void closeAppBrower(ITestResult res)
	{
		String testname = res.getName();
		int status = res.getStatus();
		if(status==1)
		{
			passCount++;
			System.out.println("PassCount is===="+passCount);
		}
		else
		{
			failCount++;
			String pp=PHOTO_PATH+testname+".png";
			FWUtills.takeScreenShot(driver,pp);
		}
		driver.quit();
	}

}
