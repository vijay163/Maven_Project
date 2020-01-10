package Com.Actitime.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateProjectUnderCust 
{

	
	@FindBy(xpath="//td[contains(.,'Customer:')]/../td[3]/../td[4]/select")
	private WebElement selectCust;
	
	@FindBy(xpath="//td[contains(.,'Project Name:')]/../td/input")
	private WebElement projectNameTextBox;
	
	@FindBy(xpath="//td[contains(.,'Project Description:')]/../td/textarea")
	private WebElement descriptionTextBox;

	@FindBy(xpath="//input[@name='createProjectSubmit']")
	private WebElement submitBtn;
	@FindBy(xpath="//label[text()='Add more projects']")
	private WebElement addMoreProChBox;
	
	public CreateProjectUnderCust(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void selectCust(String sel)
	{
		Select s = new Select(selectCust);
	    s.selectByVisibleText(sel);
	}
	public void clickOnProjectNameTextBox(String name)
	{
		projectNameTextBox.sendKeys(name);
	}
	public void clickOnProDesTextBox(String des)
	{
		descriptionTextBox.sendKeys(des);
	}
	public void clickOnSubmitBtn()
	{
		submitBtn.click();
	}
	public void clickAddMoreProCHBox()
	{
		addMoreProChBox.click();
	}
}
