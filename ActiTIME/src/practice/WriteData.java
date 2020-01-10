package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WriteData
{
	/*@Test
	public void validLogin()
	{
		FWUtills.write_Xl_DATA("sheet1",3,0,"mahesh babu");
	}
*/
	public static WebDriver driver;
	@BeforeClass
	public void setDRiver()
	{
	
	
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	    System.out.println("***its From before Class********");
	}
	@BeforeMethod
	public void launchbrowser()
	{
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	System.out.println("****its From before method***");	
	}
	@Test
	public void login() throws InterruptedException
	{ 
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
	    driver.findElement(By.name("pwd")).sendKeys("hello");
	    driver.findElement(By.xpath("//div[text()='Login ']")).click();
	    WebElement errMsg = driver.findElement(By.xpath("//span[contains(.,'invalid.')]"));    
	    Assert.assertTrue(errMsg.isDisplayed());
	    System.out.println("***Error message is Displayed**"+errMsg.getAttribute("textContent"));
	
	}
	@AfterMethod
	public void closeApp()
	{
		driver.close();
	}


}
