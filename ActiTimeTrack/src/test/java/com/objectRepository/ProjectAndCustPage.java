package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectAndCustPage
{
	@FindBy(xpath="//input[@value='Create New Customer']")
	private WebElement createNewCustBtn;

	@FindBy(xpath="//input[@value='Create New Project']")
	private WebElement createNewProjectBtn;
	
	public ProjectAndCustPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void clickOnCustBtn()
	{
		createNewCustBtn.click();
	}
	public void clickOnProjects()
	{
		createNewProjectBtn.click();
	}


}
