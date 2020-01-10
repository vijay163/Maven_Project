package Com.Actitime.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePage
{
	@FindBy(xpath="//div[text()='Time-Track']/../div/img")
	private WebElement timeTrackTab;

	@FindBy(xpath="//div[text()='Tasks']/../img")
	private WebElement tasksTab;
	
	@FindBy(xpath="//div[text()='Reports']/../img")
	private WebElement reportsTab;
	
	@FindBy(xpath="//div[text()='Users']/../img")
	private WebElement usersTab;
	
	@FindBy(xpath="//div[text()='Work Schedule']/../img")
	private WebElement workScheduleTab;
	
	@FindBy(xpath="//div[text()='Settings']/../img")
	private WebElement settingTab;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnTimeTrack()
	{
		timeTrackTab.click();
	}
   public void clickOnTasks()
   {
	   tasksTab.click();
   }
   public void clickOnReports()
   {
	   reportsTab.click();
   }
   public void clickOnUsers()
   {
	   usersTab.click();
   }
   public void clickOnWorkScheduleTab()
   {
	   workScheduleTab.click();
   }
   public void clickOnSettings()
   {
	   settingTab.click();
   }
  
}
