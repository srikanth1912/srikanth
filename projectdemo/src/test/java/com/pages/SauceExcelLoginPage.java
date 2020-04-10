package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceExcelLoginPage {
WebDriver driver;
	
	
	@FindBy(id="user-name")
	WebElement Username;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[1]/div/form/input[3]")
	WebElement login;
	
	public SauceExcelLoginPage(WebDriver driver) throws IOException
	{
		PageFactory.initElements(driver, this);
		   this.driver = driver;
		}
		public void loginToApp_username(String userid)
		{
			Username.sendKeys(userid);	
			
		}
		public void loginToApp_password(String pass)
		{
			Password.sendKeys(pass);
			
		}
		
		
		public void loginToApp_Loginbtn()
		{
			login.click();
			
		}


}

