package Com.Actitime.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage
{
	@FindBy(xpath="//input[@value='Create New User']")
	private WebElement newUserBtn;
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement userNameTextBox;
	
	@FindBy(xpath="//input[@name='passwordText']")
	private WebElement passTextBox;
	
	@FindBy(xpath="//input[@name='passwordTextRetype']")
	private WebElement passRetypeTextBox;
	
	@FindBy(xpath="//label[contains(.,'Time-Track of Other Users')]/../../td[1]/input")
	private WebElement timeTrackOthersChBox;
	
	@FindBy(xpath="//label[contains(.,'Projects')]/../../td[1]/input")
	private WebElement custAndProjectsCheckBox;
	
	@FindBy(xpath="//input[@name='firstName']")
	private WebElement userFnameTextBox;
	
	@FindBy(xpath="//input[@name='lastName']")
	private WebElement uLastNameTextBox;
	
	@FindBy(xpath="//label[text()='Enter Time-Track']/../../td[1]/input")
	private WebElement timeTrackCheckBox;
	
	@FindBy(xpath="//label[contains(.,'Tasks')]/../../td[1]/input")
	private WebElement managetskChBox;
	
	@FindBy(xpath="//label[contains(.,'Manage Users')]/../../td[1]/input")
	private WebElement manageusersChBox;
	
	@FindBy(xpath="//label[contains(.,'Manage General')]/../../td[1]/input")
	private WebElement manageGenralSettChBox;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement subBtn;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logouBtn;
	 
	public UsersPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void clickOnNewUserBtn()
	{
		newUserBtn.click();
	}
	public void enterUserName(String name)
	{
		userNameTextBox.sendKeys(name);
	}
	public void enterPass(String pass)
	{
		passTextBox.sendKeys(pass);
	}
	public void enterRetypePass(String ret)
	{
		passRetypeTextBox.sendKeys(ret);
	}
	public void enterFnam(String fname)
	{
		userFnameTextBox.sendKeys(fname);
	}
	public void enterLastName(String lname)
	{
		uLastNameTextBox.sendKeys(lname);
	}
	public void selectTimetrackChBox()
	{
		timeTrackCheckBox.click();
	}
	public void selectTimeTraOtherChBox()
	{
		timeTrackOthersChBox.click();
	}
	public void selectManageCustProCheckBox()
	{
		managetskChBox.click();
	}
	public void selectManageTaskChBox()
	{
		manageusersChBox.click();
	}
	public  void selectCustandManageCh()
	{
	custAndProjectsCheckBox.click();
	}
	public  void selectManageGenCh()
	{
		manageGenralSettChBox.click();
	}
	public void clickOnSubBtn()
	{
		subBtn.click();
	}
	public void clickOnLogout()
	{
		logouBtn.click();
	}

}
