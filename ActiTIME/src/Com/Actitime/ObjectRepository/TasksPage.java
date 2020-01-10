package Com.Actitime.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksPage 
{
	@FindBy(xpath="//a[text()='Open Tasks']")
	private WebElement openTasks;
	
	@FindBy(xpath="//a[text()='Completed Tasks']")
	private WebElement completeTasks;
	
	@FindBy(xpath="//a[text()='Projects & Customers']")
	private WebElement ProjectandCustTab;
	
	@FindBy(xpath="//a[text()='Archives']")
	private WebElement archivesTab;
	
	public TasksPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
   public void clickOnOpenTasks()
   {
	openTasks.click();
	
  }
   public void clickOnComplTasks()
   {
	   completeTasks.click();
   }
   public void clickOnProjectandCust()
   {
	   ProjectandCustTab.click();
   }
   public void clickOnArchives()
   {
	   archivesTab.click();
   }

}
