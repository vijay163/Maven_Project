package Com.Actitime.ObjectRepository;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Actitime.Generics.FWUtills;

public class CreateLinkPage 
{
	@FindBy(xpath="//a[contains(.,'AREAS OF EXPERTISE')]")
	private WebElement areaLinkTab;
	
	@FindBy(xpath="//a[text()='Web Browser Plug-ins']")
	private WebElement webLink;
	
	@FindBy(xpath="//li[text()='Secure storage of user credentials.']")
	private WebElement textDes;
	
	public CreateLinkPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void clickOnAreaLink(WebDriver driver)
	{
		Actions a = FWUtills.actions(driver);
		a.moveToElement(areaLinkTab).perform();
	}
	public void clickOnWebLink()
	{
		webLink.click();
	}
	public void scrollTo(WebDriver driver)
	{ 
		int yAxis = textDes.getLocation().getY();
		JavascriptExecutor js = FWUtills.javaScriptScroll(driver);
		js.executeScript("windows.scrollTo(0,"+yAxis+")");
	}

}
