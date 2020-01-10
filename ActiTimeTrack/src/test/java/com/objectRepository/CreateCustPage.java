package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCustPage 
{
	@FindBy(xpath="//label[text()='Add more customers']")
	   private WebElement addMoreCustChBox;
		
		@FindBy(xpath="//td[contains(.,'Customer Name:')]/../td/input")
		private WebElement custNameTextBox;
		
		@FindBy(xpath="//td[contains(.,'Customer Description:')]/../td/textarea")
		private WebElement custDescriptTextBox;
		
		@FindBy(xpath="//input[@name='createCustomerSubmit']")
		private WebElement submitBtn;
		
		public CreateCustPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		public void setUserName(String user)
		{
			custNameTextBox.sendKeys(user);
		}
		public void setUserDes(String des)
		{
			custDescriptTextBox.sendKeys(des);
		}
		public void clickOnSubBtn()
		{
			submitBtn.click();
		}
		public void clickAddMoreCustCHB()
		{
			addMoreCustChBox.click();
		}


}
