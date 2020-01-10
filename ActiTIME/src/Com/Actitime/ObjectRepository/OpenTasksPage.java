package Com.Actitime.ObjectRepository;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OpenTasksPage 
{
	@FindBy(xpath="//input[@value='Create New Tasks']")
	private WebElement createTaskbtn;
	
	@FindBy(xpath="//td[contains(.,'Customer:')]/../td/select")
	private WebElement custTextBox;
	
	@FindBy(xpath="//td[contains(.,'Project')]/../td/select")
	private WebElement projectTextBox;
	
	@FindBy(xpath="//input[@name='task[0].name']")
	private WebElement taskName;
	
	@FindBy(xpath="//input[@name='task[0].name']/../a")
	private WebElement taskDes;
	@FindBy(xpath="//input[@id='scbutton']")
	private WebElement desSubBtn;
	
	@FindBy(xpath="//input[@name='task[0].name']/../../td[2]/span/div/input")
	private WebElement taskEndDate;
	
	@FindBy(xpath="//input[@name='task[0].name']/../../td[3]/div/select")
	private WebElement payMent;
	
	@FindBy(xpath="//input[@name='task[0].name']/../../td[4]/input")
	private WebElement timeTrack;
	
	@FindBy(xpath="//input[@value='Create Tasks']")
	private WebElement submitBtn;
	
	public OpenTasksPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void clickOnCreateTasks()
	{
		createTaskbtn.click();
	}
	public void selectCustomerName(String sel)
	{
		Select s = new Select(custTextBox);
		s.selectByVisibleText(sel);
	}
	public void selectProjectName(String sp)
	{
		Select s = new Select(projectTextBox);
		s.selectByVisibleText(sp);
	}
	public void enterTaskData(String task)
	{
		taskName.sendKeys(task);
	}
	public void enterTskDes(String desc)
	{
		taskDes.sendKeys(Keys.ENTER,desc);
		desSubBtn.click();
	}
	
	public void selectEndDate(String date)
	{
		
		taskEndDate.sendKeys(date);
	}
	public void selectPayment(String pay)
	{
      Select s = new Select(payMent);
      s.selectByValue(pay);
	}
	public void selectTimeTrackCBox()
	{
		timeTrack.click();
	}
	public void ClickOnSubmitBtn()
	{
		submitBtn.click();
	}

}
