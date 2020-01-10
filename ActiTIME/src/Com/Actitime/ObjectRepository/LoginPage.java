package Com.Actitime.ObjectRepository;

import java.awt.Event;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage 
{
	@FindBy(xpath="//a[text()='Actimind Inc.']")
	private WebElement actiLinkText;
	
	@FindBy(name="username")
	private WebElement user;
	
	@FindBy(name="pwd")
	private WebElement pass;
	
	@FindBy(xpath="//a[@id='loginButton']")
	private WebElement loginBtn;
	
	@FindBy(xpath="//input[@value='Create New User']")
	private WebElement newUserBtn;
	
	@FindBy(xpath="//span[contains(.,'invalid.')]")
	private WebElement errMsg;
	
	@FindBy(xpath="//label[@id='keepLoggedInLabel']")
	private WebElement chechBox;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutBtn;
	 
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}	
	public void setUserName(String un)
	{
		user.clear();
		user.sendKeys(un);
	}
	public void setPassWord(String pw)
	{
		pass.sendKeys(pw);
	}
	public void clickLoginBtn()
	{
		loginBtn.click();
	}
	public void clickCheckBox()
	{
		chechBox.click();
	}
	public void verifieError()
	{
		Assert.assertTrue(errMsg.isDisplayed());
		System.out.println("the error message is=="+errMsg.getText());
	}
	public void clickOnLogoutBtn()
	{
		loginBtn.click();
	}
	public void clickOnLogout()
	{
		loginBtn.click();
	}

	public void clickOnActiLinkText(WebDriver driver)
	{

		Actions a = new Actions(driver);
		a.sendKeys(actiLinkText,Keys.ENTER).perform();
		try
		{
	    Robot r = new Robot();
		r.keyPress(KeyEvent.VK_T);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	

}
