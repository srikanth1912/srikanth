package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpager {
public WebDriver ldriver;

	
	public Loginpager(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
    }
	
	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[1]/div/form/input[3]")
	WebElement loginbtn;
	
	
	
	
	public void setUserName(String uname)
	{
		username.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
	     password.sendKeys(pwd);
	}
	
	
	public void clickSubmit()
	{
		loginbtn.click();
	}	
	
	
}

