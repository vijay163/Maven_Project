package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class internet 
{
	static
	{
		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
    @Test
    public void launchBrowser() throws AWTException, InterruptedException
    {
    	WebDriver driver = new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	driver.manage().window().maximize();
 
    	driver.get("http://localhost/login.do");
    	WebElement link = driver.findElement(By.xpath("//a[text()='Actimind Inc.']"));
       Actions a = new Actions(driver);
      // a.sendKeys(link,Keys.ENTER).perform();
       a.click().click(link).perform();
       Robot r = new Robot();
       Thread.sleep(2000);
       r.keyPress(KeyEvent.VK_WINDOWS);
    
    }
}
