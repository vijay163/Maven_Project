package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	@FindBy(xpath="//input[@name='username']")
	private WebElement userTextBox;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passTextBox;
	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement loginBTn;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement checkBox;
	
	@FindBy(xpath="//span[contains(.,'try again.')]")
	private WebElement errMsg;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void setUser(String un)
	{
		userTextBox.clear();
		userTextBox.sendKeys(un);
	}
	public void setPass(String pw)
	{
		passTextBox.clear();
		passTextBox.sendKeys(pw);
	}
	public void clickOnLogin()
	{
		loginBTn.click();
	}
	public void clickOncheckB()
	{
		checkBox.click();
	}
	public void getErrMsg()
	{
		String msg = errMsg.getText();
		System.out.println(msg);
	}
}
