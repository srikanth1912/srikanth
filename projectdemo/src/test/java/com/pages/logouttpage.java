package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logouttpage {
public WebDriver ldriver;

	
	public logouttpage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
    }

	@FindBy(xpath="/html/body/div/div[1]/div/div[3]/div")
	WebElement item;
	
	@FindBy(id="logout_sidebar_link")
	WebElement logoutbtn;
	
	public void menu() {
		 item.click();
		 System.out.println("menu is clicked");
	 }
	 public void logout() {
		 logoutbtn.click();
		 System.out.println("logout is clicked");
	 }
	

}
